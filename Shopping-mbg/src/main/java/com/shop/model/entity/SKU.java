package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * SKU表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class SKU implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * SKuId
     */
    private Integer SkuId;

    /**
     * 产品Id
     */
    private Integer ProductId;

    /**
     * SKU编码
     */
    private String SkuCode;

    /**
     * SKU名称
     */
    private String SkuName;

    private Integer OwnerId;

    /**
     * 建议零售价
     */
    private Double MarketPrice;

    /**
     * 销售价（无用字段）
     */
    private Double SalePrice;

    /**
     * 箱重量(kg)
     */
    private Double Weight;

    /**
     * 产品图片
     */
    private String ImageUrl;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    private LocalDateTime UpdateTime;

    /**
     * 是否启用（无用字段）
     */
    private Boolean IsEnable;

    /**
     * 是否真正上架（无用字段）
     */
    private Boolean IsOnSale;

    /**
     * 是否推荐；1：是,0:否
     */
    private Boolean IsRecommand;

    /**
     * 是否预售：1：是，0：否
     */
    private Boolean IsPresale;

    /**
     * 创建人
     */
    private String CreateName;

    /**
     * 更新人
     */
    private String UpdateName;

    /**
     * 是否发布（无用字段）
     */
    private Boolean IsPublish;

    /**
     * 是否有效；0：有效，1：无效
     */
    private Boolean Valid;

    /**
     * 单位
     */
    private String Unit;

    /**
     * 多少一箱
     */
    private Integer SpecText;

    /**
     * 是否允许采购；1：允许，0：不允许
     */
    private Boolean IsCanPurchase;

    /**
     * 允许小业务员小程序购买（是否排单）；1：允许，0：不允许 
     */
    private Boolean IsSalesmanBuy;

    /**
     * 上市时间
     */
    private LocalDateTime OnSaleTime;

    /**
     * 会员等级，0=所有人购买，其他只有对应等级的会员才可以购买（无用字段）
     */
    private String VipNum;

    /**
     * 箱体积(m³)
     */
    private Double Volume;

    /**
     * 是否同步上架到千城万店
     */
    private Boolean IsSYNC;

    /**
     * 产地，1：开化，2：义乌
     */
    private Integer MadeIn;

    private Integer SkuType;

    private Boolean IsSyncShopex;


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

    public Integer getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(Integer OwnerId) {
        this.OwnerId = OwnerId;
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

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double Weight) {
        this.Weight = Weight;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Boolean getIsEnable() {
        return IsEnable;
    }

    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    public Boolean getIsOnSale() {
        return IsOnSale;
    }

    public void setIsOnSale(Boolean IsOnSale) {
        this.IsOnSale = IsOnSale;
    }

    public Boolean getIsRecommand() {
        return IsRecommand;
    }

    public void setIsRecommand(Boolean IsRecommand) {
        this.IsRecommand = IsRecommand;
    }

    public Boolean getIsPresale() {
        return IsPresale;
    }

    public void setIsPresale(Boolean IsPresale) {
        this.IsPresale = IsPresale;
    }

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    public Boolean getIsPublish() {
        return IsPublish;
    }

    public void setIsPublish(Boolean IsPublish) {
        this.IsPublish = IsPublish;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public Integer getSpecText() {
        return SpecText;
    }

    public void setSpecText(Integer SpecText) {
        this.SpecText = SpecText;
    }

    public Boolean getIsCanPurchase() {
        return IsCanPurchase;
    }

    public void setIsCanPurchase(Boolean IsCanPurchase) {
        this.IsCanPurchase = IsCanPurchase;
    }

    public Boolean getIsSalesmanBuy() {
        return IsSalesmanBuy;
    }

    public void setIsSalesmanBuy(Boolean IsSalesmanBuy) {
        this.IsSalesmanBuy = IsSalesmanBuy;
    }

    public LocalDateTime getOnSaleTime() {
        return OnSaleTime;
    }

    public void setOnSaleTime(LocalDateTime OnSaleTime) {
        this.OnSaleTime = OnSaleTime;
    }

    public String getVipNum() {
        return VipNum;
    }

    public void setVipNum(String VipNum) {
        this.VipNum = VipNum;
    }

    public Double getVolume() {
        return Volume;
    }

    public void setVolume(Double Volume) {
        this.Volume = Volume;
    }

    public Boolean getIsSYNC() {
        return IsSYNC;
    }

    public void setIsSYNC(Boolean IsSYNC) {
        this.IsSYNC = IsSYNC;
    }

    public Integer getMadeIn() {
        return MadeIn;
    }

    public void setMadeIn(Integer MadeIn) {
        this.MadeIn = MadeIn;
    }

    public Integer getSkuType() {
        return SkuType;
    }

    public void setSkuType(Integer SkuType) {
        this.SkuType = SkuType;
    }

    public Boolean getIsSyncShopex() {
        return IsSyncShopex;
    }

    public void setIsSyncShopex(Boolean IsSyncShopex) {
        this.IsSyncShopex = IsSyncShopex;
    }

    @Override
    public String toString() {
        return "SKU{" +
        "SkuId=" + SkuId +
        ", ProductId=" + ProductId +
        ", SkuCode=" + SkuCode +
        ", SkuName=" + SkuName +
        ", OwnerId=" + OwnerId +
        ", MarketPrice=" + MarketPrice +
        ", SalePrice=" + SalePrice +
        ", Weight=" + Weight +
        ", ImageUrl=" + ImageUrl +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        ", IsEnable=" + IsEnable +
        ", IsOnSale=" + IsOnSale +
        ", IsRecommand=" + IsRecommand +
        ", IsPresale=" + IsPresale +
        ", CreateName=" + CreateName +
        ", UpdateName=" + UpdateName +
        ", IsPublish=" + IsPublish +
        ", Valid=" + Valid +
        ", Unit=" + Unit +
        ", SpecText=" + SpecText +
        ", IsCanPurchase=" + IsCanPurchase +
        ", IsSalesmanBuy=" + IsSalesmanBuy +
        ", OnSaleTime=" + OnSaleTime +
        ", VipNum=" + VipNum +
        ", Volume=" + Volume +
        ", IsSYNC=" + IsSYNC +
        ", MadeIn=" + MadeIn +
        ", SkuType=" + SkuType +
        ", IsSyncShopex=" + IsSyncShopex +
        "}";
    }
}
