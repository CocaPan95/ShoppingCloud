package com.shop.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.service.IUmsResourceService;
import com.shop.admin.service.IUmsRoleService;
import com.shop.model.entity.*;
import com.shop.model.mapper.UmsRoleMapper;
import com.shop.model.mapper.UmsRoleMenuRelationMapper;
import com.shop.model.mapper.UmsRoleResourceRelationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
@Service
public class UmsRoleServiceImpl extends ServiceImpl<UmsRoleMapper, UmsRole> implements IUmsRoleService {

    @Autowired
    private IUmsResourceService resourceService;
    @Autowired
    private UmsRoleMenuRelationMapper roleMenuRelationMapper;
    @Autowired
    private UmsRoleResourceRelationMapper roleResourceRelationMapper;

    @Override
    public int create(UmsRole role) {
        role.setCreateTime(LocalDateTime.now());
        role.setAdminCount(0);
        role.setSort(0);
        return baseMapper.insert(role);
    }

    @Override
    public int update(Long id, UmsRole role) {
        role.setId(id);
        return baseMapper.updateById(role);
    }

    @Override
    public int delete(List<Long> ids) {
        int count = baseMapper.deleteBatchIds(ids);
        resourceService.initResourceRolesMap();
        return count;
    }

    @Override
    public List<UmsRole> list() {
        return baseMapper.selectList(Wrappers.emptyWrapper());
    }

    @Override
    public Page<UmsRole> list(String keyword, Integer pageSize, Integer pageNum) {

        Page<UmsRole> page=new Page<UmsRole>(pageNum,pageSize);
        LambdaQueryWrapper<UmsRole> roleLambdaQueryWrapper = new LambdaQueryWrapper<>();
        if (!StringUtils.isEmpty(keyword)) {
            roleLambdaQueryWrapper.like(UmsRole::getName,keyword);
        }
        return baseMapper.selectPage(page,roleLambdaQueryWrapper);
    }

    @Override
    public List<UmsMenu> getMenuList(Long adminId) {
        return baseMapper.getMenuList(adminId);
    }

    @Override
    public List<UmsMenu> listMenu(Long roleId) {
        return baseMapper.getMenuListByRoleId(roleId);
    }

    @Override
    public List<UmsResource> listResource(Long roleId) {
        return baseMapper.getResourceListByRoleId(roleId);
    }

    @Override
    public int allocMenu(Long roleId, List<Long> menuIds) {
        //先删除原有关系
        LambdaQueryWrapper<UmsRoleMenuRelation> roleMenuRelationLambdaQueryWrapper=new LambdaQueryWrapper<>();
        roleMenuRelationLambdaQueryWrapper.eq(UmsRoleMenuRelation::getRoleId,roleId);
        roleMenuRelationMapper.delete(roleMenuRelationLambdaQueryWrapper);
        //批量插入新关系
        for (Long menuId : menuIds) {
            UmsRoleMenuRelation relation = new UmsRoleMenuRelation();
            relation.setRoleId(roleId);
            relation.setMenuId(menuId);
            roleMenuRelationMapper.insert(relation);
        }
        return menuIds.size();
    }

    @Override
    public int allocResource(Long roleId, List<Long> resourceIds) {
        //先删除原有关系
        LambdaQueryWrapper<UmsRoleResourceRelation> roleResourceRelationLambdaQueryWrapper=new LambdaQueryWrapper<>();
        roleResourceRelationLambdaQueryWrapper.eq(UmsRoleResourceRelation::getRoleId,roleId);
        roleResourceRelationMapper.delete(roleResourceRelationLambdaQueryWrapper);
        //批量插入新关系
        for (Long resourceId : resourceIds) {
            UmsRoleResourceRelation relation = new UmsRoleResourceRelation();
            relation.setRoleId(roleId);
            relation.setResourceId(resourceId);
            roleResourceRelationMapper.insert(relation);
        }
        resourceService.initResourceRolesMap();
        return resourceIds.size();
    }

}
