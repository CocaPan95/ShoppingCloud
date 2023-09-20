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
public class V_Delivery implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer OfficeId;

    private Integer ExpressId;

    private String AreaName;

    private String OrderNo;

    private Integer OrderId;

    private Integer DeliveryId;

    private String ExpressName;

    private String ExpressNo;

    private Double DeliveryMoney;

    private LocalDateTime DeliveryTime;

    private LocalDateTime SignTime;

    private Integer SkuId;

    private Integer DeliveryAmount;

    private String SkuName;

    private LocalDateTime TDeliveryTime;

    private String PackageNo;

    private Integer ActivitySkuId;


    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public Integer getExpressId() {
        return ExpressId;
    }

    public void setExpressId(Integer ExpressId) {
        this.ExpressId = ExpressId;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public Integer getDeliveryId() {
        return DeliveryId;
    }

    public void setDeliveryId(Integer DeliveryId) {
        this.DeliveryId = DeliveryId;
    }

    public String getExpressName() {
        return ExpressName;
    }

    public void setExpressName(String ExpressName) {
        this.ExpressName = ExpressName;
    }

    public String getExpressNo() {
        return ExpressNo;
    }

    public void setExpressNo(String ExpressNo) {
        this.ExpressNo = ExpressNo;
    }

    public Double getDeliveryMoney() {
        return DeliveryMoney;
    }

    public void setDeliveryMoney(Double DeliveryMoney) {
        this.DeliveryMoney = DeliveryMoney;
    }

    public LocalDateTime getDeliveryTime() {
        return DeliveryTime;
    }

    public void setDeliveryTime(LocalDateTime DeliveryTime) {
        this.DeliveryTime = DeliveryTime;
    }

    public LocalDateTime getSignTime() {
        return SignTime;
    }

    public void setSignTime(LocalDateTime SignTime) {
        this.SignTime = SignTime;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getDeliveryAmount() {
        return DeliveryAmount;
    }

    public void setDeliveryAmount(Integer DeliveryAmount) {
        this.DeliveryAmount = DeliveryAmount;
    }

    public String getSkuName() {
        return SkuName;
    }

    public void setSkuName(String SkuName) {
        this.SkuName = SkuName;
    }

    public LocalDateTime getTDeliveryTime() {
        return TDeliveryTime;
    }

    public void setTDeliveryTime(LocalDateTime TDeliveryTime) {
        this.TDeliveryTime = TDeliveryTime;
    }

    public String getPackageNo() {
        return PackageNo;
    }

    public void setPackageNo(String PackageNo) {
        this.PackageNo = PackageNo;
    }

    public Integer getActivitySkuId() {
        return ActivitySkuId;
    }

    public void setActivitySkuId(Integer ActivitySkuId) {
        this.ActivitySkuId = ActivitySkuId;
    }

    @Override
    public String toString() {
        return "V_Delivery{" +
        "OfficeId=" + OfficeId +
        ", ExpressId=" + ExpressId +
        ", AreaName=" + AreaName +
        ", OrderNo=" + OrderNo +
        ", OrderId=" + OrderId +
        ", DeliveryId=" + DeliveryId +
        ", ExpressName=" + ExpressName +
        ", ExpressNo=" + ExpressNo +
        ", DeliveryMoney=" + DeliveryMoney +
        ", DeliveryTime=" + DeliveryTime +
        ", SignTime=" + SignTime +
        ", SkuId=" + SkuId +
        ", DeliveryAmount=" + DeliveryAmount +
        ", SkuName=" + SkuName +
        ", TDeliveryTime=" + TDeliveryTime +
        ", PackageNo=" + PackageNo +
        ", ActivitySkuId=" + ActivitySkuId +
        "}";
    }
}
