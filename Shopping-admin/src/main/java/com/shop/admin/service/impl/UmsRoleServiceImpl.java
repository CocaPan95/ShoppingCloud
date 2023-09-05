package com.shop.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.mapper.UmsRoleMapper;
import com.shop.admin.service.IUmsRoleService;
import com.shop.model.entity.UmsRole;
import org.springframework.stereotype.Service;

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
    @Override
    public List<UmsRole> getRoleList(Long adminId) {
        return baseMapper.getRoleList(adminId);
    }
}
