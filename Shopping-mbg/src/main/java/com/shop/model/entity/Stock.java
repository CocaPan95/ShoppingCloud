package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 库存表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 库存ID
     */
    private Long StockId;

    /**
     * SkuId
     */
    private Long SkuId;

    /**
     * 库存数量（盒）
     */
    private Integer StockNum;

    /**
     * 仓库Id
     */
    private Long WarehouseId;

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

    /**
     * 备注
     */
    private String Remark;

    private Integer AlertNum;


    public Long getStockId() {
        return StockId;
    }

    public void setStockId(Long StockId) {
        this.StockId = StockId;
    }

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

    public Long getWarehouseId() {
        return WarehouseId;
    }

    public void setWarehouseId(Long WarehouseId) {
        this.WarehouseId = WarehouseId;
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

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public Integer getAlertNum() {
        return AlertNum;
    }

    public void setAlertNum(Integer AlertNum) {
        this.AlertNum = AlertNum;
    }

    @Override
    public String toString() {
        return "Stock{" +
        "StockId=" + StockId +
        ", SkuId=" + SkuId +
        ", StockNum=" + StockNum +
        ", WarehouseId=" + WarehouseId +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        ", UpdateTime=" + UpdateTime +
        ", UpdateName=" + UpdateName +
        ", Remark=" + Remark +
        ", AlertNum=" + AlertNum +
        "}";
    }
}
