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
public class V_PdaOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer OrderId;

    private String ContactName;

    private String ProvinceName;

    private String CityName;

    private String DistrictName;

    private String Address;

    private String Mobile;

    private LocalDateTime PaymentTime;

    private String CustomerCode;

    private String OrderNo;

    private Long CustomerId;


    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
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

    public LocalDateTime getPaymentTime() {
        return PaymentTime;
    }

    public void setPaymentTime(LocalDateTime PaymentTime) {
        this.PaymentTime = PaymentTime;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    @Override
    public String toString() {
        return "V_PdaOrder{" +
        "OrderId=" + OrderId +
        ", ContactName=" + ContactName +
        ", ProvinceName=" + ProvinceName +
        ", CityName=" + CityName +
        ", DistrictName=" + DistrictName +
        ", Address=" + Address +
        ", Mobile=" + Mobile +
        ", PaymentTime=" + PaymentTime +
        ", CustomerCode=" + CustomerCode +
        ", OrderNo=" + OrderNo +
        ", CustomerId=" + CustomerId +
        "}";
    }
}
