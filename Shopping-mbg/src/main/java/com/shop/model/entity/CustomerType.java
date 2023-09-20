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
public class CustomerType implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer CustomerTypeId;

    private String CustomerTypeName;

    private Boolean IsEnabled;

    private Integer CreatorId;

    private LocalDateTime CreateTime;


    public Integer getCustomerTypeId() {
        return CustomerTypeId;
    }

    public void setCustomerTypeId(Integer CustomerTypeId) {
        this.CustomerTypeId = CustomerTypeId;
    }

    public String getCustomerTypeName() {
        return CustomerTypeName;
    }

    public void setCustomerTypeName(String CustomerTypeName) {
        this.CustomerTypeName = CustomerTypeName;
    }

    public Boolean getIsEnabled() {
        return IsEnabled;
    }

    public void setIsEnabled(Boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    public Integer getCreatorId() {
        return CreatorId;
    }

    public void setCreatorId(Integer CreatorId) {
        this.CreatorId = CreatorId;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "CustomerType{" +
        "CustomerTypeId=" + CustomerTypeId +
        ", CustomerTypeName=" + CustomerTypeName +
        ", IsEnabled=" + IsEnabled +
        ", CreatorId=" + CreatorId +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
