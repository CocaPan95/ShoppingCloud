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
public class V_OfficeProvice implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ProvinceId;

    private String ProvinceName;

    private Integer OfficeId;


    public Integer getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(Integer ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    @Override
    public String toString() {
        return "V_OfficeProvice{" +
        "ProvinceId=" + ProvinceId +
        ", ProvinceName=" + ProvinceName +
        ", OfficeId=" + OfficeId +
        "}";
    }
}
