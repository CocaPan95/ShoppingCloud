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
public class CustomerFeedbackCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer Id;

    /**
     * 1.进货宝,2.小程序
     */
    private Integer Source;

    private String FeedBackType;

    private Boolean IsValid;

    private LocalDateTime CreateTime;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getSource() {
        return Source;
    }

    public void setSource(Integer Source) {
        this.Source = Source;
    }

    public String getFeedBackType() {
        return FeedBackType;
    }

    public void setFeedBackType(String FeedBackType) {
        this.FeedBackType = FeedBackType;
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
        return "CustomerFeedbackCategory{" +
        "Id=" + Id +
        ", Source=" + Source +
        ", FeedBackType=" + FeedBackType +
        ", IsValid=" + IsValid +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
