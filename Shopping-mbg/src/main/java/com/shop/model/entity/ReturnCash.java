package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户返现记录
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class ReturnCash implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
      @TableId(value = "ReturnCashId", type = IdType.AUTO)
    private Long ReturnCashId;

    /**
     * 商家Id
     */
    private Long CustomerId;

    /**
     * 返现年月份
     */
    private LocalDate ReturnDate;

    private Double OrderMoney;

    /**
     * 返现金额
     */
    private Double ReturnMoney;

    /**
     * 返现说明
     */
    private String ReturnContent;

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


    public Long getReturnCashId() {
        return ReturnCashId;
    }

    public void setReturnCashId(Long ReturnCashId) {
        this.ReturnCashId = ReturnCashId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public LocalDate getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(LocalDate ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public Double getOrderMoney() {
        return OrderMoney;
    }

    public void setOrderMoney(Double OrderMoney) {
        this.OrderMoney = OrderMoney;
    }

    public Double getReturnMoney() {
        return ReturnMoney;
    }

    public void setReturnMoney(Double ReturnMoney) {
        this.ReturnMoney = ReturnMoney;
    }

    public String getReturnContent() {
        return ReturnContent;
    }

    public void setReturnContent(String ReturnContent) {
        this.ReturnContent = ReturnContent;
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

    @Override
    public String toString() {
        return "ReturnCash{" +
        "ReturnCashId=" + ReturnCashId +
        ", CustomerId=" + CustomerId +
        ", ReturnDate=" + ReturnDate +
        ", OrderMoney=" + OrderMoney +
        ", ReturnMoney=" + ReturnMoney +
        ", ReturnContent=" + ReturnContent +
        ", CREATED_BY=" + CREATED_BY +
        ", CREATED_TIME=" + CREATED_TIME +
        ", UPDATED_BY=" + UPDATED_BY +
        ", UPDATED_TIME=" + UPDATED_TIME +
        "}";
    }
}
