package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.dto.PageParam;
import com.shop.model.dto.ProductAttributeParam;
import com.shop.model.entity.PmsProductAttribute;
import com.shop.model.entity.PmsProductAttributeCategory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * <p>
 * 商品属性参数表 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
public interface IPmsProductAttributeService extends IService<PmsProductAttribute> {

    Page<PmsProductAttributeCategory> GetProductAttributeCategoryList(PageParam param);

    PmsProductAttributeCategory GetProductAttributeCategoryById(Long id);

    boolean ProductAttributeCategorySave(PmsProductAttributeCategory model);

    boolean ProductAttributeCategoryDel(List<Long> ids);

    Page<PmsProductAttribute> GetProductAttributeList(ProductAttributeParam param);

    @Transactional
    boolean ProductAttributeSave(PmsProductAttribute model);

    @Transactional
    boolean ProductAttributeDel(List<Long> ids);

}
