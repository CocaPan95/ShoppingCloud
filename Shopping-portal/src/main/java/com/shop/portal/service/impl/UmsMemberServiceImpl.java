package com.shop.portal.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.BCrypt;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.common.constant.AuthConstant;
import com.shop.common.exception.Asserts;
import com.shop.model.api.CommonResult;
import com.shop.model.api.ResultCode;
import com.shop.model.dto.UserDto;
import com.shop.model.entity.UmsMember;
import com.shop.model.mapper.UmsMemberMapper;
import com.shop.portal.service.AuthService;
import com.shop.portal.service.IUmsMemberService;
import com.shop.portal.service.UmsMemberCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.*;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-04
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements IUmsMemberService {

    @Autowired
    private AuthService authService;

    @Autowired
    private UmsMemberCacheService memberCacheService;
    @Autowired
    private HttpServletRequest request;


    @Override
    public void register(String username, String password, String telephone, String authCode) {
        //验证验证码
        if(!verifyAuthCode(authCode,telephone)){
            Asserts.fail("验证码错误");
        }
        //查询是否已有该用户
        LambdaQueryWrapper<UmsMember> memberLambdaQueryWrapper=new LambdaQueryWrapper<>();
        memberLambdaQueryWrapper.eq(UmsMember::getUsername,username);
        memberLambdaQueryWrapper.or().like(UmsMember::getPhone,telephone);
        List<UmsMember> umsMembers = baseMapper.selectList(memberLambdaQueryWrapper);
        if (!CollectionUtils.isEmpty(umsMembers)) {
            Asserts.fail("该用户已经存在");
        }
        //没有该用户进行添加操作
        UmsMember umsMember = new UmsMember();
        umsMember.setUsername(username);
        umsMember.setPhone(telephone);
        umsMember.setPassword(BCrypt.hashpw(password));
        umsMember.setCreateTime(LocalDateTime.now());
        umsMember.setStatus(1);
        //获取默认会员等级并设置
//        UmsMemberLevelExample levelExample = new UmsMemberLevelExample();
//        levelExample.createCriteria().andDefaultStatusEqualTo(1);
//        List<UmsMemberLevel> memberLevelList = memberLevelMapper.selectByExample(levelExample);
//        if (!CollectionUtils.isEmpty(memberLevelList)) {
//            umsMember.setMemberLevelId(memberLevelList.get(0).getId());
//        }
        baseMapper.insert(umsMember);
        umsMember.setPassword(null);
    }

    @Override
    public void updatePassword(String telephone, String password, String authCode) {
        LambdaQueryWrapper<UmsMember> memberLambdaQueryWrapper=new LambdaQueryWrapper<>();
        memberLambdaQueryWrapper.eq(UmsMember::getPhone,telephone);
        List<UmsMember> memberList = baseMapper.selectList(memberLambdaQueryWrapper);
        if(CollectionUtils.isEmpty(memberList)){
            Asserts.fail("该账号不存在");
        }
        //验证验证码
        if(!verifyAuthCode(authCode,telephone)){
            Asserts.fail("验证码错误");
        }
        UmsMember umsMember = memberList.get(0);
        umsMember.setPassword(BCrypt.hashpw(password));
        baseMapper.updateById(umsMember);
        memberCacheService.delMember(umsMember.getId());
    }

    @Override
    public UmsMember getCurrentMember() {
        String userStr = request.getHeader(AuthConstant.USER_TOKEN_HEADER);
        if(StrUtil.isEmpty(userStr)){
            Asserts.fail(ResultCode.UNAUTHORIZED);
        }
        UserDto userDto = JSONUtil.toBean(userStr, UserDto.class);
        UmsMember member = memberCacheService.getMember(userDto.getId());
        if(member!=null){
            return member;
        }else{
            member = getById(userDto.getId());
            memberCacheService.setMember(member);
            return member;
        }
    }

    @Override
    public void updateIntegration(Long id, Integer integration) {
        UmsMember record=new UmsMember();
        record.setId(id);
        record.setIntegration(integration);
        baseMapper.updateById(record);
        memberCacheService.delMember(id);
    }

    @Override
    public String generateAuthCode(String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i=0;i<6;i++){
            sb.append(random.nextInt(10));
        }
        memberCacheService.setAuthCode(telephone,sb.toString());
        return sb.toString();
    }
    @Override
    public UserDto loadUserByUsername(String username) {
        UmsMember member = getByUsername(username);
        if (member != null) {
            UserDto userDto = new UserDto();
            BeanUtil.copyProperties(member, userDto);
            userDto.setRoles(CollUtil.toList("前台会员"));
            return userDto;
        }
        return null;
    }

    @Override
    public UmsMember getByUsername(String username) {
        LambdaQueryWrapper<UmsMember> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UmsMember::getUsername, username);
        List<UmsMember> memberList = baseMapper.selectList(wrapper);
        if (!CollectionUtils.isEmpty(memberList)) {
            return memberList.get(0);
        }
        return null;
    }

    @Override
    public CommonResult login(String username, String password) {
        if (StrUtil.isEmpty(username) || StrUtil.isEmpty(password)) {
            Asserts.fail("用户名或密码不能为空！");
        }
        Map<String, String> params = new HashMap<>();
        params.put("client_id", AuthConstant.PORTAL_CLIENT_ID);
        params.put("client_secret", "123456");
        params.put("grant_type", "password");
        params.put("username", username);
        params.put("password", password);
        return authService.getAccessToken(params);
    }


    //对输入的验证码进行校验
    private boolean verifyAuthCode(String authCode, String telephone){
        if(StringUtils.isEmpty(authCode)){
            return false;
        }
        String realAuthCode = memberCacheService.getAuthCode(telephone);
        return authCode.equals(realAuthCode);
    }
}
