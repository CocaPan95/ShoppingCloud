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
public class StoreOrderPay implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long OrderPayId;

    private Integer OrderId;

    private Double OnlineMoney;

    private Double BalanceMoney;

    private Double CardMoney;

    private Double ReturnMoney;

    private LocalDateTime AddTime;

    private LocalDateTime UpdateTime;

    private Integer PayMoneyState;

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
        return "StoreOrderPay{" +
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
