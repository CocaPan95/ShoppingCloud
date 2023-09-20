package com.shop.portal.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.dto.PmsPortalProductDetail;
import com.shop.model.dto.PmsProductCategoryNode;
import com.shop.model.entity.PmsProduct;

import java.util.List;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-20
 */
public interface IPmsProductService extends IService<PmsProduct> {
    /**
     * 以树形结构获取所有商品分类
     */
    List<PmsProductCategoryNode> categoryTreeList();
    Page<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);
    PmsPortalProductDetail detail(Long id);
}
