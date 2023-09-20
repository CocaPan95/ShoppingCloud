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
public class ExpressCharge implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ExpressId;

    private Integer ProvinceId;

    private String ProvincceName;

    private Integer CityId;

    private String CityName;

    private Double FirstPrice;

    private Double AddPrice;

    private Double FirstWeight;

    private Double AddWeight;


    public Integer getExpressId() {
        return ExpressId;
    }

    public void setExpressId(Integer ExpressId) {
        this.ExpressId = ExpressId;
    }

    public Integer getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(Integer ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    public String getProvincceName() {
        return ProvincceName;
    }

    public void setProvincceName(String ProvincceName) {
        this.ProvincceName = ProvincceName;
    }

    public Integer getCityId() {
        return CityId;
    }

    public void setCityId(Integer CityId) {
        this.CityId = CityId;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public Double getFirstPrice() {
        return FirstPrice;
    }

    public void setFirstPrice(Double FirstPrice) {
        this.FirstPrice = FirstPrice;
    }

    public Double getAddPrice() {
        return AddPrice;
    }

    public void setAddPrice(Double AddPrice) {
        this.AddPrice = AddPrice;
    }

    public Double getFirstWeight() {
        return FirstWeight;
    }

    public void setFirstWeight(Double FirstWeight) {
        this.FirstWeight = FirstWeight;
    }

    public Double getAddWeight() {
        return AddWeight;
    }

    public void setAddWeight(Double AddWeight) {
        this.AddWeight = AddWeight;
    }

    @Override
    public String toString() {
        return "ExpressCharge{" +
        "ExpressId=" + ExpressId +
        ", ProvinceId=" + ProvinceId +
        ", ProvincceName=" + ProvincceName +
        ", CityId=" + CityId +
        ", CityName=" + CityName +
        ", FirstPrice=" + FirstPrice +
        ", AddPrice=" + AddPrice +
        ", FirstWeight=" + FirstWeight +
        ", AddWeight=" + AddWeight +
        "}";
    }
}
