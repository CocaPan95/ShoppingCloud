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
public class SkuPriceAuditDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Long SkuPriceAuditId;

    private Integer SkuId;

    private Integer VipNum;

    private Boolean Valid;

    private Double Price;

    private String CreateBy;

    private LocalDateTime CreateTime;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getSkuPriceAuditId() {
        return SkuPriceAuditId;
    }

    public void setSkuPriceAuditId(Long SkuPriceAuditId) {
        this.SkuPriceAuditId = SkuPriceAuditId;
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

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
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

    @Override
    public String toString() {
        return "SkuPriceAuditDetail{" +
        "Id=" + Id +
        ", SkuPriceAuditId=" + SkuPriceAuditId +
        ", SkuId=" + SkuId +
        ", VipNum=" + VipNum +
        ", Valid=" + Valid +
        ", Price=" + Price +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
