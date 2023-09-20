package com.shop.admin.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.BCrypt;
import cn.hutool.extra.spring.SpringUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.service.AuthService;
import com.shop.admin.service.IUmsAdminService;
import com.shop.admin.service.IUmsRoleService;
import com.shop.admin.service.UmsAdminCacheService;
import com.shop.common.constant.AuthConstant;
import com.shop.common.exception.Asserts;
import com.shop.model.api.CommonResult;
import com.shop.model.api.ResultCode;
import com.shop.model.dto.UmsAdminParam;
import com.shop.model.dto.UpdateAdminPasswordParam;
import com.shop.model.dto.UserDto;
import com.shop.model.entity.UmsAdmin;
import com.shop.model.entity.UmsAdminRoleRelation;
import com.shop.model.entity.UmsRole;
import com.shop.model.mapper.UmsAdminMapper;
import com.shop.model.mapper.UmsAdminRoleRelationMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-04
 */
@Service
public class UmsAdminServiceImpl extends ServiceImpl<UmsAdminMapper, UmsAdmin> implements IUmsAdminService {

    @Autowired
    private IUmsRoleService roleService;

    @Autowired
    private AuthService authService;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private UmsAdminRoleRelationMapper adminRoleRelationMapper;

    @Override
    public UmsAdmin register(UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(LocalDateTime.now());
        umsAdmin.setStatus(1);
        //查询是否有相同用户名的用户
        LambdaQueryWrapper<UmsAdmin> adminLambdaQueryWrapper=new LambdaQueryWrapper<>();
        adminLambdaQueryWrapper.eq(UmsAdmin::getUsername,umsAdmin.getUsername());
        List<UmsAdmin> umsAdminList = baseMapper.selectList(adminLambdaQueryWrapper);
        if (umsAdminList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = BCrypt.hashpw(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        baseMapper.insert(umsAdmin);
        return umsAdmin;
    }

    @Override
    public List<UmsRole> getRoleList(Long adminId) {
        return baseMapper.getRoleList(adminId);
    }

    @Override
    public CommonResult login(String username, String password) {
        if(StrUtil.isEmpty(username)||StrUtil.isEmpty(password)){
            Asserts.fail("用户名或密码不能为空！");
        }
        Map<String, String> params = new HashMap<>();
        params.put("client_id", AuthConstant.ADMIN_CLIENT_ID);
        params.put("client_secret","123456");
        params.put("grant_type","password");
        params.put("username",username);
        params.put("password",password);
        CommonResult restResult = authService.getAccessToken(params);
        if(ResultCode.SUCCESS.getCode()==restResult.getCode()&&restResult.getData()!=null){
//            updateLoginTimeByUsername(username);
            //  insertLoginLog(username);
        }
        return restResult;
    }

    @Override
    public UmsAdmin getCurrentAdmin() {
        String userStr = request.getHeader(AuthConstant.USER_TOKEN_HEADER);
        if(StrUtil.isEmpty(userStr)){
            Asserts.fail(ResultCode.UNAUTHORIZED);
        }
        UserDto userDto = JSONUtil.toBean(userStr, UserDto.class);
        UmsAdmin admin = getCacheService().getAdmin(userDto.getId());
        if(admin!=null){
            return admin;
        }else{
            admin = baseMapper.selectById(userDto.getId());
            getCacheService().setAdmin(admin);
            return admin;
        }
    }
    @Override
    public UserDto loadUserByUsername(String username) {
        //获取用户信息
        UmsAdmin admin = getAdminByUsername(username);
        if (admin != null) {
            List<UmsRole> roleList = baseMapper.getRoleList(admin.getId());
            UserDto userDTO = new UserDto();
            BeanUtils.copyProperties(admin, userDTO);
            if (CollUtil.isNotEmpty(roleList)) {
                List<String> roleStrList = roleList.stream().map(item -> item.getId() + "_" + item.getName()).collect(Collectors.toList());
                userDTO.setRoles(roleStrList);
            }
            return userDTO;
        }
        return null;
    }

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        LambdaQueryWrapper<UmsAdmin> wrapper = new LambdaQueryWrapper<UmsAdmin>();
        wrapper.eq(UmsAdmin::getUsername, username);
        List<UmsAdmin> adminList = baseMapper.selectList(wrapper);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }
    @Override
    public Page<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum) {
        Page<UmsAdmin> page=new Page<>(pageNum,pageSize);
        LambdaQueryWrapper<UmsAdmin> adminLambdaQueryWrapper=new LambdaQueryWrapper<>();
        if (!StringUtils.isEmpty(keyword)) {
            adminLambdaQueryWrapper.like(UmsAdmin::getUsername,keyword);
            adminLambdaQueryWrapper.or().like(UmsAdmin::getNickName,keyword);
        }
        return baseMapper.selectPage(page,adminLambdaQueryWrapper);
    }
    @Override
    public UmsAdmin getItem(Long id) {
        return baseMapper.selectById(id);
    }
    @Override
    public int update(Long id, UmsAdmin admin) {
        admin.setId(id);
        UmsAdmin rawAdmin = baseMapper.selectById(id);
        if(rawAdmin.getPassword().equals(admin.getPassword())){
            //与原加密密码相同的不需要修改
            admin.setPassword(null);
        }else{
            //与原加密密码不同的需要加密修改
            if(StrUtil.isEmpty(admin.getPassword())){
                admin.setPassword(null);
            }else{
                admin.setPassword(BCrypt.hashpw(admin.getPassword()));
            }
        }
        int count = baseMapper.updateById(admin);
        getCacheService().delAdmin(id);
        return count;
    }

    @Override
    public int updatePassword(UpdateAdminPasswordParam param) {
        if(StrUtil.isEmpty(param.getUsername())
                ||StrUtil.isEmpty(param.getOldPassword())
                ||StrUtil.isEmpty(param.getNewPassword())){
            return -1;
        }
        LambdaQueryWrapper<UmsAdmin> adminLambdaQueryWrapper=new LambdaQueryWrapper<>();
        adminLambdaQueryWrapper.eq(UmsAdmin::getUsername,param.getUsername());
        List<UmsAdmin> adminList = baseMapper.selectList(adminLambdaQueryWrapper);
        if(CollUtil.isEmpty(adminList)){
            return -2;
        }
        UmsAdmin umsAdmin = adminList.get(0);
        if(!BCrypt.checkpw(param.getOldPassword(),umsAdmin.getPassword())){
            return -3;
        }
        umsAdmin.setPassword(BCrypt.hashpw(param.getNewPassword()));
        baseMapper.updateById(umsAdmin);
        getCacheService().delAdmin(umsAdmin.getId());
        return 1;
    }
    @Override
    public int delete(Long id) {
        int count = baseMapper.deleteById(id);
        getCacheService().delAdmin(id);
        return count;
    }

    @Override
    public int updateRole(Long adminId, List<Long> roleIds) {
        int count = roleIds == null ? 0 : roleIds.size();
        //先删除原来的关系
        LambdaQueryWrapper<UmsAdminRoleRelation> adminRoleRelationLambdaQueryWrapper=new LambdaQueryWrapper<>();
        adminRoleRelationLambdaQueryWrapper.eq(UmsAdminRoleRelation::getAdminId,adminId);
        adminRoleRelationMapper.delete(adminRoleRelationLambdaQueryWrapper);
        //建立新关系
        if (!CollectionUtils.isEmpty(roleIds)) {
            for (Long roleId : roleIds) {
                UmsAdminRoleRelation roleRelation = new UmsAdminRoleRelation();
                roleRelation.setAdminId(adminId);
                roleRelation.setRoleId(roleId);
                adminRoleRelationMapper.insert(roleRelation);
            }
        }
        return count;
    }
    @Override
    public UmsAdminCacheService getCacheService() {
        return SpringUtil.getBean(UmsAdminCacheService.class);
    }
}
