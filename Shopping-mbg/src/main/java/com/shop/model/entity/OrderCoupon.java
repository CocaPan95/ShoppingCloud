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
public class OrderCoupon implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long OrderCouponId;

    private Long OrderId;

    private Long CouponId;

    private Long CouponCodeId;

    private Double ActualReduceMoney;

    private String remark;

    private LocalDateTime CreateTime;


    public Long getOrderCouponId() {
        return OrderCouponId;
    }

    public void setOrderCouponId(Long OrderCouponId) {
        this.OrderCouponId = OrderCouponId;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    public Long getCouponId() {
        return CouponId;
    }

    public void setCouponId(Long CouponId) {
        this.CouponId = CouponId;
    }

    public Long getCouponCodeId() {
        return CouponCodeId;
    }

    public void setCouponCodeId(Long CouponCodeId) {
        this.CouponCodeId = CouponCodeId;
    }

    public Double getActualReduceMoney() {
        return ActualReduceMoney;
    }

    public void setActualReduceMoney(Double ActualReduceMoney) {
        this.ActualReduceMoney = ActualReduceMoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "OrderCoupon{" +
        "OrderCouponId=" + OrderCouponId +
        ", OrderId=" + OrderId +
        ", CouponId=" + CouponId +
        ", CouponCodeId=" + CouponCodeId +
        ", ActualReduceMoney=" + ActualReduceMoney +
        ", remark=" + remark +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
