package com.shop.model.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class UserCustomers implements Serializable {

    private static final long serialVersionUID = 1L;

      private Long UserId;

      private Long CustomerId;

      private Long UserId;

      private Long CustomerId;


    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    @Override
    public String toString() {
        return "UserCustomers{" +
        "UserId=" + UserId +
        ", CustomerId=" + CustomerId +
        ", UserId=" + UserId +
        ", CustomerId=" + CustomerId +
        "}";
    }
}
