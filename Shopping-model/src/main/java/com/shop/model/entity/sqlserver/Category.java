package com.shop.model.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 分类表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@TableName("product.Category")
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类主键id
     */
    @TableId(value = "categoryId", type = IdType.AUTO)
    private Integer categoryId;

    /**
     * 类别编码
     */
    @TableField("categoryCode")
    private String categoryCode;

    /**
     * 类别名称
     */
    @TableField("categoryName")
    private String categoryName;

    /**
     * 无用字段
     */
    @TableField("parentId")
    private Integer parentId;

    /**
     * 无用字段
     */
    @TableField("path")
    private String path;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("updateTime")
    private LocalDateTime updateTime;

    /**
     * 是否启用禁用; 1:启用，0：禁用
     */
    @TableField("isEnable")
    private Boolean isEnable;

    /**
     * 是否有效；1：无效，0：有效
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

    /**
     * 品牌Id
     */
    @TableField("brandId")
    private Integer brandId;


    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {
        return "Category{" +
        "categoryId=" + categoryId +
        ", categoryCode=" + categoryCode +
        ", categoryName=" + categoryName +
        ", parentId=" + parentId +
        ", path=" + path +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isEnable=" + isEnable +
        ", valid=" + valid +
        ", createName=" + createName +
        ", updateName=" + updateName +
        ", brandId=" + brandId +
        "}";
    }
}
