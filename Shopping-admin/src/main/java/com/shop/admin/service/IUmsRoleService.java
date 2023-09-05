package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.entity.UmsRole;

import java.util.List;

/**
 * <p>
 * 后台用户角色表 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
public interface IUmsRoleService extends IService<UmsRole> {
    List<UmsRole> getRoleList(Long adminId);
}
