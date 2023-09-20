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
public class CustomerFeedback implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer ID;

    private Long CustomerId;

    private String ContentText;

    private String PicUrls;

    private Boolean IsValid;

    private LocalDateTime CreateTime;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getContentText() {
        return ContentText;
    }

    public void setContentText(String ContentText) {
        this.ContentText = ContentText;
    }

    public String getPicUrls() {
        return PicUrls;
    }

    public void setPicUrls(String PicUrls) {
        this.PicUrls = PicUrls;
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

    @Override
    public String toString() {
        return "CustomerFeedback{" +
        "ID=" + ID +
        ", CustomerId=" + CustomerId +
        ", ContentText=" + ContentText +
        ", PicUrls=" + PicUrls +
        ", IsValid=" + IsValid +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
