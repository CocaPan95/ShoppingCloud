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
public class CustomerGuide implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 指引主键ID
     */
    private Long GuideId;

    /**
     * 用户ID
     */
    private Long CustomerId;

    /**
     * 是否已读，1：已读
     */
    private Boolean IsRead;

    /**
     * 版本号
     */
    private String AppVersionCode;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    private LocalDateTime UpdateTime;


    public Long getGuideId() {
        return GuideId;
    }

    public void setGuideId(Long GuideId) {
        this.GuideId = GuideId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Boolean getIsRead() {
        return IsRead;
    }

    public void setIsRead(Boolean IsRead) {
        this.IsRead = IsRead;
    }

    public String getAppVersionCode() {
        return AppVersionCode;
    }

    public void setAppVersionCode(String AppVersionCode) {
        this.AppVersionCode = AppVersionCode;
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
        return "CustomerGuide{" +
        "GuideId=" + GuideId +
        ", CustomerId=" + CustomerId +
        ", IsRead=" + IsRead +
        ", AppVersionCode=" + AppVersionCode +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
