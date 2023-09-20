package com.shop.admin.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.service.IPmsProductAttributeCategoryService;
import com.shop.model.entity.PmsProductAttributeCategory;
import com.shop.model.mapper.PmsProductAttributeCategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 产品属性分类表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
@Service
public class PmsProductAttributeCategoryServiceImpl extends ServiceImpl<PmsProductAttributeCategoryMapper, PmsProductAttributeCategory> implements IPmsProductAttributeCategoryService {
    @Override
    public int create(String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        return baseMapper.insert(productAttributeCategory);
    }

    @Override
    public int update(Long id, String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        productAttributeCategory.setId(id);
        return baseMapper.updateById(productAttributeCategory);
    }

    @Override
    public int delete(Long id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public PmsProductAttributeCategory getItem(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public Page<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum) {
        Page<PmsProductAttributeCategory> page = new Page<>(pageNum, pageSize);
        return baseMapper.selectPage(page, Wrappers.emptyWrapper());
    }

}
