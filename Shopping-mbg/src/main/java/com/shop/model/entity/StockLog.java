package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 库存日志表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class StockLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 库存日志主键Id
     */
    private Long StockId;

    /**
     * 添加库存数量
     */
    private Integer count;

    /**
     * SkuId
     */
    private Long SkuId;

    /**
     * 办事处Id
     */
    private Integer OfficeId;

    /**
     * 描述
     */
    private String Description;

    /**
     * 备注
     */
    private String Remark;

    /**
     * 操作前库存
     */
    private Integer OldStock;

    /**
     * 操作后库存
     */
    private Integer NewStock;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 创建人（来源分app，web）
     */
    private String CreateUser;

    /**
     * 仓库id
     */
    private Long WarehouseId;

    /**
     * 库存日志类别；1:销售订单,2:入库-从工厂,3:退库-至工厂,4:领用,5:办事处间调拨,6:盘点调整,7:系统自动数据-店铺交接,8:系统自动数据-业务员交接,9:系统自动数据-采购单,10:订单调整,11:后台关闭订单,100:旧版本数据
     */
    private Integer LogType;


    public Long getStockId() {
        return StockId;
    }

    public void setStockId(Long StockId) {
        this.StockId = StockId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getSkuId() {
        return SkuId;
    }

    public void setSkuId(Long SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
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

    public Long getWarehouseId() {
        return WarehouseId;
    }

    public void setWarehouseId(Long WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    public Integer getLogType() {
        return LogType;
    }

    public void setLogType(Integer LogType) {
        this.LogType = LogType;
    }

    @Override
    public String toString() {
        return "StockLog{" +
        "StockId=" + StockId +
        ", count=" + count +
        ", SkuId=" + SkuId +
        ", OfficeId=" + OfficeId +
        ", Description=" + Description +
        ", Remark=" + Remark +
        ", OldStock=" + OldStock +
        ", NewStock=" + NewStock +
        ", CreateTime=" + CreateTime +
        ", CreateUser=" + CreateUser +
        ", WarehouseId=" + WarehouseId +
        ", LogType=" + LogType +
        "}";
    }
}
