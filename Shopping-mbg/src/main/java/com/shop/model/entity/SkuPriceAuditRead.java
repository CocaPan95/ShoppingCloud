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
public class SkuPriceAuditRead implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer Id;

    private Integer SkuPriceAuditId;

    private Long UserId;

    private Boolean IsRead;

    private String CreateBy;

    private LocalDateTime CreateTime;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getSkuPriceAuditId() {
        return SkuPriceAuditId;
    }

    public void setSkuPriceAuditId(Integer SkuPriceAuditId) {
        this.SkuPriceAuditId = SkuPriceAuditId;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public Boolean getIsRead() {
        return IsRead;
    }

    public void setIsRead(Boolean IsRead) {
        this.IsRead = IsRead;
    }

    public String getCreateBy() {
        return CreateBy;
    }

    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "SkuPriceAuditRead{" +
        "Id=" + Id +
        ", SkuPriceAuditId=" + SkuPriceAuditId +
        ", UserId=" + UserId +
        ", IsRead=" + IsRead +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
