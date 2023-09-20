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
public class V_StockLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long StockId;

    private String SkuName;

    private String SkuCode;

    private Integer count;

    private Integer SkuId;

    private String Description;

    private String Remark;

    private Integer OldStock;

    private Integer NewStock;

    private LocalDateTime CreateTime;

    private String CreateUser;

    private String WarehouseName;

    private Integer SpecText;

    private Integer LogType;

    private String logtypeName;

    private Long WarehouseId;


    public Long getStockId() {
        return StockId;
    }

    public void setStockId(Long StockId) {
        this.StockId = StockId;
    }

    public String getSkuName() {
        return SkuName;
    }

    public void setSkuName(String SkuName) {
        this.SkuName = SkuName;
    }

    public String getSkuCode() {
        return SkuCode;
    }

    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public Integer getOldStock() {
        return OldStock;
    }

    public void setOldStock(Integer OldStock) {
        this.OldStock = OldStock;
    }

    public Integer getNewStock() {
        return NewStock;
    }

    public void setNewStock(Integer NewStock) {
        this.NewStock = NewStock;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getCreateUser() {
        return CreateUser;
    }

    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    public String getWarehouseName() {
        return WarehouseName;
    }

    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    public Integer getSpecText() {
        return SpecText;
    }

    public void setSpecText(Integer SpecText) {
        this.SpecText = SpecText;
    }

    public Integer getLogType() {
        return LogType;
    }

    public void setLogType(Integer LogType) {
        this.LogType = LogType;
    }

    public String getLogtypeName() {
        return logtypeName;
    }

    public void setLogtypeName(String logtypeName) {
        this.logtypeName = logtypeName;
    }

    public Long getWarehouseId() {
        return WarehouseId;
    }

    public void setWarehouseId(Long WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    @Override
    public String toString() {
        return "V_StockLog{" +
        "StockId=" + StockId +
        ", SkuName=" + SkuName +
        ", SkuCode=" + SkuCode +
        ", count=" + count +
        ", SkuId=" + SkuId +
        ", Description=" + Description +
        ", Remark=" + Remark +
        ", OldStock=" + OldStock +
        ", NewStock=" + NewStock +
        ", CreateTime=" + CreateTime +
        ", CreateUser=" + CreateUser +
        ", WarehouseName=" + WarehouseName +
        ", SpecText=" + SpecText +
        ", LogType=" + LogType +
        ", logtypeName=" + logtypeName +
        ", WarehouseId=" + WarehouseId +
        "}";
    }
}
