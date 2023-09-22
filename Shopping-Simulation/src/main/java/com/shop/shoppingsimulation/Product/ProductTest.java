package com.shop.shoppingsimulation.Product;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shop.model.dto.PmsPortalProductDetail;
import com.shop.model.dto.PmsProductCategoryNode;
import com.shop.model.entity.PmsProduct;
import com.shop.shoppingsimulation.common.HttpUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {
    public List<PmsProductCategoryNode> categoryTreeList()  {
        List<PmsProductCategoryNode> result = new ArrayList<>();
        result = HttpUtils.HttpGet("shop-portal/product/categoryTreeList", result.getClass());
        return result;
    }

    public Page<PmsProduct> search(String keyword, String brandId, String productCategoryId, Integer pageNum, Integer pageSize, Integer sort){
        Page<PmsProduct> result=new Page<>();
        result = HttpUtils.HttpGet(String.format("shop-portal/product/search?keyword=%s&brandId=%s&productCategoryId=%s&pageNum=%s&pageSize=%s&sort=%s", keyword,brandId,productCategoryId,pageNum,pageSize,sort), result.getClass());
        return result;
    }

    public PmsPortalProductDetail detail(Long id){
        PmsPortalProductDetail result=new PmsPortalProductDetail();
        result = HttpUtils.HttpGet("shop-portal/product/detail/44", result.getClass());
        return result;
    }
}
