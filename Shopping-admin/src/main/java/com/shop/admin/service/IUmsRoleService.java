package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.entity.UmsMenu;
import com.shop.model.entity.UmsResource;
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
    int create(UmsRole role);
    int update(Long id, UmsRole role);
    int delete(List<Long> ids);
    List<UmsMenu> getMenuList(Long adminId);
    List<UmsMenu> listMenu(Long roleId);
    List<UmsResource> listResource(Long roleId);
    int allocMenu(Long roleId, List<Long> menuIds);
    int allocResource(Long roleId, List<Long> resourceIds);
    Page<UmsRole> list(String keyword, Integer pageSize, Integer pageNum);

}
