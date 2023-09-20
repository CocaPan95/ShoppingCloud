package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 产品大区表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class SKUOfficeRection implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品大区表主键Id
     */
    private Long SKUOfficeRectionId;

    /**
     * SkuId
     */
    private Long SkuId;

    /**
     * 办事处Id
     */
    private Long OfficeId;

    /**
     * 办事处销量
     */
    private Integer SalesNum;

    /**
     * 是否上下架；1：上架，0：下架
     */
    private Boolean IsSale;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 创建人
     */
    private String CreateName;

    /**
     * 更新时间
     */
    private LocalDateTime UpdateTime;

    /**
     * 更新人
     */
    private String UpdateName;


    public Long getSKUOfficeRectionId() {
        return SKUOfficeRectionId;
    }

    public void setSKUOfficeRectionId(Long SKUOfficeRectionId) {
        this.SKUOfficeRectionId = SKUOfficeRectionId;
    }

    public Long getSkuId() {
        return SkuId;
    }

    public void setSkuId(Long SkuId) {
        this.SkuId = SkuId;
    }

    public Long getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Long OfficeId) {
        this.OfficeId = OfficeId;
    }

    public Integer getSalesNum() {
        return SalesNum;
    }

    public void setSalesNum(Integer SalesNum) {
        this.SalesNum = SalesNum;
    }

    public Boolean getIsSale() {
        return IsSale;
    }

    public void setIsSale(Boolean IsSale) {
        this.IsSale = IsSale;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    @Override
    public String toString() {
        return "SKUOfficeRection{" +
        "SKUOfficeRectionId=" + SKUOfficeRectionId +
        ", SkuId=" + SkuId +
        ", OfficeId=" + OfficeId +
        ", SalesNum=" + SalesNum +
        ", IsSale=" + IsSale +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        ", UpdateTime=" + UpdateTime +
        ", UpdateName=" + UpdateName +
        "}";
    }
}
