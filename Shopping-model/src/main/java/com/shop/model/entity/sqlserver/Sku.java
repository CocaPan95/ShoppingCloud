package com.shop.model.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName("product.Sku")
public class Sku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * SKuId
     */
    @TableId(value = "skuId", type = IdType.AUTO)
    private Integer skuId;

    /**
     * 产品Id
     */
    @TableField("productId")
    private Integer productId;

    /**
     * SKU编码
     */
    @TableField("skuCode")
    private String skuCode;

    /**
     * SKU名称
     */
    @TableField("skuName")
    private String skuName;

    @TableField("ownerId")
    private Integer ownerId;

    /**
     * 建议零售价
     */
    @TableField("marketPrice")
    private Double marketPrice;

    /**
     * 销售价（无用字段）
     */
    @TableField("salePrice")
    private Double salePrice;

    /**
     * 箱重量(kg)
     */
    @TableField("weight")
    private Double weight;

    /**
     * 产品图片
     */
    @TableField("imageUrl")
    private String imageUrl;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("updateTime")
    private LocalDateTime updateTime;

    /**
     * 是否启用（无用字段）
     */
    @TableField("isEnable")
    private Boolean isEnable;

    /**
     * 是否真正上架（无用字段）
     */
    @TableField("isOnSale")
    private Boolean isOnSale;

    /**
     * 是否推荐；1：是,0:否
     */
    @TableField("isRecommand")
    private Boolean isRecommand;

    /**
     * 是否预售：1：是，0：否
     */
    @TableField("isPresale")
    private Boolean isPresale;

    /**
     * 创建人
     */
    @TableField("createName")
    private String createName;

    /**
     * 更新人
     */
    @TableField("updateName")
    private String updateName;

    /**
     * 是否发布（无用字段）
     */
    @TableField("isPublish")
    private Boolean isPublish;

    /**
     * 是否有效；0：有效，1：无效
     */
    @TableField("valid")
    private Boolean valid;

    /**
     * 单位
     */
    @TableField("unit")
    private String unit;

    /**
     * 多少一箱
     */
    @TableField("specText")
    private Integer specText;

    /**
     * 是否允许采购；1：允许，0：不允许
     */
    @TableField("isCanPurchase")
    private Boolean isCanPurchase;

    /**
     * 允许小业务员小程序购买（是否排单）；1：允许，0：不允许 
     */
    @TableField("isSalesmanBuy")
    private Boolean isSalesmanBuy;

    /**
     * 上市时间
     */
    @TableField("onSaleTime")
    private LocalDateTime onSaleTime;

    /**
     * 会员等级，0=所有人购买，其他只有对应等级的会员才可以购买（无用字段）
     */
    @TableField("vipNum")
    private String vipNum;

    /**
     * 箱体积(m³)
     */
    @TableField("volume")
    private Double volume;

    /**
     * 是否同步上架到千城万店
     */
    @TableField("isSYNC")
    private Boolean isSYNC;

    /**
     * 产地，1：开化，2：义乌
     */
    @TableField("madeIn")
    private Integer madeIn;
    @TableField("skuType")
    private Integer skuType;
    @TableField("isSyncShopex")
    private Boolean isSyncShopex;


    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public Boolean getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Boolean isOnSale) {
        this.isOnSale = isOnSale;
    }

    public Boolean getIsRecommand() {
        return isRecommand;
    }

    public void setIsRecommand(Boolean isRecommand) {
        this.isRecommand = isRecommand;
    }

    public Boolean getIsPresale() {
        return isPresale;
    }

    public void setIsPresale(Boolean isPresale) {
        this.isPresale = isPresale;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public Boolean getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getSpecText() {
        return specText;
    }

    public void setSpecText(Integer specText) {
        this.specText = specText;
    }

    public Boolean getIsCanPurchase() {
        return isCanPurchase;
    }

    public void setIsCanPurchase(Boolean isCanPurchase) {
        this.isCanPurchase = isCanPurchase;
    }

    public Boolean getIsSalesmanBuy() {
        return isSalesmanBuy;
    }

    public void setIsSalesmanBuy(Boolean isSalesmanBuy) {
        this.isSalesmanBuy = isSalesmanBuy;
    }

    public LocalDateTime getOnSaleTime() {
        return onSaleTime;
    }

    public void setOnSaleTime(LocalDateTime onSaleTime) {
        this.onSaleTime = onSaleTime;
    }

    public String getVipNum() {
        return vipNum;
    }

    public void setVipNum(String vipNum) {
        this.vipNum = vipNum;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Boolean getIsSYNC() {
        return isSYNC;
    }

    public void setIsSYNC(Boolean isSYNC) {
        this.isSYNC = isSYNC;
    }

    public Integer getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(Integer madeIn) {
        this.madeIn = madeIn;
    }

    public Integer getSkuType() {
        return skuType;
    }

    public void setSkuType(Integer skuType) {
        this.skuType = skuType;
    }

    public Boolean getIsSyncShopex() {
        return isSyncShopex;
    }

    public void setIsSyncShopex(Boolean isSyncShopex) {
        this.isSyncShopex = isSyncShopex;
    }

    @Override
    public String toString() {
        return "Sku{" +
        "skuId=" + skuId +
        ", productId=" + productId +
        ", skuCode=" + skuCode +
        ", skuName=" + skuName +
        ", ownerId=" + ownerId +
        ", marketPrice=" + marketPrice +
        ", salePrice=" + salePrice +
        ", weight=" + weight +
        ", imageUrl=" + imageUrl +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isEnable=" + isEnable +
        ", isOnSale=" + isOnSale +
        ", isRecommand=" + isRecommand +
        ", isPresale=" + isPresale +
        ", createName=" + createName +
        ", updateName=" + updateName +
        ", isPublish=" + isPublish +
        ", valid=" + valid +
        ", unit=" + unit +
        ", specText=" + specText +
        ", isCanPurchase=" + isCanPurchase +
        ", isSalesmanBuy=" + isSalesmanBuy +
        ", onSaleTime=" + onSaleTime +
        ", vipNum=" + vipNum +
        ", volume=" + volume +
        ", isSYNC=" + isSYNC +
        ", madeIn=" + madeIn +
        ", skuType=" + skuType +
        ", isSyncShopex=" + isSyncShopex +
        "}";
    }
}
