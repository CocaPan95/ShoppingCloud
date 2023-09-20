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
public class V_OrderDeliveryPrint implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer OrderId;

    private String ExpressNo;

    private LocalDateTime DeliveryTime;

    private String PackageNo;

    private Integer SkuId;

    private LocalDateTime CreateTime;

    private Integer Status;

    private LocalDateTime SignTime;

    private String OrderNo;

    private Integer ProvinceId;

    private Integer AreaId;

    private Integer CityId;

    private Integer DistrictId;

    private Long CustomerId;

    private Long OrderShipPrintId;


    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public String getExpressNo() {
        return ExpressNo;
    }

    public void setExpressNo(String ExpressNo) {
        this.ExpressNo = ExpressNo;
    }

    public LocalDateTime getDeliveryTime() {
        return DeliveryTime;
    }

    public void setDeliveryTime(LocalDateTime DeliveryTime) {
        this.DeliveryTime = DeliveryTime;
    }

    public String getPackageNo() {
        return PackageNo;
    }

    public void setPackageNo(String PackageNo) {
        this.PackageNo = PackageNo;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public LocalDateTime getSignTime() {
        return SignTime;
    }

    public void setSignTime(LocalDateTime SignTime) {
        this.SignTime = SignTime;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public Integer getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(Integer ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    public Integer getAreaId() {
        return AreaId;
    }

    public void setAreaId(Integer AreaId) {
        this.AreaId = AreaId;
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

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Long getOrderShipPrintId() {
        return OrderShipPrintId;
    }

    public void setOrderShipPrintId(Long OrderShipPrintId) {
        this.OrderShipPrintId = OrderShipPrintId;
    }

    @Override
    public String toString() {
        return "V_OrderDeliveryPrint{" +
        "OrderId=" + OrderId +
        ", ExpressNo=" + ExpressNo +
        ", DeliveryTime=" + DeliveryTime +
        ", PackageNo=" + PackageNo +
        ", SkuId=" + SkuId +
        ", CreateTime=" + CreateTime +
        ", Status=" + Status +
        ", SignTime=" + SignTime +
        ", OrderNo=" + OrderNo +
        ", ProvinceId=" + ProvinceId +
        ", AreaId=" + AreaId +
        ", CityId=" + CityId +
        ", DistrictId=" + DistrictId +
        ", CustomerId=" + CustomerId +
        ", OrderShipPrintId=" + OrderShipPrintId +
        "}";
    }
}
