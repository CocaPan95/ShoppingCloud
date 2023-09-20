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
public class V_OrderV2ForOrderListToExcel implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer OrderId;

    private String OrderNo;

    private Integer CustomerId;

    private String ContactName;

    private Integer ProvinceId;

    private Integer CityId;

    private Integer DistrictId;

    private String Address;

    private String Mobile;

    private String Tel;

    private Double TotalMoney;

    private Double DiscountMoney;

    private Double OrderMoney;

    private LocalDateTime CreateTime;

    private Integer PayStatus;

    private LocalDateTime PaymentTime;

    private String PaymentNo;

    private Integer Status;

    private Boolean IsValid;

    private Boolean IsPresale;

    private String PaymentName;

    private Integer PaymentType;

    private String StoreName;

    private String StoreRealName;

    private String StoreMobile;

    private Integer CustomerType;

    private Double DiscountRate;

    private Integer OfficeId;

    private Integer SalesId;

    private String CustomerRemark;

    private Integer WxPayType;

    private String ImgUrl;

    private String Memo;

    private String WarehouseName;

    private Long WarehouseId;

    private LocalDateTime SignTime;

    private String CustomerCode;

    private Double BalanceMoney;

    private Double OnlineMoney;

    private Double CardMoney;

    private Double ReturnMoney;

    private Double OrderPriveMoney;

    private Integer VipNum;

    private String VipNumName;

    private String ClassBtnName;

    private Double UserBalanceMoney;

    private Double UserReturnMoney;

    private LocalDateTime UpdateTime;

    private LocalDateTime TrueDeliveryTime;

    private Boolean IsDaigou;

    private String DeliveryQrcode;

    private Integer CompanyId;

    private String CompanyAlias;

    private String CompanyAliasCssClass;


    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
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

    public Double getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(Double TotalMoney) {
        this.TotalMoney = TotalMoney;
    }

    public Double getDiscountMoney() {
        return DiscountMoney;
    }

    public void setDiscountMoney(Double DiscountMoney) {
        this.DiscountMoney = DiscountMoney;
    }

    public Double getOrderMoney() {
        return OrderMoney;
    }

    public void setOrderMoney(Double OrderMoney) {
        this.OrderMoney = OrderMoney;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Integer getPayStatus() {
        return PayStatus;
    }

    public void setPayStatus(Integer PayStatus) {
        this.PayStatus = PayStatus;
    }

    public LocalDateTime getPaymentTime() {
        return PaymentTime;
    }

    public void setPaymentTime(LocalDateTime PaymentTime) {
        this.PaymentTime = PaymentTime;
    }

    public String getPaymentNo() {
        return PaymentNo;
    }

    public void setPaymentNo(String PaymentNo) {
        this.PaymentNo = PaymentNo;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public Boolean getIsValid() {
        return IsValid;
    }

    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    public Boolean getIsPresale() {
        return IsPresale;
    }

    public void setIsPresale(Boolean IsPresale) {
        this.IsPresale = IsPresale;
    }

    public String getPaymentName() {
        return PaymentName;
    }

    public void setPaymentName(String PaymentName) {
        this.PaymentName = PaymentName;
    }

    public Integer getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(Integer PaymentType) {
        this.PaymentType = PaymentType;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public String getStoreRealName() {
        return StoreRealName;
    }

    public void setStoreRealName(String StoreRealName) {
        this.StoreRealName = StoreRealName;
    }

    public String getStoreMobile() {
        return StoreMobile;
    }

    public void setStoreMobile(String StoreMobile) {
        this.StoreMobile = StoreMobile;
    }

    public Integer getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(Integer CustomerType) {
        this.CustomerType = CustomerType;
    }

    public Double getDiscountRate() {
        return DiscountRate;
    }

    public void setDiscountRate(Double DiscountRate) {
        this.DiscountRate = DiscountRate;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public Integer getSalesId() {
        return SalesId;
    }

    public void setSalesId(Integer SalesId) {
        this.SalesId = SalesId;
    }

    public String getCustomerRemark() {
        return CustomerRemark;
    }

    public void setCustomerRemark(String CustomerRemark) {
        this.CustomerRemark = CustomerRemark;
    }

    public Integer getWxPayType() {
        return WxPayType;
    }

    public void setWxPayType(Integer WxPayType) {
        this.WxPayType = WxPayType;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    public String getWarehouseName() {
        return WarehouseName;
    }

    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    public Long getWarehouseId() {
        return WarehouseId;
    }

    public void setWarehouseId(Long WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    public LocalDateTime getSignTime() {
        return SignTime;
    }

    public void setSignTime(LocalDateTime SignTime) {
        this.SignTime = SignTime;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }

    public Double getBalanceMoney() {
        return BalanceMoney;
    }

    public void setBalanceMoney(Double BalanceMoney) {
        this.BalanceMoney = BalanceMoney;
    }

    public Double getOnlineMoney() {
        return OnlineMoney;
    }

    public void setOnlineMoney(Double OnlineMoney) {
        this.OnlineMoney = OnlineMoney;
    }

    public Double getCardMoney() {
        return CardMoney;
    }

    public void setCardMoney(Double CardMoney) {
        this.CardMoney = CardMoney;
    }

    public Double getReturnMoney() {
        return ReturnMoney;
    }

    public void setReturnMoney(Double ReturnMoney) {
        this.ReturnMoney = ReturnMoney;
    }

    public Double getOrderPriveMoney() {
        return OrderPriveMoney;
    }

    public void setOrderPriveMoney(Double OrderPriveMoney) {
        this.OrderPriveMoney = OrderPriveMoney;
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

    public String getClassBtnName() {
        return ClassBtnName;
    }

    public void setClassBtnName(String ClassBtnName) {
        this.ClassBtnName = ClassBtnName;
    }

    public Double getUserBalanceMoney() {
        return UserBalanceMoney;
    }

    public void setUserBalanceMoney(Double UserBalanceMoney) {
        this.UserBalanceMoney = UserBalanceMoney;
    }

    public Double getUserReturnMoney() {
        return UserReturnMoney;
    }

    public void setUserReturnMoney(Double UserReturnMoney) {
        this.UserReturnMoney = UserReturnMoney;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public LocalDateTime getTrueDeliveryTime() {
        return TrueDeliveryTime;
    }

    public void setTrueDeliveryTime(LocalDateTime TrueDeliveryTime) {
        this.TrueDeliveryTime = TrueDeliveryTime;
    }

    public Boolean getIsDaigou() {
        return IsDaigou;
    }

    public void setIsDaigou(Boolean IsDaigou) {
        this.IsDaigou = IsDaigou;
    }

    public String getDeliveryQrcode() {
        return DeliveryQrcode;
    }

    public void setDeliveryQrcode(String DeliveryQrcode) {
        this.DeliveryQrcode = DeliveryQrcode;
    }

    public Integer getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(Integer CompanyId) {
        this.CompanyId = CompanyId;
    }

    public String getCompanyAlias() {
        return CompanyAlias;
    }

    public void setCompanyAlias(String CompanyAlias) {
        this.CompanyAlias = CompanyAlias;
    }

    public String getCompanyAliasCssClass() {
        return CompanyAliasCssClass;
    }

    public void setCompanyAliasCssClass(String CompanyAliasCssClass) {
        this.CompanyAliasCssClass = CompanyAliasCssClass;
    }

    @Override
    public String toString() {
        return "V_OrderV2ForOrderListToExcel{" +
        "OrderId=" + OrderId +
        ", OrderNo=" + OrderNo +
        ", CustomerId=" + CustomerId +
        ", ContactName=" + ContactName +
        ", ProvinceId=" + ProvinceId +
        ", CityId=" + CityId +
        ", DistrictId=" + DistrictId +
        ", Address=" + Address +
        ", Mobile=" + Mobile +
        ", Tel=" + Tel +
        ", TotalMoney=" + TotalMoney +
        ", DiscountMoney=" + DiscountMoney +
        ", OrderMoney=" + OrderMoney +
        ", CreateTime=" + CreateTime +
        ", PayStatus=" + PayStatus +
        ", PaymentTime=" + PaymentTime +
        ", PaymentNo=" + PaymentNo +
        ", Status=" + Status +
        ", IsValid=" + IsValid +
        ", IsPresale=" + IsPresale +
        ", PaymentName=" + PaymentName +
        ", PaymentType=" + PaymentType +
        ", StoreName=" + StoreName +
        ", StoreRealName=" + StoreRealName +
        ", StoreMobile=" + StoreMobile +
        ", CustomerType=" + CustomerType +
        ", DiscountRate=" + DiscountRate +
        ", OfficeId=" + OfficeId +
        ", SalesId=" + SalesId +
        ", CustomerRemark=" + CustomerRemark +
        ", WxPayType=" + WxPayType +
        ", ImgUrl=" + ImgUrl +
        ", Memo=" + Memo +
        ", WarehouseName=" + WarehouseName +
        ", WarehouseId=" + WarehouseId +
        ", SignTime=" + SignTime +
        ", CustomerCode=" + CustomerCode +
        ", BalanceMoney=" + BalanceMoney +
        ", OnlineMoney=" + OnlineMoney +
        ", CardMoney=" + CardMoney +
        ", ReturnMoney=" + ReturnMoney +
        ", OrderPriveMoney=" + OrderPriveMoney +
        ", VipNum=" + VipNum +
        ", VipNumName=" + VipNumName +
        ", ClassBtnName=" + ClassBtnName +
        ", UserBalanceMoney=" + UserBalanceMoney +
        ", UserReturnMoney=" + UserReturnMoney +
        ", UpdateTime=" + UpdateTime +
        ", TrueDeliveryTime=" + TrueDeliveryTime +
        ", IsDaigou=" + IsDaigou +
        ", DeliveryQrcode=" + DeliveryQrcode +
        ", CompanyId=" + CompanyId +
        ", CompanyAlias=" + CompanyAlias +
        ", CompanyAliasCssClass=" + CompanyAliasCssClass +
        "}";
    }
}
