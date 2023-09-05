package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.api.CommonResult;
import com.shop.model.dto.UserDto;
import com.shop.model.entity.UmsAdmin;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-04
 */
public interface IUmsAdminService extends IService<UmsAdmin> {
    UmsAdmin getAdminByUsername(String username);
    UserDto loadUserByUsername(String username);
    CommonResult login(String username, String password);
}
