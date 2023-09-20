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
public class ThirdpartyLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ThirdpartyLoginId;

    /**
     * 第三方登录类型ID（1-瑞士轮）
     */
    private Integer ThirdpartyType;

    private String CustomerCode;

    private LocalDateTime CreateTime;


    public String getThirdpartyLoginId() {
        return ThirdpartyLoginId;
    }

    public void setThirdpartyLoginId(String ThirdpartyLoginId) {
        this.ThirdpartyLoginId = ThirdpartyLoginId;
    }

    public Integer getThirdpartyType() {
        return ThirdpartyType;
    }

    public void setThirdpartyType(Integer ThirdpartyType) {
        this.ThirdpartyType = ThirdpartyType;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "ThirdpartyLogin{" +
        "ThirdpartyLoginId=" + ThirdpartyLoginId +
        ", ThirdpartyType=" + ThirdpartyType +
        ", CustomerCode=" + CustomerCode +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
