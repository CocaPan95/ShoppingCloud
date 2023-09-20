package com.shop.model.entity;

import java.io.Serializable;

/**
 * <p>
 * 1
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class V_OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private String SkuName;

    private Integer Qty;

    private String ProductLabel;

    private Integer OrderId;

    private Integer OwnerId;

    private String Unit;

    private Integer OrderItemId;

    private Integer SpecText;

    private Double MarketPrice;

    private Double SalePrice;

    private Double SubTotalMoney;

    private Integer SkuId;

    private String SkuCode;

    private String ImageUrl;

    private Double Volume;

    private Double Weight;

    private Boolean IsSalesmanBuy;

    private Integer MadeIn;

    private String orderNo;

    private Integer Type;

    private Integer ActivitySkuId;

    private Integer SkuType;


    public String getSkuName() {
        return SkuName;
    }

    public void setSkuName(String SkuName) {
        this.SkuName = SkuName;
    }

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer Qty) {
        this.Qty = Qty;
    }

    public String getProductLabel() {
        return ProductLabel;
    }

    public void setProductLabel(String ProductLabel) {
        this.ProductLabel = ProductLabel;
    }

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public Integer getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(Integer OwnerId) {
        this.OwnerId = OwnerId;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public Integer getOrderItemId() {
        return OrderItemId;
    }

    public void setOrderItemId(Integer OrderItemId) {
        this.OrderItemId = OrderItemId;
    }

    public Integer getSpecText() {
        return SpecText;
    }

    public void setSpecText(Integer SpecText) {
        this.SpecText = SpecText;
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

    public Double getSubTotalMoney() {
        return SubTotalMoney;
    }

    public void setSubTotalMoney(Double SubTotalMoney) {
        this.SubTotalMoney = SubTotalMoney;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public String getSkuCode() {
        return SkuCode;
    }

    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public Double getVolume() {
        return Volume;
    }

    public void setVolume(Double Volume) {
        this.Volume = Volume;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double Weight) {
        this.Weight = Weight;
    }

    public Boolean getIsSalesmanBuy() {
        return IsSalesmanBuy;
    }

    public void setIsSalesmanBuy(Boolean IsSalesmanBuy) {
        this.IsSalesmanBuy = IsSalesmanBuy;
    }

    public Integer getMadeIn() {
        return MadeIn;
    }

    public void setMadeIn(Integer MadeIn) {
        this.MadeIn = MadeIn;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
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

    public Integer getSkuType() {
        return SkuType;
    }

    public void setSkuType(Integer SkuType) {
        this.SkuType = SkuType;
    }

    @Override
    public String toString() {
        return "V_OrderItem{" +
        "SkuName=" + SkuName +
        ", Qty=" + Qty +
        ", ProductLabel=" + ProductLabel +
        ", OrderId=" + OrderId +
        ", OwnerId=" + OwnerId +
        ", Unit=" + Unit +
        ", OrderItemId=" + OrderItemId +
        ", SpecText=" + SpecText +
        ", MarketPrice=" + MarketPrice +
        ", SalePrice=" + SalePrice +
        ", SubTotalMoney=" + SubTotalMoney +
        ", SkuId=" + SkuId +
        ", SkuCode=" + SkuCode +
        ", ImageUrl=" + ImageUrl +
        ", Volume=" + Volume +
        ", Weight=" + Weight +
        ", IsSalesmanBuy=" + IsSalesmanBuy +
        ", MadeIn=" + MadeIn +
        ", orderNo=" + orderNo +
        ", Type=" + Type +
        ", ActivitySkuId=" + ActivitySkuId +
        ", SkuType=" + SkuType +
        "}";
    }
}
