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
public class CustomerFavorites implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer Id;

    private Long CustomerId;

    private Integer ProductId;

    private Integer SkuId;

    private Boolean IsValid;

    private LocalDateTime CreateTime;

    private LocalDateTime UpdateTime;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer ProductId) {
        this.ProductId = ProductId;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public Boolean getIsValid() {
        return IsValid;
    }

    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    @Override
    public String toString() {
        return "CustomerFavorites{" +
        "Id=" + Id +
        ", CustomerId=" + CustomerId +
        ", ProductId=" + ProductId +
        ", SkuId=" + SkuId +
        ", IsValid=" + IsValid +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
