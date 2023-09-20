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
public class SkuPriceAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Integer SkuId;

    private Integer Type;

    private String Content;

    private String Remark;

    private Integer Status;

    private String CreateBy;

    private LocalDateTime CreateTime;

    private String UpdateBy;

    private LocalDateTime UpdateTime;

    private Integer Version;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
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

    public String getUpdateBy() {
        return UpdateBy;
    }

    public void setUpdateBy(String UpdateBy) {
        this.UpdateBy = UpdateBy;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Integer getVersion() {
        return Version;
    }

    public void setVersion(Integer Version) {
        this.Version = Version;
    }

    @Override
    public String toString() {
        return "SkuPriceAudit{" +
        "Id=" + Id +
        ", SkuId=" + SkuId +
        ", Type=" + Type +
        ", Content=" + Content +
        ", Remark=" + Remark +
        ", Status=" + Status +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        ", UpdateBy=" + UpdateBy +
        ", UpdateTime=" + UpdateTime +
        ", Version=" + Version +
        "}";
    }
}
