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
public class V_SkuView implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer SkuId;

    private String SkuName;

    private String SkuCode;

    private Double MarketPrice;

    private Double SalePrice;

    private String ImageUrl;

    private Integer StockNum;

    private Integer ProductId;

    private String ProductName;

    private String ProductLabel;

    private String CategoryName;

    private String BrandName;

    private LocalDateTime CreateTime;

    private Integer CategoryId;

    private Integer BrandId;

    private String Unit;

    private Boolean IsCanPurchase;

    private Boolean IsPresale;

    private Integer SpecText;

    private String ProductInfo;

    private LocalDateTime OnSaleTime;

    private Boolean IsRecommand;

    private Double Weight;

    private LocalDateTime UpdateTime;

    private Long PrId;

    private LocalDateTime BeginTime;

    private LocalDateTime EndTime;

    private Boolean IsPublish;

    private Boolean IsSalesmanBuy;

    private Double Volume;

    private Boolean IsOnSale;

    private Integer MadeIn;

    private Boolean IsSYNC;

    private Integer OwnerId;

    private Integer KindId;

    private String OwnerName;

    private String KindName;

    private Integer SkuType;


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

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
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

    public Boolean getIsPresale() {
        return IsPresale;
    }

    public void setIsPresale(Boolean IsPresale) {
        this.IsPresale = IsPresale;
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

    public Boolean getIsRecommand() {
        return IsRecommand;
    }

    public void setIsRecommand(Boolean IsRecommand) {
        this.IsRecommand = IsRecommand;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double Weight) {
        this.Weight = Weight;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Long getPrId() {
        return PrId;
    }

    public void setPrId(Long PrId) {
        this.PrId = PrId;
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

    public Boolean getIsPublish() {
        return IsPublish;
    }

    public void setIsPublish(Boolean IsPublish) {
        this.IsPublish = IsPublish;
    }

    public Boolean getIsSalesmanBuy() {
        return IsSalesmanBuy;
    }

    public void setIsSalesmanBuy(Boolean IsSalesmanBuy) {
        this.IsSalesmanBuy = IsSalesmanBuy;
    }

    public Double getVolume() {
        return Volume;
    }

    public void setVolume(Double Volume) {
        this.Volume = Volume;
    }

    public Boolean getIsOnSale() {
        return IsOnSale;
    }

    public void setIsOnSale(Boolean IsOnSale) {
        this.IsOnSale = IsOnSale;
    }

    public Integer getMadeIn() {
        return MadeIn;
    }

    public void setMadeIn(Integer MadeIn) {
        this.MadeIn = MadeIn;
    }

    public Boolean getIsSYNC() {
        return IsSYNC;
    }

    public void setIsSYNC(Boolean IsSYNC) {
        this.IsSYNC = IsSYNC;
    }

    public Integer getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(Integer OwnerId) {
        this.OwnerId = OwnerId;
    }

    public Integer getKindId() {
        return KindId;
    }

    public void setKindId(Integer KindId) {
        this.KindId = KindId;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public String getKindName() {
        return KindName;
    }

    public void setKindName(String KindName) {
        this.KindName = KindName;
    }

    public Integer getSkuType() {
        return SkuType;
    }

    public void setSkuType(Integer SkuType) {
        this.SkuType = SkuType;
    }

    @Override
    public String toString() {
        return "V_SkuView{" +
        "SkuId=" + SkuId +
        ", SkuName=" + SkuName +
        ", SkuCode=" + SkuCode +
        ", MarketPrice=" + MarketPrice +
        ", SalePrice=" + SalePrice +
        ", ImageUrl=" + ImageUrl +
        ", StockNum=" + StockNum +
        ", ProductId=" + ProductId +
        ", ProductName=" + ProductName +
        ", ProductLabel=" + ProductLabel +
        ", CategoryName=" + CategoryName +
        ", BrandName=" + BrandName +
        ", CreateTime=" + CreateTime +
        ", CategoryId=" + CategoryId +
        ", BrandId=" + BrandId +
        ", Unit=" + Unit +
        ", IsCanPurchase=" + IsCanPurchase +
        ", IsPresale=" + IsPresale +
        ", SpecText=" + SpecText +
        ", ProductInfo=" + ProductInfo +
        ", OnSaleTime=" + OnSaleTime +
        ", IsRecommand=" + IsRecommand +
        ", Weight=" + Weight +
        ", UpdateTime=" + UpdateTime +
        ", PrId=" + PrId +
        ", BeginTime=" + BeginTime +
        ", EndTime=" + EndTime +
        ", IsPublish=" + IsPublish +
        ", IsSalesmanBuy=" + IsSalesmanBuy +
        ", Volume=" + Volume +
        ", IsOnSale=" + IsOnSale +
        ", MadeIn=" + MadeIn +
        ", IsSYNC=" + IsSYNC +
        ", OwnerId=" + OwnerId +
        ", KindId=" + KindId +
        ", OwnerName=" + OwnerName +
        ", KindName=" + KindName +
        ", SkuType=" + SkuType +
        "}";
    }
}
