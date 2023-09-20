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
public class Delivery implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer DeliveryId;

    private Integer OrderId;

    private Integer SkuId;

    private Integer DeliveryAmount;

    private LocalDateTime DeliveryTime;

    private Integer ExpressId;

    private String ExpressNo;

    private Double DeliveryMoney;

    private Boolean IsSign;

    private LocalDateTime SignTime;

    private String PackageNo;

    private Integer ActivitySkuId;

    private LocalDateTime CreateTime;

    private String CreateName;

    private LocalDateTime UpdateTime;

    private String UpdateName;


    public Integer getDeliveryId() {
        return DeliveryId;
    }

    public void setDeliveryId(Integer DeliveryId) {
        this.DeliveryId = DeliveryId;
    }

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
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

    public LocalDateTime getDeliveryTime() {
        return DeliveryTime;
    }

    public void setDeliveryTime(LocalDateTime DeliveryTime) {
        this.DeliveryTime = DeliveryTime;
    }

    public Integer getExpressId() {
        return ExpressId;
    }

    public void setExpressId(Integer ExpressId) {
        this.ExpressId = ExpressId;
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

    public Boolean getIsSign() {
        return IsSign;
    }

    public void setIsSign(Boolean IsSign) {
        this.IsSign = IsSign;
    }

    public LocalDateTime getSignTime() {
        return SignTime;
    }

    public void setSignTime(LocalDateTime SignTime) {
        this.SignTime = SignTime;
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

    @Override
    public String toString() {
        return "Delivery{" +
        "DeliveryId=" + DeliveryId +
        ", OrderId=" + OrderId +
        ", SkuId=" + SkuId +
        ", DeliveryAmount=" + DeliveryAmount +
        ", DeliveryTime=" + DeliveryTime +
        ", ExpressId=" + ExpressId +
        ", ExpressNo=" + ExpressNo +
        ", DeliveryMoney=" + DeliveryMoney +
        ", IsSign=" + IsSign +
        ", SignTime=" + SignTime +
        ", PackageNo=" + PackageNo +
        ", ActivitySkuId=" + ActivitySkuId +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        ", UpdateTime=" + UpdateTime +
        ", UpdateName=" + UpdateName +
        "}";
    }
}
