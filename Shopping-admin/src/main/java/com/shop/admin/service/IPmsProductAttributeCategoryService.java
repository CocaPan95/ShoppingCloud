package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.dto.PmsProductAttributeCategoryItem;
import com.shop.model.entity.PmsProductAttributeCategory;

import java.util.List;

/**
 * <p>
 * 产品属性分类表 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
public interface IPmsProductAttributeCategoryService extends IService<PmsProductAttributeCategory> {
    /**
     * 创建属性分类
     */
    int create(String name);

    /**
     * 修改属性分类
     */
    int update(Long id, String name);

    /**
     * 删除属性分类
     */
    int delete(Long id);

    /**
     * 获取属性分类详情
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * 分页查询属性分类
     */
    Page<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

}
