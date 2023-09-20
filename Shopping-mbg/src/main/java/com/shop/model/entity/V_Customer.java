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
public class V_Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long CustomerId;

    private String StoreName;

    private String RealName;

    private String Mobile;

    private String UserName;

    private String Password;

    private String Address;

    private String CustomerCode;

    private Integer OfficeId;

    private Integer ProvinceId;

    private Integer CityId;

    private Integer DistrictId;

    private Integer SalesmanId;

    private String SaleRealName;

    private String SaleMobile;

    private Double DiscountRate;

    private Integer CustomerType;

    private String ProvinceName;

    private String CityName;

    private String DistrictName;

    private Integer Status;

    private String Tel;

    private Integer CustomerLevel;

    private String StoreTypeName;

    private String ScopeTypeName;

    private String statusname;

    private LocalDateTime CreateTime;

    private String ImgUrl;

    private String AreaName;

    private Integer VipNum;

    private String VipNumName;

    private String Alias;

    private Integer CompanyId;

    private String ColorName;


    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
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

    public Integer getSalesmanId() {
        return SalesmanId;
    }

    public void setSalesmanId(Integer SalesmanId) {
        this.SalesmanId = SalesmanId;
    }

    public String getSaleRealName() {
        return SaleRealName;
    }

    public void setSaleRealName(String SaleRealName) {
        this.SaleRealName = SaleRealName;
    }

    public String getSaleMobile() {
        return SaleMobile;
    }

    public void setSaleMobile(String SaleMobile) {
        this.SaleMobile = SaleMobile;
    }

    public Double getDiscountRate() {
        return DiscountRate;
    }

    public void setDiscountRate(Double DiscountRate) {
        this.DiscountRate = DiscountRate;
    }

    public Integer getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(Integer CustomerType) {
        this.CustomerType = CustomerType;
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

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public Integer getCustomerLevel() {
        return CustomerLevel;
    }

    public void setCustomerLevel(Integer CustomerLevel) {
        this.CustomerLevel = CustomerLevel;
    }

    public String getStoreTypeName() {
        return StoreTypeName;
    }

    public void setStoreTypeName(String StoreTypeName) {
        this.StoreTypeName = StoreTypeName;
    }

    public String getScopeTypeName() {
        return ScopeTypeName;
    }

    public void setScopeTypeName(String ScopeTypeName) {
        this.ScopeTypeName = ScopeTypeName;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    public Integer getVipNum() {
        return VipNum;
    }

    public void setVipNum(Integer VipNum) {
        this.VipNum = VipNum;
    }

    public String getVipNumName() {
        return VipNumName;
    }

    public void setVipNumName(String VipNumName) {
        this.VipNumName = VipNumName;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public Integer getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(Integer CompanyId) {
        this.CompanyId = CompanyId;
    }

    public String getColorName() {
        return ColorName;
    }

    public void setColorName(String ColorName) {
        this.ColorName = ColorName;
    }

    @Override
    public String toString() {
        return "V_Customer{" +
        "CustomerId=" + CustomerId +
        ", StoreName=" + StoreName +
        ", RealName=" + RealName +
        ", Mobile=" + Mobile +
        ", UserName=" + UserName +
        ", Password=" + Password +
        ", Address=" + Address +
        ", CustomerCode=" + CustomerCode +
        ", OfficeId=" + OfficeId +
        ", ProvinceId=" + ProvinceId +
        ", CityId=" + CityId +
        ", DistrictId=" + DistrictId +
        ", SalesmanId=" + SalesmanId +
        ", SaleRealName=" + SaleRealName +
        ", SaleMobile=" + SaleMobile +
        ", DiscountRate=" + DiscountRate +
        ", CustomerType=" + CustomerType +
        ", ProvinceName=" + ProvinceName +
        ", CityName=" + CityName +
        ", DistrictName=" + DistrictName +
        ", Status=" + Status +
        ", Tel=" + Tel +
        ", CustomerLevel=" + CustomerLevel +
        ", StoreTypeName=" + StoreTypeName +
        ", ScopeTypeName=" + ScopeTypeName +
        ", statusname=" + statusname +
        ", CreateTime=" + CreateTime +
        ", ImgUrl=" + ImgUrl +
        ", AreaName=" + AreaName +
        ", VipNum=" + VipNum +
        ", VipNumName=" + VipNumName +
        ", Alias=" + Alias +
        ", CompanyId=" + CompanyId +
        ", ColorName=" + ColorName +
        "}";
    }
}
