package com.shop.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("产品属性查询类")
@Data
public class ProductAttributeParam extends PageParam{
    @ApiModelProperty("产品属性分类Id")
    private Long AttributeCategoryId;

    /**
     * 0属性列表 1参数列表
     */
    @ApiModelProperty("产品属性类型")
    private int Type;
}
