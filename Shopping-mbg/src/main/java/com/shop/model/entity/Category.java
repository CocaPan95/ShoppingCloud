package com.shop.model.entity;

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
public class Category implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 分类主键id
     */
    private Integer CategoryId;

    /**
     * 类别编码
     */
    private String CategoryCode;

    /**
     * 类别名称
     */
    private String CategoryName;

    /**
     * 无用字段
     */
    private Integer ParentId;

    /**
     * 无用字段
     */
    private String Path;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    private LocalDateTime UpdateTime;

    /**
     * 是否启用禁用; 1:启用，0：禁用
     */
    private Boolean IsEnable;

    /**
     * 是否有效；1：无效，0：有效
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

    /**
     * 品牌Id
     */
    private Integer BrandId;


    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer CategoryId) {
        this.CategoryId = CategoryId;
    }

    public String getCategoryCode() {
        return CategoryCode;
    }

    public void setCategoryCode(String CategoryCode) {
        this.CategoryCode = CategoryCode;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public Integer getParentId() {
        return ParentId;
    }

    public void setParentId(Integer ParentId) {
        this.ParentId = ParentId;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
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

    public Integer getBrandId() {
        return BrandId;
    }

    public void setBrandId(Integer BrandId) {
        this.BrandId = BrandId;
    }

    @Override
    public String toString() {
        return "Category{" +
        "CategoryId=" + CategoryId +
        ", CategoryCode=" + CategoryCode +
        ", CategoryName=" + CategoryName +
        ", ParentId=" + ParentId +
        ", Path=" + Path +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        ", IsEnable=" + IsEnable +
        ", Valid=" + Valid +
        ", CreateName=" + CreateName +
        ", UpdateName=" + UpdateName +
        ", BrandId=" + BrandId +
        "}";
    }
}
