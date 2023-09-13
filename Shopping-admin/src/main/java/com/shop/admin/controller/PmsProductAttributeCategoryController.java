package com.shop.admin.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shop.admin.service.IPmsProductAttributeService;
import com.shop.model.api.CommonResult;
import com.shop.model.dto.PageParam;
import com.shop.model.dto.ProductAttributeParam;
import com.shop.model.entity.PmsProductAttribute;
import com.shop.model.entity.PmsProductAttributeCategory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "PmsProductAttributeController", description = "商品属性管理")
@RequestMapping("/productAttribute")
public class PmsProductAttributeCategoryController {

    @Autowired
    private IPmsProductAttributeService productAttributeService;

    @ApiOperation("分页获取所有商品属性分类")
    @RequestMapping(value = "/GetProductAttributeCategoryList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Page<PmsProductAttributeCategory>> GetProductAttributeCategoryList(@RequestBody PageParam param) {
        Page<PmsProductAttributeCategory> pmsProductAttributeCategoryPage = productAttributeService.GetProductAttributeCategoryList(param);
        return CommonResult.success(pmsProductAttributeCategoryPage);
    }

    @ApiOperation("查询单个商品属性分类")
    @RequestMapping(value = "/GetProductAttributeCategoryById", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsProductAttributeCategory> GetProductAttributeCategoryById(@PathVariable Long id) {
        PmsProductAttributeCategory productAttributeCategory = productAttributeService.GetProductAttributeCategoryById(id);
        return CommonResult.success(productAttributeCategory);
    }

    @ApiOperation("保存商品属性分类信息")
    @RequestMapping(value = "/ProductAttributeCategorySave", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult ProductAttributeCategorySave(@RequestBody PmsProductAttributeCategory model) {
        if (productAttributeService.ProductAttributeCategorySave(model)) {
            return CommonResult.success("修改成功！");
        } else {
            return CommonResult.failed("修改失败！");
        }
    }


    @ApiOperation("删除单个商品属性分类")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult ProductAttributeCategoryDel(@RequestParam List<Long> ids) {
        if (productAttributeService.ProductAttributeCategoryDel(ids)) {
            return CommonResult.success("删除成功");
        } else {
            return CommonResult.failed("删除失败");
        }
    }

    @ApiOperation("根据分类查询属性列表或参数列表")
    @RequestMapping(value = "/GetProductAttributeList", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Page<PmsProductAttribute>> GetProductAttributeList(@RequestParam ProductAttributeParam param) {
        Page<PmsProductAttribute> productAttributeList = productAttributeService.GetProductAttributeList(param);
        return CommonResult.success(productAttributeList);
    }

    @ApiOperation("保存商品属性信息")
    @RequestMapping(value = "/ProductAttributeSave", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult ProductAttributeSave(@RequestBody PmsProductAttribute model) {
        if (productAttributeService.ProductAttributeSave(model)) {
            return CommonResult.success("修改成功！");
        } else {
            return CommonResult.failed("修改失败！");
        }
    }

    @ApiOperation("查询单个商品属性")
    @RequestMapping(value = "/GetProductAttributeById", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsProductAttribute> GetProductAttributeById(@PathVariable Long id) {
        PmsProductAttribute productAttribute = productAttributeService.getById(id);
        return CommonResult.success(productAttribute);
    }

    @ApiOperation("批量删除商品属性")
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        if (productAttributeService.ProductAttributeDel(ids)) {
            return CommonResult.success("删除成功");
        } else {
            return CommonResult.failed("删除失败");
        }
    }
}
