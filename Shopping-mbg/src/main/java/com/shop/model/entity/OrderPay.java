package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class OrderPay implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "OrderPayId", type = IdType.AUTO)
    private Long OrderPayId;

    private Integer OrderId;

    private Double OnlineMoney;

    /**
     * 当笔订单所用余额
     */
    private Double BalanceMoney;

    private Double CardMoney;

    /**
     * 当笔订单所用返现
     */
    private Double ReturnMoney;

    private LocalDateTime AddTime;

    private LocalDateTime UpdateTime;

    private Integer PayMoneyState;

    /**
     * 订单更新取消后，客户的（返现+余额）
     */
    private Double OrderPriveMoney;


    public Long getOrderPayId() {
        return OrderPayId;
    }

    public void setOrderPayId(Long OrderPayId) {
        this.OrderPayId = OrderPayId;
    }

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public Double getOnlineMoney() {
        return OnlineMoney;
    }

    public void setOnlineMoney(Double OnlineMoney) {
        this.OnlineMoney = OnlineMoney;
    }

    public Double getBalanceMoney() {
        return BalanceMoney;
    }

    public void setBalanceMoney(Double BalanceMoney) {
        this.BalanceMoney = BalanceMoney;
    }

    public Double getCardMoney() {
        return CardMoney;
    }

    public void setCardMoney(Double CardMoney) {
        this.CardMoney = CardMoney;
    }

    public Double getReturnMoney() {
        return ReturnMoney;
    }

    public void setReturnMoney(Double ReturnMoney) {
        this.ReturnMoney = ReturnMoney;
    }

    public LocalDateTime getAddTime() {
        return AddTime;
    }

    public void setAddTime(LocalDateTime AddTime) {
        this.AddTime = AddTime;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Integer getPayMoneyState() {
        return PayMoneyState;
    }

    public void setPayMoneyState(Integer PayMoneyState) {
        this.PayMoneyState = PayMoneyState;
    }

    public Double getOrderPriveMoney() {
        return OrderPriveMoney;
    }

    public void setOrderPriveMoney(Double OrderPriveMoney) {
        this.OrderPriveMoney = OrderPriveMoney;
    }

    @Override
    public String toString() {
        return "OrderPay{" +
        "OrderPayId=" + OrderPayId +
        ", OrderId=" + OrderId +
        ", OnlineMoney=" + OnlineMoney +
        ", BalanceMoney=" + BalanceMoney +
        ", CardMoney=" + CardMoney +
        ", ReturnMoney=" + ReturnMoney +
        ", AddTime=" + AddTime +
        ", UpdateTime=" + UpdateTime +
        ", PayMoneyState=" + PayMoneyState +
        ", OrderPriveMoney=" + OrderPriveMoney +
        "}";
    }
}
