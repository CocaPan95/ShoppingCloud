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
public class DeliveryMoney implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Long OrderId;

    private Long BId;

    private Integer Type;

    private Double Amount;

    private Double SubTotalAmount;

    private LocalDateTime CreateTime;

    private String CreateName;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    public Long getBId() {
        return BId;
    }

    public void setBId(Long BId) {
        this.BId = BId;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public Double getSubTotalAmount() {
        return SubTotalAmount;
    }

    public void setSubTotalAmount(Double SubTotalAmount) {
        this.SubTotalAmount = SubTotalAmount;
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

    @Override
    public String toString() {
        return "DeliveryMoney{" +
        "Id=" + Id +
        ", OrderId=" + OrderId +
        ", BId=" + BId +
        ", Type=" + Type +
        ", Amount=" + Amount +
        ", SubTotalAmount=" + SubTotalAmount +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        "}";
    }
}
