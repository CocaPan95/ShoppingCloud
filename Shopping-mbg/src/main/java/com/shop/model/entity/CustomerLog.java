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
public class CustomerLog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer logId;

    private Integer customerId;

    private String logDesc;

    /**
     * 日志类型，1登录记录，2操作记录
     */
    private Integer logType;

    private LocalDateTime CreateTime;

    private String CreateName;


    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getLogDesc() {
        return logDesc;
    }

    public void setLogDesc(String logDesc) {
        this.logDesc = logDesc;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    @Override
    public String toString() {
        return "CustomerLog{" +
        "logId=" + logId +
        ", customerId=" + customerId +
        ", logDesc=" + logDesc +
        ", logType=" + logType +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        "}";
    }
}
