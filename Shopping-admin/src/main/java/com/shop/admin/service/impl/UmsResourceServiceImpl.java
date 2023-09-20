package com.shop.admin.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.service.IUmsResourceService;
import com.shop.common.constant.AuthConstant;
import com.shop.common.service.RedisService;
import com.shop.model.entity.UmsResource;
import com.shop.model.entity.UmsRole;
import com.shop.model.entity.UmsRoleResourceRelation;
import com.shop.model.mapper.UmsResourceMapper;
import com.shop.model.mapper.UmsRoleMapper;
import com.shop.model.mapper.UmsRoleResourceRelationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
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
    public int create(UmsResource umsResource) {
        umsResource.setCreateTime(LocalDateTime.now());
        int count = baseMapper.insert(umsResource);
        initResourceRolesMap();
        return count;
    }

    @Override
    public int update(Long id, UmsResource umsResource) {
        umsResource.setId(id);
        int count = baseMapper.updateById(umsResource);
        initResourceRolesMap();
        return count;
    }

    @Override
    public UmsResource getItem(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public int delete(Long id) {
        int count = baseMapper.deleteById(id);
        initResourceRolesMap();
        return count;
    }

    @Override
    public Page<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum) {
        Page<UmsResource> page=new Page<>(pageNum,pageSize);
        LambdaQueryWrapper<UmsResource> resourceLambdaQueryWrapper=new LambdaQueryWrapper<>();
        if(categoryId!=null){
            resourceLambdaQueryWrapper.eq(UmsResource::getCategoryId,categoryId);
        }
        if(StrUtil.isNotEmpty(nameKeyword)){
            resourceLambdaQueryWrapper.like(UmsResource::getName,nameKeyword);
        }
        if(StrUtil.isNotEmpty(urlKeyword)){
            resourceLambdaQueryWrapper.like(UmsResource::getUrl,urlKeyword);
        }
        return baseMapper.selectPage(page,resourceLambdaQueryWrapper);
    }

    @Override
    public List<UmsResource> listAll() {
        return baseMapper.selectList(Wrappers.emptyWrapper());
    }


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
