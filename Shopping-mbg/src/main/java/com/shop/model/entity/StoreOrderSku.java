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
public class StoreOrderSku implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long OrderSkuId;

    private Long OrderId;

    private Integer SkuId;

    private Integer OwnerId;

    private Integer SpecText;

    private String SkuCode;

    private Integer SkuType;

    private String Unit;

    private LocalDateTime CreateTime;


    public Long getOrderSkuId() {
        return OrderSkuId;
    }

    public void setOrderSkuId(Long OrderSkuId) {
        this.OrderSkuId = OrderSkuId;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(Integer OwnerId) {
        this.OwnerId = OwnerId;
    }

    public Integer getSpecText() {
        return SpecText;
    }

    public void setSpecText(Integer SpecText) {
        this.SpecText = SpecText;
    }

    public String getSkuCode() {
        return SkuCode;
    }

    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    public Integer getSkuType() {
        return SkuType;
    }

    public void setSkuType(Integer SkuType) {
        this.SkuType = SkuType;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "StoreOrderSku{" +
        "OrderSkuId=" + OrderSkuId +
        ", OrderId=" + OrderId +
        ", SkuId=" + SkuId +
        ", OwnerId=" + OwnerId +
        ", SpecText=" + SpecText +
        ", SkuCode=" + SkuCode +
        ", SkuType=" + SkuType +
        ", Unit=" + Unit +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
