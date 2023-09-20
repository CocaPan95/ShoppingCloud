package com.shop.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.model.entity.PmsSkuStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * sku的库存 Mapper 接口
 * </p>
 *
 * @author coca
 * @since 2023-09-20
 */
public interface PmsSkuStockMapper extends BaseMapper<PmsSkuStock> {
    /**
     * 批量插入或替换操作
     */
    int replaceList(@Param("list") List<PmsSkuStock> skuStockList);
}
