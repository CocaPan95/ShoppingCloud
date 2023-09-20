package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class V_Brand implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer BrandId;

    private String BrandName;

    private Integer ParentId;

    private String ParentBrandName;

    private String ImageUrl;

    private String BrandInfo;

    private Boolean IsEnable;

    private Boolean Valid;

    private LocalDateTime CreateTime;

    private String CreateName;

    private LocalDateTime UpdateTime;

    private String UpdateName;

    private Integer OrderNum;


    public Integer getBrandId() {
        return BrandId;
    }

    public void setBrandId(Integer BrandId) {
        this.BrandId = BrandId;
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

    public String getParentBrandName() {
        return ParentBrandName;
    }

    public void setParentBrandName(String ParentBrandName) {
        this.ParentBrandName = ParentBrandName;
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

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    @Override
    public String toString() {
        return "V_Brand{" +
        "BrandId=" + BrandId +
        ", BrandName=" + BrandName +
        ", ParentId=" + ParentId +
        ", ParentBrandName=" + ParentBrandName +
        ", ImageUrl=" + ImageUrl +
        ", BrandInfo=" + BrandInfo +
        ", IsEnable=" + IsEnable +
        ", Valid=" + Valid +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        ", UpdateTime=" + UpdateTime +
        ", UpdateName=" + UpdateName +
        ", OrderNum=" + OrderNum +
        "}";
    }
}
