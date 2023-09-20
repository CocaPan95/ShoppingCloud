package com.shop.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.service.IUmsResourceCategoryService;
import com.shop.model.entity.UmsResourceCategory;
import com.shop.model.mapper.UmsResourceCategoryMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 资源分类表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
@Service
public class UmsResourceCategoryServiceImpl extends ServiceImpl<UmsResourceCategoryMapper, UmsResourceCategory> implements IUmsResourceCategoryService {
    @Override
    public List<UmsResourceCategory> listAll() {
        LambdaQueryWrapper<UmsResourceCategory> resourceCategoryLambdaQueryWrapper=new LambdaQueryWrapper<>();
        resourceCategoryLambdaQueryWrapper.orderByDesc(UmsResourceCategory::getSort);
        return baseMapper.selectList(resourceCategoryLambdaQueryWrapper);
    }

    @Override
    public int create(UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setCreateTime(LocalDateTime.now());
        return baseMapper.insert(umsResourceCategory);
    }

    @Override
    public int update(Long id, UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setId(id);
        return baseMapper.updateById(umsResourceCategory);
    }

    @Override
    public int delete(Long id) {
        return baseMapper.deleteById(id);
    }
}
