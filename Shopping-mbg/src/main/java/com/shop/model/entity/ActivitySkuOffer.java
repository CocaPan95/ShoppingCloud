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
public class ActivitySkuOffer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Long ActivityId;

    private Integer SkuId;

    private Integer VipNum;

    private Double Offer;

    private Boolean IsDeleted;

    private Long Version;


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

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getVipNum() {
        return VipNum;
    }

    public void setVipNum(Integer VipNum) {
        this.VipNum = VipNum;
    }

    public Double getOffer() {
        return Offer;
    }

    public void setOffer(Double Offer) {
        this.Offer = Offer;
    }

    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public Long getVersion() {
        return Version;
    }

    public void setVersion(Long Version) {
        this.Version = Version;
    }

    @Override
    public String toString() {
        return "ActivitySkuOffer{" +
        "Id=" + Id +
        ", ActivityId=" + ActivityId +
        ", SkuId=" + SkuId +
        ", VipNum=" + VipNum +
        ", Offer=" + Offer +
        ", IsDeleted=" + IsDeleted +
        ", Version=" + Version +
        "}";
    }
}
