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
public class V_SkuSaleArea implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long AreaProvinceRectionId;

    private Integer AreaId;

    private Integer ProvinceId;

    private LocalDateTime CreateTime;

    private String CreateName;

    private String ProvinceName;

    private Long SkuId;

    private LocalDateTime AddTime;


    public Long getAreaProvinceRectionId() {
        return AreaProvinceRectionId;
    }

    public void setAreaProvinceRectionId(Long AreaProvinceRectionId) {
        this.AreaProvinceRectionId = AreaProvinceRectionId;
    }

    public Integer getAreaId() {
        return AreaId;
    }

    public void setAreaId(Integer AreaId) {
        this.AreaId = AreaId;
    }

    public Integer getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(Integer ProvinceId) {
        this.ProvinceId = ProvinceId;
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

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    public Long getSkuId() {
        return SkuId;
    }

    public void setSkuId(Long SkuId) {
        this.SkuId = SkuId;
    }

    public LocalDateTime getAddTime() {
        return AddTime;
    }

    public void setAddTime(LocalDateTime AddTime) {
        this.AddTime = AddTime;
    }

    @Override
    public String toString() {
        return "V_SkuSaleArea{" +
        "AreaProvinceRectionId=" + AreaProvinceRectionId +
        ", AreaId=" + AreaId +
        ", ProvinceId=" + ProvinceId +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        ", ProvinceName=" + ProvinceName +
        ", SkuId=" + SkuId +
        ", AddTime=" + AddTime +
        "}";
    }
}
