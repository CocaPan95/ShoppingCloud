package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.entity.PmsSkuStock;

import java.util.List;

/**
 * <p>
 * sku的库存 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
public interface IPmsSkuStockService extends IService<PmsSkuStock> {
    List<PmsSkuStock> getList(Long pid, String keyword);
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
