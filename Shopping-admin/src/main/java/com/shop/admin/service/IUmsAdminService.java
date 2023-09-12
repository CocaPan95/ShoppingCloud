package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.api.CommonResult;
import com.shop.model.dto.UmsAdminParam;
import com.shop.model.dto.UpdateAdminPasswordParam;
import com.shop.model.dto.UserDto;
import com.shop.model.entity.UmsAdmin;
import com.shop.model.entity.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-04
 */
public interface IUmsAdminService extends IService<UmsAdmin> {
    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);
    UmsAdmin getAdminByUsername(String username);
    UserDto loadUserByUsername(String username);
    List<UmsRole> getRoleList(Long adminId);
    CommonResult login(String username, String password);
    UmsAdminCacheService getCacheService();

    Page<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);
    /**
     * 根据用户id获取用户
     */
    UmsAdmin getItem(Long id);
    /**
     * 修改用户角色关系
     */
    @Transactional
    int updateRole(Long adminId, List<Long> roleIds);
    int update(Long id, UmsAdmin admin);
    /**
     * 修改密码
     */
    int updatePassword(UpdateAdminPasswordParam updatePasswordParam);

    /**
     * 删除指定用户
     */
    int delete(Long id);
    /**
     * 获取当前登录后台用户
     */
    UmsAdmin getCurrentAdmin();

}
