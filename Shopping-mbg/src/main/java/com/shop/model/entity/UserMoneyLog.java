package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户消费记录
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class UserMoneyLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
      @TableId(value = "UserMoneyLogId", type = IdType.AUTO)
    private Long UserMoneyLogId;

    /**
     * 商家Id
     */
    private Long CustomerId;

    /**
     * 余额类型Id，1为充值余额，2为现返余额
     */
    private Integer MoneyTypeId;

    /**
     * 业务操作类型： 1为余额，2为返现，3为信用支付
     */
    private Integer BusinessType;

    /**
     * 订单编号
     */
    private String OrderNo;

    /**
     * 订单Id
     */
    private Integer OrderId;

    /**
     * 说明消费
     */
    private String UserMoneyContent;

    /**
     * 变动前余额
     */
    private Double BalanceBeforeChange;

    private Double RebateBeforeChange;

    /**
     * 花费金额
     */
    private Double UserMoney;

    /**
     * 变动后余额
     */
    private Double BalanceAfterChange;

    private Double RebateAfterChange;

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
    private LocalDate UPDATED_TIME;


    public Long getUserMoneyLogId() {
        return UserMoneyLogId;
    }

    public void setUserMoneyLogId(Long UserMoneyLogId) {
        this.UserMoneyLogId = UserMoneyLogId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getMoneyTypeId() {
        return MoneyTypeId;
    }

    public void setMoneyTypeId(Integer MoneyTypeId) {
        this.MoneyTypeId = MoneyTypeId;
    }

    public Integer getBusinessType() {
        return BusinessType;
    }

    public void setBusinessType(Integer BusinessType) {
        this.BusinessType = BusinessType;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public String getUserMoneyContent() {
        return UserMoneyContent;
    }

    public void setUserMoneyContent(String UserMoneyContent) {
        this.UserMoneyContent = UserMoneyContent;
    }

    public Double getBalanceBeforeChange() {
        return BalanceBeforeChange;
    }

    public void setBalanceBeforeChange(Double BalanceBeforeChange) {
        this.BalanceBeforeChange = BalanceBeforeChange;
    }

    public Double getRebateBeforeChange() {
        return RebateBeforeChange;
    }

    public void setRebateBeforeChange(Double RebateBeforeChange) {
        this.RebateBeforeChange = RebateBeforeChange;
    }

    public Double getUserMoney() {
        return UserMoney;
    }

    public void setUserMoney(Double UserMoney) {
        this.UserMoney = UserMoney;
    }

    public Double getBalanceAfterChange() {
        return BalanceAfterChange;
    }

    public void setBalanceAfterChange(Double BalanceAfterChange) {
        this.BalanceAfterChange = BalanceAfterChange;
    }

    public Double getRebateAfterChange() {
        return RebateAfterChange;
    }

    public void setRebateAfterChange(Double RebateAfterChange) {
        this.RebateAfterChange = RebateAfterChange;
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

    public LocalDate getUPDATED_TIME() {
        return UPDATED_TIME;
    }

    public void setUPDATED_TIME(LocalDate UPDATED_TIME) {
        this.UPDATED_TIME = UPDATED_TIME;
    }

    @Override
    public String toString() {
        return "UserMoneyLog{" +
        "UserMoneyLogId=" + UserMoneyLogId +
        ", CustomerId=" + CustomerId +
        ", MoneyTypeId=" + MoneyTypeId +
        ", BusinessType=" + BusinessType +
        ", OrderNo=" + OrderNo +
        ", OrderId=" + OrderId +
        ", UserMoneyContent=" + UserMoneyContent +
        ", BalanceBeforeChange=" + BalanceBeforeChange +
        ", RebateBeforeChange=" + RebateBeforeChange +
        ", UserMoney=" + UserMoney +
        ", BalanceAfterChange=" + BalanceAfterChange +
        ", RebateAfterChange=" + RebateAfterChange +
        ", CREATED_BY=" + CREATED_BY +
        ", CREATED_TIME=" + CREATED_TIME +
        ", UPDATED_BY=" + UPDATED_BY +
        ", UPDATED_TIME=" + UPDATED_TIME +
        "}";
    }
}
