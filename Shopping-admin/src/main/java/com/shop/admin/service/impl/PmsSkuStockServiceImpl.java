package com.shop.admin.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.mapper.PmsSkuStockMapper;
import com.shop.admin.service.IPmsSkuStockService;
import com.shop.model.entity.PmsSkuStock;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * sku的库存 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
@Service
public class PmsSkuStockServiceImpl extends ServiceImpl<PmsSkuStockMapper, PmsSkuStock> implements IPmsSkuStockService {
    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) {
        LambdaQueryWrapper<PmsSkuStock> skuStockLambdaQueryWrapper=new LambdaQueryWrapper<>();
        skuStockLambdaQueryWrapper.eq(PmsSkuStock::getProductId,pid);
        if (!StringUtils.isEmpty(keyword)) {
            skuStockLambdaQueryWrapper.like(PmsSkuStock::getSkuCode,keyword);
        }
        return baseMapper.selectList(skuStockLambdaQueryWrapper);
    }

    @Override
    public int update(Long pid, List<PmsSkuStock> skuStockList) {

        return baseMapper.replaceList(skuStockList);
    }
}
