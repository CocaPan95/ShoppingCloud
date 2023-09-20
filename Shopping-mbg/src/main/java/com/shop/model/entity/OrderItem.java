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
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单明细Id
     */
    private Integer OrderItemId;

    /**
     * 订单Id
     */
    private Integer OrderId;

    private Integer SkuId;

    private Double MarketPrice;

    /**
     * 销售价
     */
    private Double SalePrice;

    /**
     * 数量
     */
    private Integer Qty;

    /**
     * 优惠金额
     */
    private Double DiscountMoney;

    /**
     * 商品金额小计
     */
    private Double SubTotalMoney;

    private Integer ActivitySkuId;

    private Integer Type;


    public Integer getOrderItemId() {
        return OrderItemId;
    }

    public void setOrderItemId(Integer OrderItemId) {
        this.OrderItemId = OrderItemId;
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
        return "OrderItem{" +
        "OrderItemId=" + OrderItemId +
        ", OrderId=" + OrderId +
        ", SkuId=" + SkuId +
        ", MarketPrice=" + MarketPrice +
        ", SalePrice=" + SalePrice +
        ", Qty=" + Qty +
        ", DiscountMoney=" + DiscountMoney +
        ", SubTotalMoney=" + SubTotalMoney +
        ", ActivitySkuId=" + ActivitySkuId +
        ", Type=" + Type +
        "}";
    }
}
