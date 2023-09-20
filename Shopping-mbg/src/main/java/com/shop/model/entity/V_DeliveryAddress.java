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
public class V_DeliveryAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer DeliveryAddressId;

    private Integer CustomerId;

    private String RealName;

    private String PostCode;

    private Integer ProvinceId;

    private Integer CityId;

    private Integer DistrictId;

    private String Address;

    private String Tel;

    private String Mobile;

    private Boolean IsDefault;

    private Boolean Valid;

    private LocalDateTime CreateTime;

    private String ProvinceName;

    private String CityName;

    private String DistrictName;


    public Integer getDeliveryAddressId() {
        return DeliveryAddressId;
    }

    public void setDeliveryAddressId(Integer DeliveryAddressId) {
        this.DeliveryAddressId = DeliveryAddressId;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
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

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public Boolean getIsDefault() {
        return IsDefault;
    }

    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
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

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public String getDistrictName() {
        return DistrictName;
    }

    public void setDistrictName(String DistrictName) {
        this.DistrictName = DistrictName;
    }

    @Override
    public String toString() {
        return "V_DeliveryAddress{" +
        "DeliveryAddressId=" + DeliveryAddressId +
        ", CustomerId=" + CustomerId +
        ", RealName=" + RealName +
        ", PostCode=" + PostCode +
        ", ProvinceId=" + ProvinceId +
        ", CityId=" + CityId +
        ", DistrictId=" + DistrictId +
        ", Address=" + Address +
        ", Tel=" + Tel +
        ", Mobile=" + Mobile +
        ", IsDefault=" + IsDefault +
        ", Valid=" + Valid +
        ", CreateTime=" + CreateTime +
        ", ProvinceName=" + ProvinceName +
        ", CityName=" + CityName +
        ", DistrictName=" + DistrictName +
        "}";
    }
}
