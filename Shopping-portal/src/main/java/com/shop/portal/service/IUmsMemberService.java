package com.shop.portal.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.api.CommonResult;
import com.shop.model.dto.UserDto;
import com.shop.model.entity.UmsMember;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-04
 */
public interface IUmsMemberService extends IService<UmsMember> {
    UserDto loadUserByUsername(String username);
    UmsMember getByUsername(String username);
    CommonResult login(String username, String password);
}
