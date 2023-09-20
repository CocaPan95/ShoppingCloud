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
public class OrderShipPrint implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    private Integer OrderId;

    private String OrderNo;

    private Long UserId;

    private String UserName;

    private LocalDateTime AddTime;


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

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
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
        return "OrderShipPrint{" +
        "Id=" + Id +
        ", OrderId=" + OrderId +
        ", OrderNo=" + OrderNo +
        ", UserId=" + UserId +
        ", UserName=" + UserName +
        ", AddTime=" + AddTime +
        "}";
    }
}
