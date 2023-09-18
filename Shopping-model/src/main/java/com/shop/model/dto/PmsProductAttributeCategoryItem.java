package com.shop.model.dto;

import com.shop.model.entity.PmsProductAttribute;
import com.shop.model.entity.PmsProductAttributeCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    @Getter
    @Setter
    @ApiModelProperty(value = "商品属性列表")
    private List<PmsProductAttribute> productAttributeList;
}
