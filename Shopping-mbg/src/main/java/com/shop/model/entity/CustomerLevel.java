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
public class CustomerLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 级别Id
     */
    private Integer LevelId;

    /**
     * 级别名称
     */
    private String LevelName;

    /**
     * 订单金额范围：最小金额（包含）
     */
    private Double MinOrderMoney;

    /**
     * 订单金额范围：最大金额（不包含）
     */
    private Double MaxOrderMoney;


    public Integer getLevelId() {
        return LevelId;
    }

    public void setLevelId(Integer LevelId) {
        this.LevelId = LevelId;
    }

    public String getLevelName() {
        return LevelName;
    }

    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    public Double getMinOrderMoney() {
        return MinOrderMoney;
    }

    public void setMinOrderMoney(Double MinOrderMoney) {
        this.MinOrderMoney = MinOrderMoney;
    }

    public Double getMaxOrderMoney() {
        return MaxOrderMoney;
    }

    public void setMaxOrderMoney(Double MaxOrderMoney) {
        this.MaxOrderMoney = MaxOrderMoney;
    }

    @Override
    public String toString() {
        return "CustomerLevel{" +
        "LevelId=" + LevelId +
        ", LevelName=" + LevelName +
        ", MinOrderMoney=" + MinOrderMoney +
        ", MaxOrderMoney=" + MaxOrderMoney +
        "}";
    }
}
