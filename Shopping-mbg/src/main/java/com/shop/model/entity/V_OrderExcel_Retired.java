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
public class V_OrderExcel_Retired implements Serializable {

    private static final long serialVersionUID = 1L;

    private String OfficeName;

    private String StoreName;

    private Integer OrderId;

    private String OrderNo;

    private Boolean IsPresale;

    private String AreaId;

    private Integer OfficeId;

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

    private Integer CustomerId;

    private Integer SalesId;

    private String MadeIn;


    public String getOfficeName() {
        return OfficeName;
    }

    public void setOfficeName(String OfficeName) {
        this.OfficeName = OfficeName;
    }

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

    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String AreaId) {
        this.AreaId = AreaId;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
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

    public String getMadeIn() {
        return MadeIn;
    }

    public void setMadeIn(String MadeIn) {
        this.MadeIn = MadeIn;
    }

    @Override
    public String toString() {
        return "V_OrderExcel_Retired{" +
        "OfficeName=" + OfficeName +
        ", StoreName=" + StoreName +
        ", OrderId=" + OrderId +
        ", OrderNo=" + OrderNo +
        ", IsPresale=" + IsPresale +
        ", AreaId=" + AreaId +
        ", OfficeId=" + OfficeId +
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
        ", CustomerId=" + CustomerId +
        ", SalesId=" + SalesId +
        ", MadeIn=" + MadeIn +
        "}";
    }
}
