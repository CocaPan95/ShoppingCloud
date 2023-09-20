package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户金额信息
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class UserMoney implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
      @TableId(value = "UserMoneyId", type = IdType.AUTO)
    private Long UserMoneyId;

    /**
     * 用户Id
     */
    private Long CustomerId;

    /**
     * 充值余额
     */
    private Double BalanceMoney;

    /**
     * 信用余额
     */
    private Double CreditMoney;

    /**
     * 返现余额
     */
    private Double ReturnMoney;

    /**
     * 创建人
     */
    private String CREATED_BY;

    /**
     * 创建时间
     */
    private LocalDateTime CREATED_TIME;

    /**
     * 更新人
     */
    private String UPDATED_BY;

    /**
     * 更新时间
     */
    private LocalDateTime UPDATED_TIME;

    private Double OrderPriveMoney;


    public Long getUserMoneyId() {
        return UserMoneyId;
    }

    public void setUserMoneyId(Long UserMoneyId) {
        this.UserMoneyId = UserMoneyId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Double getBalanceMoney() {
        return BalanceMoney;
    }

    public void setBalanceMoney(Double BalanceMoney) {
        this.BalanceMoney = BalanceMoney;
    }

    public Double getCreditMoney() {
        return CreditMoney;
    }

    public void setCreditMoney(Double CreditMoney) {
        this.CreditMoney = CreditMoney;
    }

    public Double getReturnMoney() {
        return ReturnMoney;
    }

    public void setReturnMoney(Double ReturnMoney) {
        this.ReturnMoney = ReturnMoney;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public LocalDateTime getCREATED_TIME() {
        return CREATED_TIME;
    }

    public void setCREATED_TIME(LocalDateTime CREATED_TIME) {
        this.CREATED_TIME = CREATED_TIME;
    }

    public String getUPDATED_BY() {
        return UPDATED_BY;
    }

    public void setUPDATED_BY(String UPDATED_BY) {
        this.UPDATED_BY = UPDATED_BY;
    }

    public LocalDateTime getUPDATED_TIME() {
        return UPDATED_TIME;
    }

    public void setUPDATED_TIME(LocalDateTime UPDATED_TIME) {
        this.UPDATED_TIME = UPDATED_TIME;
    }

    public Double getOrderPriveMoney() {
        return OrderPriveMoney;
    }

    public void setOrderPriveMoney(Double OrderPriveMoney) {
        this.OrderPriveMoney = OrderPriveMoney;
    }

    @Override
    public String toString() {
        return "UserMoney{" +
        "UserMoneyId=" + UserMoneyId +
        ", CustomerId=" + CustomerId +
        ", BalanceMoney=" + BalanceMoney +
        ", CreditMoney=" + CreditMoney +
        ", ReturnMoney=" + ReturnMoney +
        ", CREATED_BY=" + CREATED_BY +
        ", CREATED_TIME=" + CREATED_TIME +
        ", UPDATED_BY=" + UPDATED_BY +
        ", UPDATED_TIME=" + UPDATED_TIME +
        ", OrderPriveMoney=" + OrderPriveMoney +
        "}";
    }
}
