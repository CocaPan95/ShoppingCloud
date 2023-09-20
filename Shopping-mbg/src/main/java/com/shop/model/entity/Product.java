package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 产品表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品Id
     */
    private Integer ProductId;

    /**
     * 分类Id
     */
    private Integer CategoryId;

    /**
     * 品牌id
     */
    private Integer BrandId;

    /**
     * 产品名称
     */
    private String ProductName;

    /**
     * 产品标签，用于前台显示
     */
    private String ProductLabel;

    /**
     * 产品简介
     */
    private String ProductInfo;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    private LocalDateTime UpdateTime;

    /**
     * 是否启用（无用字段）
     */
    private Boolean IsEnable;

    /**
     * 点击数量（无用字段）
     */
    private Integer clicknum;

    /**
     * 是否有效（无用字段）
     */
    private Boolean Valid;

    /**
     * 创建人
     */
    private String CreateName;

    /**
     * 更新人
     */
    private String UpdateName;


    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer ProductId) {
        this.ProductId = ProductId;
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer CategoryId) {
        this.CategoryId = CategoryId;
    }

    public Integer getBrandId() {
        return BrandId;
    }

    public void setBrandId(Integer BrandId) {
        this.BrandId = BrandId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductLabel() {
        return ProductLabel;
    }

    public void setProductLabel(String ProductLabel) {
        this.ProductLabel = ProductLabel;
    }

    public String getProductInfo() {
        return ProductInfo;
    }

    public void setProductInfo(String ProductInfo) {
        this.ProductInfo = ProductInfo;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Boolean getIsEnable() {
        return IsEnable;
    }

    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    @Override
    public String toString() {
        return "Product{" +
        "ProductId=" + ProductId +
        ", CategoryId=" + CategoryId +
        ", BrandId=" + BrandId +
        ", ProductName=" + ProductName +
        ", ProductLabel=" + ProductLabel +
        ", ProductInfo=" + ProductInfo +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        ", IsEnable=" + IsEnable +
        ", clicknum=" + clicknum +
        ", Valid=" + Valid +
        ", CreateName=" + CreateName +
        ", UpdateName=" + UpdateName +
        "}";
    }
}
