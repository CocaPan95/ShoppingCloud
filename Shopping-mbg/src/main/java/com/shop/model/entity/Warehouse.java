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
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long WarehouseId;

    private String WarehouseName;

    private LocalDateTime CreateTime;

    private String CreateName;

    private LocalDateTime UpdateTime;

    private String UpdateName;

    private Boolean Enable;

    private Boolean Valid;

    private String ContactName;

    private String Mobile;

    private String Tel;

    private Integer ProvinceId;

    private Integer CityId;

    private Integer DistrictId;

    private String Address;

    private Long mall_customerId;


    public Long getWarehouseId() {
        return WarehouseId;
    }

    public void setWarehouseId(Long WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    public String getWarehouseName() {
        return WarehouseName;
    }

    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
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

    public Boolean getEnable() {
        return Enable;
    }

    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public Integer getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(Integer ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    public Integer getCityId() {
        return CityId;
    }

    public void setCityId(Integer CityId) {
        this.CityId = CityId;
    }

    public Integer getDistrictId() {
        return DistrictId;
    }

    public void setDistrictId(Integer DistrictId) {
        this.DistrictId = DistrictId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Long getMall_customerId() {
        return mall_customerId;
    }

    public void setMall_customerId(Long mall_customerId) {
        this.mall_customerId = mall_customerId;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
        "WarehouseId=" + WarehouseId +
        ", WarehouseName=" + WarehouseName +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        ", UpdateTime=" + UpdateTime +
        ", UpdateName=" + UpdateName +
        ", Enable=" + Enable +
        ", Valid=" + Valid +
        ", ContactName=" + ContactName +
        ", Mobile=" + Mobile +
        ", Tel=" + Tel +
        ", ProvinceId=" + ProvinceId +
        ", CityId=" + CityId +
        ", DistrictId=" + DistrictId +
        ", Address=" + Address +
        ", mall_customerId=" + mall_customerId +
        "}";
    }
}
