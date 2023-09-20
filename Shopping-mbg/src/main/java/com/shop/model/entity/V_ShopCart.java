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
public class V_ShopCart implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer SkuId;

    private String SkuName;

    private String SkuCode;

    private Double MarketPrice;

    private Double SalePrice;

    private String ImageUrl;

    private Integer WarehouseId;

    private Integer StockNum;

    private Integer ProductId;

    private String ProductName;

    private String ProductLabel;

    private String CategoryName;

    private String BrandName;

    private Integer CategoryId;

    private Integer BrandId;

    private String Unit;

    private Boolean IsCanPurchase;

    private Integer SpecText;

    private String ProductInfo;

    private LocalDateTime OnSaleTime;

    private Integer ItemId;

    private Integer CustomerId;

    private Integer UserType;

    private LocalDateTime CreateTime;

    private Integer OfficeId;

    private Integer ProvinceId;

    private String RealName;

    private String StoreName;

    private Integer Qty;

    private Boolean IsSale;

    private Boolean IsPresale;

    private LocalDateTime BeginTime;

    private LocalDateTime EndTime;

    private Boolean IsSalesmanBuy;

    private Integer OwnerId;

    private Long PrId;

    private Integer SkuType;

    private Boolean IsPurchaseDirectSku;


    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public String getSkuName() {
        return SkuName;
    }

    public void setSkuName(String SkuName) {
        this.SkuName = SkuName;
    }

    public String getSkuCode() {
        return SkuCode;
    }

    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
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

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public Integer getWarehouseId() {
        return WarehouseId;
    }

    public void setWarehouseId(Integer WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    public Integer getStockNum() {
        return StockNum;
    }

    public void setStockNum(Integer StockNum) {
        this.StockNum = StockNum;
    }

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer ProductId) {
        this.ProductId = ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductLabel() {
        return ProductLabel;
    }

    public void setProductLabel(String ProductLabel) {
        this.ProductLabel = ProductLabel;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public Integer getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(Integer CategoryId) {
        this.CategoryId = CategoryId;
    }

    public Integer getBrandId() {
        return BrandId;
    }

    public void setBrandId(Integer BrandId) {
        this.BrandId = BrandId;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public Boolean getIsCanPurchase() {
        return IsCanPurchase;
    }

    public void setIsCanPurchase(Boolean IsCanPurchase) {
        this.IsCanPurchase = IsCanPurchase;
    }

    public Integer getSpecText() {
        return SpecText;
    }

    public void setSpecText(Integer SpecText) {
        this.SpecText = SpecText;
    }

    public String getProductInfo() {
        return ProductInfo;
    }

    public void setProductInfo(String ProductInfo) {
        this.ProductInfo = ProductInfo;
    }

    public LocalDateTime getOnSaleTime() {
        return OnSaleTime;
    }

    public void setOnSaleTime(LocalDateTime OnSaleTime) {
        this.OnSaleTime = OnSaleTime;
    }

    public Integer getItemId() {
        return ItemId;
    }

    public void setItemId(Integer ItemId) {
        this.ItemId = ItemId;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getUserType() {
        return UserType;
    }

    public void setUserType(Integer UserType) {
        this.UserType = UserType;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public Integer getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(Integer ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer Qty) {
        this.Qty = Qty;
    }

    public Boolean getIsSale() {
        return IsSale;
    }

    public void setIsSale(Boolean IsSale) {
        this.IsSale = IsSale;
    }

    public Boolean getIsPresale() {
        return IsPresale;
    }

    public void setIsPresale(Boolean IsPresale) {
        this.IsPresale = IsPresale;
    }

    public LocalDateTime getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(LocalDateTime BeginTime) {
        this.BeginTime = BeginTime;
    }

    public LocalDateTime getEndTime() {
        return EndTime;
    }

    public void setEndTime(LocalDateTime EndTime) {
        this.EndTime = EndTime;
    }

    public Boolean getIsSalesmanBuy() {
        return IsSalesmanBuy;
    }

    public void setIsSalesmanBuy(Boolean IsSalesmanBuy) {
        this.IsSalesmanBuy = IsSalesmanBuy;
    }

    public Integer getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(Integer OwnerId) {
        this.OwnerId = OwnerId;
    }

    public Long getPrId() {
        return PrId;
    }

    public void setPrId(Long PrId) {
        this.PrId = PrId;
    }

    public Integer getSkuType() {
        return SkuType;
    }

    public void setSkuType(Integer SkuType) {
        this.SkuType = SkuType;
    }

    public Boolean getIsPurchaseDirectSku() {
        return IsPurchaseDirectSku;
    }

    public void setIsPurchaseDirectSku(Boolean IsPurchaseDirectSku) {
        this.IsPurchaseDirectSku = IsPurchaseDirectSku;
    }

    @Override
    public String toString() {
        return "V_ShopCart{" +
        "SkuId=" + SkuId +
        ", SkuName=" + SkuName +
        ", SkuCode=" + SkuCode +
        ", MarketPrice=" + MarketPrice +
        ", SalePrice=" + SalePrice +
        ", ImageUrl=" + ImageUrl +
        ", WarehouseId=" + WarehouseId +
        ", StockNum=" + StockNum +
        ", ProductId=" + ProductId +
        ", ProductName=" + ProductName +
        ", ProductLabel=" + ProductLabel +
        ", CategoryName=" + CategoryName +
        ", BrandName=" + BrandName +
        ", CategoryId=" + CategoryId +
        ", BrandId=" + BrandId +
        ", Unit=" + Unit +
        ", IsCanPurchase=" + IsCanPurchase +
        ", SpecText=" + SpecText +
        ", ProductInfo=" + ProductInfo +
        ", OnSaleTime=" + OnSaleTime +
        ", ItemId=" + ItemId +
        ", CustomerId=" + CustomerId +
        ", UserType=" + UserType +
        ", CreateTime=" + CreateTime +
        ", OfficeId=" + OfficeId +
        ", ProvinceId=" + ProvinceId +
        ", RealName=" + RealName +
        ", StoreName=" + StoreName +
        ", Qty=" + Qty +
        ", IsSale=" + IsSale +
        ", IsPresale=" + IsPresale +
        ", BeginTime=" + BeginTime +
        ", EndTime=" + EndTime +
        ", IsSalesmanBuy=" + IsSalesmanBuy +
        ", OwnerId=" + OwnerId +
        ", PrId=" + PrId +
        ", SkuType=" + SkuType +
        ", IsPurchaseDirectSku=" + IsPurchaseDirectSku +
        "}";
    }
}
