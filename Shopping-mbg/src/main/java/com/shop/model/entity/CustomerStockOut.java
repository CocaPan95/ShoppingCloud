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
public class CustomerStockOut implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Long CustomerId;

    private Integer OrderId;

    private Integer SkuId;

    private Integer OutboundQty;

    private Long Version;

    private String CreateBy;

    private LocalDateTime CreateTime;

    private String UpdateBy;

    private LocalDateTime UpdateTime;

    private Integer Id;

    private Long CustomerId;

    private Integer OrderId;

    private Integer SkuId;

    private Integer OutboundQty;

    private Long Version;

    private String CreateBy;

    private LocalDateTime CreateTime;

    private String UpdateBy;

    private LocalDateTime UpdateTime;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
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

    public Integer getOutboundQty() {
        return OutboundQty;
    }

    public void setOutboundQty(Integer OutboundQty) {
        this.OutboundQty = OutboundQty;
    }

    public Long getVersion() {
        return Version;
    }

    public void setVersion(Long Version) {
        this.Version = Version;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getUpdateBy() {
        return UpdateBy;
    }

    public void setUpdateBy(String UpdateBy) {
        this.UpdateBy = UpdateBy;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
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

    public Integer getOutboundQty() {
        return OutboundQty;
    }

    public void setOutboundQty(Integer OutboundQty) {
        this.OutboundQty = OutboundQty;
    }

    public Long getVersion() {
        return Version;
    }

    public void setVersion(Long Version) {
        this.Version = Version;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getUpdateBy() {
        return UpdateBy;
    }

    public void setUpdateBy(String UpdateBy) {
        this.UpdateBy = UpdateBy;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    @Override
    public String toString() {
        return "CustomerStockOut{" +
        "Id=" + Id +
        ", CustomerId=" + CustomerId +
        ", OrderId=" + OrderId +
        ", SkuId=" + SkuId +
        ", OutboundQty=" + OutboundQty +
        ", Version=" + Version +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        ", UpdateBy=" + UpdateBy +
        ", UpdateTime=" + UpdateTime +
        ", Id=" + Id +
        ", CustomerId=" + CustomerId +
        ", OrderId=" + OrderId +
        ", SkuId=" + SkuId +
        ", OutboundQty=" + OutboundQty +
        ", Version=" + Version +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        ", UpdateBy=" + UpdateBy +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
