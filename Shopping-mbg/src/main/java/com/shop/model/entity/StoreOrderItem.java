package com.shop.model.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class StoreOrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long OrderItemId;

    private Long OrderId;

    private Integer SkuId;

    private Double MarketPrice;

    private Double SalePrice;

    private Integer Qty;

    private Double DiscountMoney;

    private Double SubTotalMoney;

    private Long ActivityId;

    private Integer ActivitySkuId;

    private Integer Type;


    public Long getOrderItemId() {
        return OrderItemId;
    }

    public void setOrderItemId(Long OrderItemId) {
        this.OrderItemId = OrderItemId;
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

    public Double getMarketPrice() {
        return MarketPrice;
    }

    public void setMarketPrice(Double MarketPrice) {
        this.MarketPrice = MarketPrice;
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

    public Double getDiscountMoney() {
        return DiscountMoney;
    }

    public void setDiscountMoney(Double DiscountMoney) {
        this.DiscountMoney = DiscountMoney;
    }

    public Double getSubTotalMoney() {
        return SubTotalMoney;
    }

    public void setSubTotalMoney(Double SubTotalMoney) {
        this.SubTotalMoney = SubTotalMoney;
    }

    public Long getActivityId() {
        return ActivityId;
    }

    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    public Integer getActivitySkuId() {
        return ActivitySkuId;
    }

    public void setActivitySkuId(Integer ActivitySkuId) {
        this.ActivitySkuId = ActivitySkuId;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "StoreOrderItem{" +
        "OrderItemId=" + OrderItemId +
        ", OrderId=" + OrderId +
        ", SkuId=" + SkuId +
        ", MarketPrice=" + MarketPrice +
        ", SalePrice=" + SalePrice +
        ", Qty=" + Qty +
        ", DiscountMoney=" + DiscountMoney +
        ", SubTotalMoney=" + SubTotalMoney +
        ", ActivityId=" + ActivityId +
        ", ActivitySkuId=" + ActivitySkuId +
        ", Type=" + Type +
        "}";
    }
}
