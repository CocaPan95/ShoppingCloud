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
public class EmailSendRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户ID
     */
    private Integer CustomerId;

    private String GUID;

    /**
     * 邮件发送时间
     */
    private LocalDateTime SendTime;


    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getGUID() {
        return GUID;
    }

    public void setGUID(String GUID) {
        this.GUID = GUID;
    }

    public LocalDateTime getSendTime() {
        return SendTime;
    }

    public void setSendTime(LocalDateTime SendTime) {
        this.SendTime = SendTime;
    }

    @Override
    public String toString() {
        return "EmailSendRecord{" +
        "CustomerId=" + CustomerId +
        ", GUID=" + GUID +
        ", SendTime=" + SendTime +
        "}";
    }
}
