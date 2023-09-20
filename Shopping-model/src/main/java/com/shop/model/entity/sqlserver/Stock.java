package com.shop.model.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName("product.Stock")
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 库存ID
     */
    @TableId(value = "stockId", type = IdType.AUTO)
    private Long stockId;

    /**
     * SkuId
     */
    @TableField("skuId")
    private Long skuId;

    /**
     * 库存数量（盒）
     */
    @TableField("stockNum")
    private Integer stockNum;

    /**
     * 仓库Id
     */
    @TableField("warehouseId")
    private Long warehouseId;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    @TableField("createName")
    private String createName;

    /**
     * 更新时间
     */
    @TableField("updateTime")
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    @TableField("updateName")
    private String updateName;

    /**
     * 备注
     */
    @TableField("remark")
    private String remark;

    @TableField("alertNum")
    private Integer alertNum;


    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getStockNum() {
        return stockNum;
    }

    public void setStockNum(Integer stockNum) {
        this.stockNum = stockNum;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAlertNum() {
        return alertNum;
    }

    public void setAlertNum(Integer alertNum) {
        this.alertNum = alertNum;
    }

    @Override
    public String toString() {
        return "Stock{" +
        "stockId=" + stockId +
        ", skuId=" + skuId +
        ", stockNum=" + stockNum +
        ", warehouseId=" + warehouseId +
        ", createTime=" + createTime +
        ", createName=" + createName +
        ", updateTime=" + updateTime +
        ", updateName=" + updateName +
        ", remark=" + remark +
        ", alertNum=" + alertNum +
        "}";
    }
}
