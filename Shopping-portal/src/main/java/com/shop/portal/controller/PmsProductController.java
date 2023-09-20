package com.shop.portal.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shop.model.api.CommonResult;
import com.shop.model.dto.PmsPortalProductDetail;
import com.shop.model.dto.PmsProductCategoryNode;
import com.shop.model.entity.PmsProduct;
import com.shop.portal.service.IPmsProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 前台商品管理Controller
 * Created by macro on 2020/4/6.
 */
@Controller
@Api(tags = "PmsPortalProductController", description = "前台商品管理")
@RequestMapping("/product")
public class PmsProductController {
    @Autowired
    private IPmsProductService productService;


    @ApiOperation("以树形结构获取所有商品分类")
    @RequestMapping(value = "/categoryTreeList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsProductCategoryNode>> categoryTreeList() {
        List<PmsProductCategoryNode> list = productService.categoryTreeList();
        return CommonResult.success(list);
    }

    @ApiOperation(value = "综合搜索、筛选、排序")
    @ApiImplicitParam(name = "sort", value = "排序字段:0->按相关度；1->按新品；2->按销量；3->价格从低到高；4->价格从高到低",
            defaultValue = "0", allowableValues = "0,1,2,3,4", paramType = "query", dataType = "integer")
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Page<PmsProduct>> search(@RequestParam(required = false) String keyword,
                                                 @RequestParam(required = false) Long brandId,
                                                 @RequestParam(required = false) Long productCategoryId,
                                                 @RequestParam(required = false, defaultValue = "0") Integer pageNum,
                                                 @RequestParam(required = false, defaultValue = "5") Integer pageSize,
                                                 @RequestParam(required = false, defaultValue = "0") Integer sort) {
        return CommonResult.success(productService.search(keyword, brandId, productCategoryId, pageNum, pageSize, sort));
    }
    @ApiOperation("获取前台商品详情")
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsPortalProductDetail> detail(@PathVariable Long id) {
        PmsPortalProductDetail productDetail = productService.detail(id);
        return CommonResult.success(productDetail);
    }

}
