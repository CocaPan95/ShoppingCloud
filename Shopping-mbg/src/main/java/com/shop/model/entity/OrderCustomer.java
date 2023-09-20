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
public class OrderCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long OrderCustomerId;

    private Long OrderId;

    private Long CustomerId;

    private String RealName;

    private Integer CompanyId;

    private LocalDateTime CreateTime;


    public Long getOrderCustomerId() {
        return OrderCustomerId;
    }

    public void setOrderCustomerId(Long OrderCustomerId) {
        this.OrderCustomerId = OrderCustomerId;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    public Integer getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(Integer CompanyId) {
        this.CompanyId = CompanyId;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "OrderCustomer{" +
        "OrderCustomerId=" + OrderCustomerId +
        ", OrderId=" + OrderId +
        ", CustomerId=" + CustomerId +
        ", RealName=" + RealName +
        ", CompanyId=" + CompanyId +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
