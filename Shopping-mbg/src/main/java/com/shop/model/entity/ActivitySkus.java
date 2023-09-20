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
public class ActivitySkus implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Long ActivityId;

    private Integer GiftType;

    private Integer BuySkuId;

    private Integer BuyBoxQty;

    private Integer GiftSkuId;

    private Integer GiftBoxQty;

    private Integer GiftMaxQty;

    private Integer GiftRemainQty;

    private Boolean IsDeleted;

    private String Version;

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

    public Long getActivityId() {
        return ActivityId;
    }

    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    public Integer getGiftType() {
        return GiftType;
    }

    public void setGiftType(Integer GiftType) {
        this.GiftType = GiftType;
    }

    public Integer getBuySkuId() {
        return BuySkuId;
    }

    public void setBuySkuId(Integer BuySkuId) {
        this.BuySkuId = BuySkuId;
    }

    public Integer getBuyBoxQty() {
        return BuyBoxQty;
    }

    public void setBuyBoxQty(Integer BuyBoxQty) {
        this.BuyBoxQty = BuyBoxQty;
    }

    public Integer getGiftSkuId() {
        return GiftSkuId;
    }

    public void setGiftSkuId(Integer GiftSkuId) {
        this.GiftSkuId = GiftSkuId;
    }

    public Integer getGiftBoxQty() {
        return GiftBoxQty;
    }

    public void setGiftBoxQty(Integer GiftBoxQty) {
        this.GiftBoxQty = GiftBoxQty;
    }

    public Integer getGiftMaxQty() {
        return GiftMaxQty;
    }

    public void setGiftMaxQty(Integer GiftMaxQty) {
        this.GiftMaxQty = GiftMaxQty;
    }

    public Integer getGiftRemainQty() {
        return GiftRemainQty;
    }

    public void setGiftRemainQty(Integer GiftRemainQty) {
        this.GiftRemainQty = GiftRemainQty;
    }

    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
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
        return "ActivitySkus{" +
        "Id=" + Id +
        ", ActivityId=" + ActivityId +
        ", GiftType=" + GiftType +
        ", BuySkuId=" + BuySkuId +
        ", BuyBoxQty=" + BuyBoxQty +
        ", GiftSkuId=" + GiftSkuId +
        ", GiftBoxQty=" + GiftBoxQty +
        ", GiftMaxQty=" + GiftMaxQty +
        ", GiftRemainQty=" + GiftRemainQty +
        ", IsDeleted=" + IsDeleted +
        ", Version=" + Version +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        ", UpdateBy=" + UpdateBy +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
