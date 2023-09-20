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
public class StoreOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long OrderId;

    private String OrderNo;

    private String ReferenceNo;

    private Integer SourceId;

    private Integer CustomerId;

    private Integer SalesmanId;

    private Integer OrderType;

    private Integer OfficeId;

    private Long WarehouseId;

    private Integer BuyingCustomerType;

    private String DistributorName;

    private String StoreCustomerCode;

    private String StoreCustomerName;

    private String ContactName;

    private Integer ProvinceId;

    private String ProvinceName;

    private Integer CityId;

    private String CityName;

    private Integer DistrictId;

    private String DistrictName;

    private String Address;

    private String Mobile;

    private String Tel;

    private String Postcode;

    private Double TotalMoney;

    private Double Freight;

    private Double DiscountMoney;

    private Double OrderMoney;

    private Integer PaymentType;

    private String PaymentNo;

    private LocalDateTime PaymentTime;

    private Integer PayStatus;

    private LocalDateTime SignTime;

    private String CustomerRemark;

    private String Memo;

    private String DeliveryQrcode;

    private Integer Status;

    private Boolean IsAutoSign;

    private Boolean IsDaigou;

    private Boolean IsPresale;

    private Boolean IsValid;

    private String CreateName;

    private LocalDateTime CreateTime;

    private String UpdateName;

    private LocalDateTime UpdateTime;

    private LocalDateTime PrintAWBTime;


    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public String getReferenceNo() {
        return ReferenceNo;
    }

    public void setReferenceNo(String ReferenceNo) {
        this.ReferenceNo = ReferenceNo;
    }

    public Integer getSourceId() {
        return SourceId;
    }

    public void setSourceId(Integer SourceId) {
        this.SourceId = SourceId;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getSalesmanId() {
        return SalesmanId;
    }

    public void setSalesmanId(Integer SalesmanId) {
        this.SalesmanId = SalesmanId;
    }

    public Integer getOrderType() {
        return OrderType;
    }

    public void setOrderType(Integer OrderType) {
        this.OrderType = OrderType;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public Long getWarehouseId() {
        return WarehouseId;
    }

    public void setWarehouseId(Long WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    public Integer getBuyingCustomerType() {
        return BuyingCustomerType;
    }

    public void setBuyingCustomerType(Integer BuyingCustomerType) {
        this.BuyingCustomerType = BuyingCustomerType;
    }

    public String getDistributorName() {
        return DistributorName;
    }

    public void setDistributorName(String DistributorName) {
        this.DistributorName = DistributorName;
    }

    public String getStoreCustomerCode() {
        return StoreCustomerCode;
    }

    public void setStoreCustomerCode(String StoreCustomerCode) {
        this.StoreCustomerCode = StoreCustomerCode;
    }

    public String getStoreCustomerName() {
        return StoreCustomerName;
    }

    public void setStoreCustomerName(String StoreCustomerName) {
        this.StoreCustomerName = StoreCustomerName;
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

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public Double getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(Double TotalMoney) {
        this.TotalMoney = TotalMoney;
    }

    public Double getFreight() {
        return Freight;
    }

    public void setFreight(Double Freight) {
        this.Freight = Freight;
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

    public Integer getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(Integer PaymentType) {
        this.PaymentType = PaymentType;
    }

    public String getPaymentNo() {
        return PaymentNo;
    }

    public void setPaymentNo(String PaymentNo) {
        this.PaymentNo = PaymentNo;
    }

    public LocalDateTime getPaymentTime() {
        return PaymentTime;
    }

    public void setPaymentTime(LocalDateTime PaymentTime) {
        this.PaymentTime = PaymentTime;
    }

    public Integer getPayStatus() {
        return PayStatus;
    }

    public void setPayStatus(Integer PayStatus) {
        this.PayStatus = PayStatus;
    }

    public LocalDateTime getSignTime() {
        return SignTime;
    }

    public void setSignTime(LocalDateTime SignTime) {
        this.SignTime = SignTime;
    }

    public String getCustomerRemark() {
        return CustomerRemark;
    }

    public void setCustomerRemark(String CustomerRemark) {
        this.CustomerRemark = CustomerRemark;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    public String getDeliveryQrcode() {
        return DeliveryQrcode;
    }

    public void setDeliveryQrcode(String DeliveryQrcode) {
        this.DeliveryQrcode = DeliveryQrcode;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public Boolean getIsAutoSign() {
        return IsAutoSign;
    }

    public void setIsAutoSign(Boolean IsAutoSign) {
        this.IsAutoSign = IsAutoSign;
    }

    public Boolean getIsDaigou() {
        return IsDaigou;
    }

    public void setIsDaigou(Boolean IsDaigou) {
        this.IsDaigou = IsDaigou;
    }

    public Boolean getIsPresale() {
        return IsPresale;
    }

    public void setIsPresale(Boolean IsPresale) {
        this.IsPresale = IsPresale;
    }

    public Boolean getIsValid() {
        return IsValid;
    }

    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public LocalDateTime getPrintAWBTime() {
        return PrintAWBTime;
    }

    public void setPrintAWBTime(LocalDateTime PrintAWBTime) {
        this.PrintAWBTime = PrintAWBTime;
    }

    @Override
    public String toString() {
        return "StoreOrder{" +
        "OrderId=" + OrderId +
        ", OrderNo=" + OrderNo +
        ", ReferenceNo=" + ReferenceNo +
        ", SourceId=" + SourceId +
        ", CustomerId=" + CustomerId +
        ", SalesmanId=" + SalesmanId +
        ", OrderType=" + OrderType +
        ", OfficeId=" + OfficeId +
        ", WarehouseId=" + WarehouseId +
        ", BuyingCustomerType=" + BuyingCustomerType +
        ", DistributorName=" + DistributorName +
        ", StoreCustomerCode=" + StoreCustomerCode +
        ", StoreCustomerName=" + StoreCustomerName +
        ", ContactName=" + ContactName +
        ", ProvinceId=" + ProvinceId +
        ", ProvinceName=" + ProvinceName +
        ", CityId=" + CityId +
        ", CityName=" + CityName +
        ", DistrictId=" + DistrictId +
        ", DistrictName=" + DistrictName +
        ", Address=" + Address +
        ", Mobile=" + Mobile +
        ", Tel=" + Tel +
        ", Postcode=" + Postcode +
        ", TotalMoney=" + TotalMoney +
        ", Freight=" + Freight +
        ", DiscountMoney=" + DiscountMoney +
        ", OrderMoney=" + OrderMoney +
        ", PaymentType=" + PaymentType +
        ", PaymentNo=" + PaymentNo +
        ", PaymentTime=" + PaymentTime +
        ", PayStatus=" + PayStatus +
        ", SignTime=" + SignTime +
        ", CustomerRemark=" + CustomerRemark +
        ", Memo=" + Memo +
        ", DeliveryQrcode=" + DeliveryQrcode +
        ", Status=" + Status +
        ", IsAutoSign=" + IsAutoSign +
        ", IsDaigou=" + IsDaigou +
        ", IsPresale=" + IsPresale +
        ", IsValid=" + IsValid +
        ", CreateName=" + CreateName +
        ", CreateTime=" + CreateTime +
        ", UpdateName=" + UpdateName +
        ", UpdateTime=" + UpdateTime +
        ", PrintAWBTime=" + PrintAWBTime +
        "}";
    }
}
