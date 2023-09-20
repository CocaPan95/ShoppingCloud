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
public class CustomerERPType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long CustomerId;

    /**
     * 客户分类，对接金蝶传用：10为大流通，20为KA经销，30为无人抽卡
     */
    private Integer Type;

    private LocalDateTime CreateTime;


    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "CustomerERPType{" +
        "CustomerId=" + CustomerId +
        ", Type=" + Type +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
