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
public class V_Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long SkuId;

    private Integer StockNum;

    private String WarehouseName;

    private Long WarehouseId;

    private Integer SpecText;


    public Long getSkuId() {
        return SkuId;
    }

    public void setSkuId(Long SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getStockNum() {
        return StockNum;
    }

    public void setStockNum(Integer StockNum) {
        this.StockNum = StockNum;
    }

    public String getWarehouseName() {
        return WarehouseName;
    }

    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    public Long getWarehouseId() {
        return WarehouseId;
    }

    public void setWarehouseId(Long WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    public Integer getSpecText() {
        return SpecText;
    }

    public void setSpecText(Integer SpecText) {
        this.SpecText = SpecText;
    }

    @Override
    public String toString() {
        return "V_Stock{" +
        "SkuId=" + SkuId +
        ", StockNum=" + StockNum +
        ", WarehouseName=" + WarehouseName +
        ", WarehouseId=" + WarehouseId +
        ", SpecText=" + SpecText +
        "}";
    }
}
