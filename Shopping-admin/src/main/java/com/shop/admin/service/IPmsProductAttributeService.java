package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.dto.PageParam;
import com.shop.model.dto.PmsProductAttributeParam;
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

    /**
     * 根据分类分页获取商品属性
     * @param cid 分类id
     * @param type 0->属性；2->参数
     */
    Page<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 添加商品属性
     */
    @Transactional
    int create(PmsProductAttributeParam pmsProductAttributeParam);

    /**
     * 修改商品属性
     */
    int update(Long id, PmsProductAttributeParam productAttributeParam);

    /**
     * 获取单个商品属性信息
     */
    PmsProductAttribute getItem(Long id);

    @Transactional
    int delete(List<Long> ids);


}
