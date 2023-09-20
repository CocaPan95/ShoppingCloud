package com.shop.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.model.entity.UmsMenu;
import com.shop.model.entity.UmsResource;
import com.shop.model.entity.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台用户角色表 Mapper 接口
 * </p>
 *
 * @author coca
 * @since 2023-09-20
 */
public interface UmsRoleMapper extends BaseMapper<UmsRole> {
    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);
    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);
    /**
     * 根据角色ID获取资源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
