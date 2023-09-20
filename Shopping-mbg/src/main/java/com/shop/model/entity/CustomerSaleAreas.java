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
public class CustomerSaleAreas implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Long CustomerId;

    private Integer ProvinceId;

    private String ProvinceName;

    private Integer CityId;

    private String CityName;

    private Boolean IsDeleted;

    private String Version;

    private String CreateBy;

    private LocalDateTime CreateTime;

    private String UpdateBy;

    private LocalDateTime UpdateTime;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(Integer ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    public Integer getCityId() {
        return CityId;
    }

    public void setCityId(Integer CityId) {
        this.CityId = CityId;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getUpdateBy() {
        return UpdateBy;
    }

    public void setUpdateBy(String UpdateBy) {
        this.UpdateBy = UpdateBy;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    @Override
    public String toString() {
        return "CustomerSaleAreas{" +
        "Id=" + Id +
        ", CustomerId=" + CustomerId +
        ", ProvinceId=" + ProvinceId +
        ", ProvinceName=" + ProvinceName +
        ", CityId=" + CityId +
        ", CityName=" + CityName +
        ", IsDeleted=" + IsDeleted +
        ", Version=" + Version +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        ", UpdateBy=" + UpdateBy +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
