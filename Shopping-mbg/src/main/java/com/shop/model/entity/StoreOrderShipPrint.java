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
public class StoreOrderShipPrint implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Long OrderId;

    private Long UserId;

    private String UserName;

    private LocalDateTime AddTime;


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

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public LocalDateTime getAddTime() {
        return AddTime;
    }

    public void setAddTime(LocalDateTime AddTime) {
        this.AddTime = AddTime;
    }

    @Override
    public String toString() {
        return "StoreOrderShipPrint{" +
        "Id=" + Id +
        ", OrderId=" + OrderId +
        ", UserId=" + UserId +
        ", UserName=" + UserName +
        ", AddTime=" + AddTime +
        "}";
    }
}
