package com.shop.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.mapper.UmsResourceMapper;
import com.shop.admin.mapper.UmsRoleMapper;
import com.shop.admin.mapper.UmsRoleResourceRelationMapper;
import com.shop.admin.service.IUmsResourceService;
import com.shop.common.constant.AuthConstant;
import com.shop.common.service.RedisService;
import com.shop.model.entity.UmsResource;
import com.shop.model.entity.UmsRole;
import com.shop.model.entity.UmsRoleResourceRelation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * <p>
 * 后台资源表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
@Service
public class UmsResourceServiceImpl extends ServiceImpl<UmsResourceMapper, UmsResource> implements IUmsResourceService {

    @Autowired
    private UmsRoleResourceRelationMapper roleResourceRelationMapper;

    @Autowired
    private UmsRoleMapper roleMapper;
    @Autowired
    private RedisService redisService;

    @Override
    public Map<String, List<String>> initResourceRolesMap() {
        Map<String,List<String>> resourceRoleMap = new TreeMap<>();
        List<UmsResource> resourceList = baseMapper.selectList(new QueryWrapper<>());
        List<UmsRole> roleList = roleMapper.selectList(new QueryWrapper<>());
        List<UmsRoleResourceRelation> relationList = roleResourceRelationMapper.selectList(new QueryWrapper());
        for (UmsResource resource : resourceList) {
            Set<Long> roleIds = relationList.stream().filter(item -> item.getResourceId().equals(resource.getId())).map(UmsRoleResourceRelation::getRoleId).collect(Collectors.toSet());
            List<String> roleNames = roleList.stream().filter(item -> roleIds.contains(item.getId())).map(item -> item.getId() + "_" + item.getName()).collect(Collectors.toList());
            resourceRoleMap.put("/**/"+resource.getUrl(),roleNames);
        }
        redisService.del(AuthConstant.RESOURCE_ROLES_MAP_KEY);
        redisService.hSetAll(AuthConstant.RESOURCE_ROLES_MAP_KEY, resourceRoleMap);
        return resourceRoleMap;

    }
}
