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
public class OrderActivity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Integer OrderId;

    private Long ActivityId;

    private Integer ActivityType;

    private Integer SkuId;

    private Integer GiftSkuId;

    private LocalDateTime CreateTime;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public Long getActivityId() {
        return ActivityId;
    }

    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    public Integer getActivityType() {
        return ActivityType;
    }

    public void setActivityType(Integer ActivityType) {
        this.ActivityType = ActivityType;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getGiftSkuId() {
        return GiftSkuId;
    }

    public void setGiftSkuId(Integer GiftSkuId) {
        this.GiftSkuId = GiftSkuId;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "OrderActivity{" +
        "Id=" + Id +
        ", OrderId=" + OrderId +
        ", ActivityId=" + ActivityId +
        ", ActivityType=" + ActivityType +
        ", SkuId=" + SkuId +
        ", GiftSkuId=" + GiftSkuId +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
