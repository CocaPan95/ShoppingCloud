package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 1
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class V_OrderExcelV2 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String StoreName;

    private Integer OrderId;

    private String OrderNo;

    private Boolean IsPresale;

    private Integer OfficeId;

    private Integer ProvinceId;

    private Integer Status;

    private String SkuCode;

    private String SkuName;

    private Double SalePrice;

    private Integer Qty;

    private Integer SpecText;

    private Integer BagNum;

    private LocalDateTime CreateTime;

    private LocalDateTime PaymentTime;

    private Boolean IsValid;

    private Integer VipNum;

    private String ContactName;

    private String Mobile;

    private String CustomerRemark;

    private String CustomerCode;

    private LocalDateTime TrueDeliveryTime;

    private String VipNumName;

    private String MadeIn;

    private String StoreRealName;

    private Integer SkuId;

    private Integer CompanyId;

    private String CompanyAlias;

    private Double DiscountMoney;

    private Double TotalMoney;

    private String StoreMobile;

    private Integer CustomerId;

    private Integer SalesId;

    private Integer PaymentType;

    private String OwnerName;

    private Boolean IsDaigou;

    private Integer Type;

    private Integer ActivitySkuId;

    private Double OrderDiscountMoney;

    private Double OrderMoney;


    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

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

    public Boolean getIsPresale() {
        return IsPresale;
    }

    public void setIsPresale(Boolean IsPresale) {
        this.IsPresale = IsPresale;
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

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getSkuCode() {
        return SkuCode;
    }

    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    public String getSkuName() {
        return SkuName;
    }

    public void setSkuName(String SkuName) {
        this.SkuName = SkuName;
    }

    public Double getSalePrice() {
        return SalePrice;
    }

    public void setSalePrice(Double SalePrice) {
        this.SalePrice = SalePrice;
    }

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer Qty) {
        this.Qty = Qty;
    }

    public Integer getSpecText() {
        return SpecText;
    }

    public void setSpecText(Integer SpecText) {
        this.SpecText = SpecText;
    }

    public Integer getBagNum() {
        return BagNum;
    }

    public void setBagNum(Integer BagNum) {
        this.BagNum = BagNum;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LocalDateTime getPaymentTime() {
        return PaymentTime;
    }

    public void setPaymentTime(LocalDateTime PaymentTime) {
        this.PaymentTime = PaymentTime;
    }

    public Boolean getIsValid() {
        return IsValid;
    }

    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    public Integer getVipNum() {
        return VipNum;
    }

    public void setVipNum(Integer VipNum) {
        this.VipNum = VipNum;
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

    public String getCustomerRemark() {
        return CustomerRemark;
    }

    public void setCustomerRemark(String CustomerRemark) {
        this.CustomerRemark = CustomerRemark;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }

    public LocalDateTime getTrueDeliveryTime() {
        return TrueDeliveryTime;
    }

    public void setTrueDeliveryTime(LocalDateTime TrueDeliveryTime) {
        this.TrueDeliveryTime = TrueDeliveryTime;
    }

    public String getVipNumName() {
        return VipNumName;
    }

    public void setVipNumName(String VipNumName) {
        this.VipNumName = VipNumName;
    }

    public String getMadeIn() {
        return MadeIn;
    }

    public void setMadeIn(String MadeIn) {
        this.MadeIn = MadeIn;
    }

    public String getStoreRealName() {
        return StoreRealName;
    }

    public void setStoreRealName(String StoreRealName) {
        this.StoreRealName = StoreRealName;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
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

    public Double getDiscountMoney() {
        return DiscountMoney;
    }

    public void setDiscountMoney(Double DiscountMoney) {
        this.DiscountMoney = DiscountMoney;
    }

    public Double getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(Double TotalMoney) {
        this.TotalMoney = TotalMoney;
    }

    public String getStoreMobile() {
        return StoreMobile;
    }

    public void setStoreMobile(String StoreMobile) {
        this.StoreMobile = StoreMobile;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getSalesId() {
        return SalesId;
    }

    public void setSalesId(Integer SalesId) {
        this.SalesId = SalesId;
    }

    public Integer getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(Integer PaymentType) {
        this.PaymentType = PaymentType;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public Boolean getIsDaigou() {
        return IsDaigou;
    }

    public void setIsDaigou(Boolean IsDaigou) {
        this.IsDaigou = IsDaigou;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public Integer getActivitySkuId() {
        return ActivitySkuId;
    }

    public void setActivitySkuId(Integer ActivitySkuId) {
        this.ActivitySkuId = ActivitySkuId;
    }

    public Double getOrderDiscountMoney() {
        return OrderDiscountMoney;
    }

    public void setOrderDiscountMoney(Double OrderDiscountMoney) {
        this.OrderDiscountMoney = OrderDiscountMoney;
    }

    public Double getOrderMoney() {
        return OrderMoney;
    }

    public void setOrderMoney(Double OrderMoney) {
        this.OrderMoney = OrderMoney;
    }

    @Override
    public String toString() {
        return "V_OrderExcelV2{" +
        "StoreName=" + StoreName +
        ", OrderId=" + OrderId +
        ", OrderNo=" + OrderNo +
        ", IsPresale=" + IsPresale +
        ", OfficeId=" + OfficeId +
        ", ProvinceId=" + ProvinceId +
        ", Status=" + Status +
        ", SkuCode=" + SkuCode +
        ", SkuName=" + SkuName +
        ", SalePrice=" + SalePrice +
        ", Qty=" + Qty +
        ", SpecText=" + SpecText +
        ", BagNum=" + BagNum +
        ", CreateTime=" + CreateTime +
        ", PaymentTime=" + PaymentTime +
        ", IsValid=" + IsValid +
        ", VipNum=" + VipNum +
        ", ContactName=" + ContactName +
        ", Mobile=" + Mobile +
        ", CustomerRemark=" + CustomerRemark +
        ", CustomerCode=" + CustomerCode +
        ", TrueDeliveryTime=" + TrueDeliveryTime +
        ", VipNumName=" + VipNumName +
        ", MadeIn=" + MadeIn +
        ", StoreRealName=" + StoreRealName +
        ", SkuId=" + SkuId +
        ", CompanyId=" + CompanyId +
        ", CompanyAlias=" + CompanyAlias +
        ", DiscountMoney=" + DiscountMoney +
        ", TotalMoney=" + TotalMoney +
        ", StoreMobile=" + StoreMobile +
        ", CustomerId=" + CustomerId +
        ", SalesId=" + SalesId +
        ", PaymentType=" + PaymentType +
        ", OwnerName=" + OwnerName +
        ", IsDaigou=" + IsDaigou +
        ", Type=" + Type +
        ", ActivitySkuId=" + ActivitySkuId +
        ", OrderDiscountMoney=" + OrderDiscountMoney +
        ", OrderMoney=" + OrderMoney +
        "}";
    }
}
