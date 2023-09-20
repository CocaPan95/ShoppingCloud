package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 2
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class V_CustomerFavorite implements Serializable {

    private static final long serialVersionUID = 1L;

    private String SkuCode;

    private String SkuName;

    private Integer StockNum;

    private Double SalePrice;

    private Double MarketPrice;

    private Long CustomerId;

    private Boolean IsValid;

    private LocalDateTime CreateTime;

    private String ImageUrl;

    private Integer SpecText;

    private Boolean IsSale;

    private Integer SkuId;

    private Integer ProductId;

    private Boolean IsSalesmanBuy;

    private Boolean IsCanPurchase;

    private Integer SkuType;

    private Integer OfficeId;

    private Long WarehouseId;

    private Integer Offer;


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

    public Integer getStockNum() {
        return StockNum;
    }

    public void setStockNum(Integer StockNum) {
        this.StockNum = StockNum;
    }

    public Double getSalePrice() {
        return SalePrice;
    }

    public void setSalePrice(Double SalePrice) {
        this.SalePrice = SalePrice;
    }

    public Double getMarketPrice() {
        return MarketPrice;
    }

    public void setMarketPrice(Double MarketPrice) {
        this.MarketPrice = MarketPrice;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Boolean getIsValid() {
        return IsValid;
    }

    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public Integer getSpecText() {
        return SpecText;
    }

    public void setSpecText(Integer SpecText) {
        this.SpecText = SpecText;
    }

    public Boolean getIsSale() {
        return IsSale;
    }

    public void setIsSale(Boolean IsSale) {
        this.IsSale = IsSale;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer ProductId) {
        this.ProductId = ProductId;
    }

    public Boolean getIsSalesmanBuy() {
        return IsSalesmanBuy;
    }

    public void setIsSalesmanBuy(Boolean IsSalesmanBuy) {
        this.IsSalesmanBuy = IsSalesmanBuy;
    }

    public Boolean getIsCanPurchase() {
        return IsCanPurchase;
    }

    public void setIsCanPurchase(Boolean IsCanPurchase) {
        this.IsCanPurchase = IsCanPurchase;
    }

    public Integer getSkuType() {
        return SkuType;
    }

    public void setSkuType(Integer SkuType) {
        this.SkuType = SkuType;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public Long getWarehouseId() {
        return WarehouseId;
    }

    public void setWarehouseId(Long WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    public Integer getOffer() {
        return Offer;
    }

    public void setOffer(Integer Offer) {
        this.Offer = Offer;
    }

    @Override
    public String toString() {
        return "V_CustomerFavorite{" +
        "SkuCode=" + SkuCode +
        ", SkuName=" + SkuName +
        ", StockNum=" + StockNum +
        ", SalePrice=" + SalePrice +
        ", MarketPrice=" + MarketPrice +
        ", CustomerId=" + CustomerId +
        ", IsValid=" + IsValid +
        ", CreateTime=" + CreateTime +
        ", ImageUrl=" + ImageUrl +
        ", SpecText=" + SpecText +
        ", IsSale=" + IsSale +
        ", SkuId=" + SkuId +
        ", ProductId=" + ProductId +
        ", IsSalesmanBuy=" + IsSalesmanBuy +
        ", IsCanPurchase=" + IsCanPurchase +
        ", SkuType=" + SkuType +
        ", OfficeId=" + OfficeId +
        ", WarehouseId=" + WarehouseId +
        ", Offer=" + Offer +
        "}";
    }
}
