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
public class ShopCart implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ItemId;

    private Integer CustomerId;

    private Integer SkuId;

    private Integer Qty;

    private LocalDateTime CreateTime;

    /**
     * 1是店铺购物车，2是业务员购物车
     */
    private Integer UserType;


    public Integer getItemId() {
        return ItemId;
    }

    public void setItemId(Integer ItemId) {
        this.ItemId = ItemId;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getQty() {
        return Qty;
    }

    public void setQty(Integer Qty) {
        this.Qty = Qty;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Integer getUserType() {
        return UserType;
    }

    public void setUserType(Integer UserType) {
        this.UserType = UserType;
    }

    @Override
    public String toString() {
        return "ShopCart{" +
        "ItemId=" + ItemId +
        ", CustomerId=" + CustomerId +
        ", SkuId=" + SkuId +
        ", Qty=" + Qty +
        ", CreateTime=" + CreateTime +
        ", UserType=" + UserType +
        "}";
    }
}
