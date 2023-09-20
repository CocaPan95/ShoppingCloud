package com.shop.model.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName("product.Product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品Id
     */
    @TableId(value = "productId", type = IdType.AUTO)
    private Integer productId;

    /**
     * 分类Id
     */
    @TableField("categoryCode")
    private Integer categoryId;

    /**
     * 品牌id
     */
    @TableField("categoryCode")
    private Integer brandId;

    /**
     * 产品名称
     */
    @TableField("categoryCode")
    private String productName;

    /**
     * 产品标签，用于前台显示
     */
    @TableField("categoryCode")
    private String productLabel;

    /**
     * 产品简介
     */
    @TableField("categoryCode")
    private String productInfo;

    /**
     * 创建时间
     */
    @TableField("categoryCode")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("categoryCode")
    private LocalDateTime updateTime;

    /**
     * 是否启用（无用字段）
     */
    @TableField("categoryCode")
    private Boolean isEnable;

    /**
     * 点击数量（无用字段）
     */
    @TableField("categoryCode")
    private Integer clicknum;

    /**
     * 是否有效（无用字段）
     */
    @TableField("valid")
    private Boolean valid;

    /**
     * 创建人
     */
    @TableField("createName")
    private String createName;

    /**
     * 更新人
     */
    @TableField("updateName")
    private String updateName;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductLabel() {
        return productLabel;
    }

    public void setProductLabel(String productLabel) {
        this.productLabel = productLabel;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    @Override
    public String toString() {
        return "Product{" +
        "productId=" + productId +
        ", categoryId=" + categoryId +
        ", brandId=" + brandId +
        ", productName=" + productName +
        ", productLabel=" + productLabel +
        ", productInfo=" + productInfo +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isEnable=" + isEnable +
        ", clicknum=" + clicknum +
        ", valid=" + valid +
        ", createName=" + createName +
        ", updateName=" + updateName +
        "}";
    }
}
