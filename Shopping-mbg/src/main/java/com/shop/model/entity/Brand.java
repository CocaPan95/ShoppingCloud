package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    private Integer BrandId;

    /**
     * 品牌编码
     */
    private String BrandCode;

    /**
     * 品牌名称
     */
    private String BrandName;

    /**
     * 父品牌	，顶级品牌 ParentId=0
     */
    private Integer ParentId;

    /**
     * 品牌图片
     */
    private String ImageUrl;

    /**
     * 品牌介绍
     */
    private String BrandInfo;

    /**
     * 是否启用禁用；1：启用，0：禁用
     */
    private Boolean IsEnable;

    /**
     * 是否有效；0：有效，1：无效
     */
    private Boolean Valid;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    private LocalDateTime UpdateTime;

    /**
     * 创建人
     */
    private String CreateName;

    /**
     * 更新人
     */
    private String UpdateName;

    /**
     * 排序；数字越大,越在APP端越靠前
     */
    private Integer OrderNum;

    /**
     * 类目Id
     */
    private Integer KindId;


    public Integer getBrandId() {
        return BrandId;
    }

    public void setBrandId(Integer BrandId) {
        this.BrandId = BrandId;
    }

    public String getBrandCode() {
        return BrandCode;
    }

    public void setBrandCode(String BrandCode) {
        this.BrandCode = BrandCode;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public Integer getParentId() {
        return ParentId;
    }

    public void setParentId(Integer ParentId) {
        this.ParentId = ParentId;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public String getBrandInfo() {
        return BrandInfo;
    }

    public void setBrandInfo(String BrandInfo) {
        this.BrandInfo = BrandInfo;
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

    public Integer getOrderNum() {
        return OrderNum;
    }

    public void setOrderNum(Integer OrderNum) {
        this.OrderNum = OrderNum;
    }

    public Integer getKindId() {
        return KindId;
    }

    public void setKindId(Integer KindId) {
        this.KindId = KindId;
    }

    @Override
    public String toString() {
        return "Brand{" +
        "BrandId=" + BrandId +
        ", BrandCode=" + BrandCode +
        ", BrandName=" + BrandName +
        ", ParentId=" + ParentId +
        ", ImageUrl=" + ImageUrl +
        ", BrandInfo=" + BrandInfo +
        ", IsEnable=" + IsEnable +
        ", Valid=" + Valid +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        ", CreateName=" + CreateName +
        ", UpdateName=" + UpdateName +
        ", OrderNum=" + OrderNum +
        ", KindId=" + KindId +
        "}";
    }
}
