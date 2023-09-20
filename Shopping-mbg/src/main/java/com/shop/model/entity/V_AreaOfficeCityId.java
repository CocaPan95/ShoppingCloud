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
public class V_AreaOfficeCityId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer OfficeId;

    private Integer CityId;

    private Integer AreaId;


    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public Integer getCityId() {
        return CityId;
    }

    public void setCityId(Integer CityId) {
        this.CityId = CityId;
    }

    public Integer getAreaId() {
        return AreaId;
    }

    public void setAreaId(Integer AreaId) {
        this.AreaId = AreaId;
    }

    @Override
    public String toString() {
        return "V_AreaOfficeCityId{" +
        "OfficeId=" + OfficeId +
        ", CityId=" + CityId +
        ", AreaId=" + AreaId +
        "}";
    }
}
