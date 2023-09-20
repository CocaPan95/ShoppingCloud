package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class V_ReturnCash implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long ReturnCashId;

    private Long CustomerId;

    private Double OrderMoney;

    private LocalDate ReturnDate;

    private Double ReturnMoney;

    private String ReturnContent;

    private String CREATED_BY;

    private LocalDateTime CREATED_TIME;

    private String StoreName;

    private String CustomerCode;

    private String RealName;

    private String Mobile;

    private String Address;

    private Integer OfficeId;

    private String OfficeName;

    private String AreaName;

    private Integer AreaId;

    private Integer ProvinceId;

    private String ProvinceName;

    private Integer CityId;

    private String CityName;

    private Integer DistrictId;

    private String DistrictName;

    private Double DiscountRate;

    private String ImgUrl;

    private String Alias;

    private Integer CompanyId;


    public Long getReturnCashId() {
        return ReturnCashId;
    }

    public void setReturnCashId(Long ReturnCashId) {
        this.ReturnCashId = ReturnCashId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Double getOrderMoney() {
        return OrderMoney;
    }

    public void setOrderMoney(Double OrderMoney) {
        this.OrderMoney = OrderMoney;
    }

    public LocalDate getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(LocalDate ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public Double getReturnMoney() {
        return ReturnMoney;
    }

    public void setReturnMoney(Double ReturnMoney) {
        this.ReturnMoney = ReturnMoney;
    }

    public String getReturnContent() {
        return ReturnContent;
    }

    public void setReturnContent(String ReturnContent) {
        this.ReturnContent = ReturnContent;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public LocalDateTime getCREATED_TIME() {
        return CREATED_TIME;
    }

    public void setCREATED_TIME(LocalDateTime CREATED_TIME) {
        this.CREATED_TIME = CREATED_TIME;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public String getOfficeName() {
        return OfficeName;
    }

    public void setOfficeName(String OfficeName) {
        this.OfficeName = OfficeName;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    public Integer getAreaId() {
        return AreaId;
    }

    public void setAreaId(Integer AreaId) {
        this.AreaId = AreaId;
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

    public Integer getDistrictId() {
        return DistrictId;
    }

    public void setDistrictId(Integer DistrictId) {
        this.DistrictId = DistrictId;
    }

    public String getDistrictName() {
        return DistrictName;
    }

    public void setDistrictName(String DistrictName) {
        this.DistrictName = DistrictName;
    }

    public Double getDiscountRate() {
        return DiscountRate;
    }

    public void setDiscountRate(Double DiscountRate) {
        this.DiscountRate = DiscountRate;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
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

    @Override
    public String toString() {
        return "V_ReturnCash{" +
        "ReturnCashId=" + ReturnCashId +
        ", CustomerId=" + CustomerId +
        ", OrderMoney=" + OrderMoney +
        ", ReturnDate=" + ReturnDate +
        ", ReturnMoney=" + ReturnMoney +
        ", ReturnContent=" + ReturnContent +
        ", CREATED_BY=" + CREATED_BY +
        ", CREATED_TIME=" + CREATED_TIME +
        ", StoreName=" + StoreName +
        ", CustomerCode=" + CustomerCode +
        ", RealName=" + RealName +
        ", Mobile=" + Mobile +
        ", Address=" + Address +
        ", OfficeId=" + OfficeId +
        ", OfficeName=" + OfficeName +
        ", AreaName=" + AreaName +
        ", AreaId=" + AreaId +
        ", ProvinceId=" + ProvinceId +
        ", ProvinceName=" + ProvinceName +
        ", CityId=" + CityId +
        ", CityName=" + CityName +
        ", DistrictId=" + DistrictId +
        ", DistrictName=" + DistrictName +
        ", DiscountRate=" + DiscountRate +
        ", ImgUrl=" + ImgUrl +
        ", Alias=" + Alias +
        ", CompanyId=" + CompanyId +
        "}";
    }
}
