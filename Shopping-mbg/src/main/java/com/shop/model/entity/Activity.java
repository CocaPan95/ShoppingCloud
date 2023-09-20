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
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private String Name;

    private Integer Type;

    private Integer ScopeType;

    private Integer SkuId;

    private LocalDateTime BeginDate;

    private LocalDateTime EndDate;

    private Integer Status;

    private String Remark;

    private String Version;

    private String CreateBy;

    private LocalDateTime CreateTime;

    private String UpdateBy;

    private LocalDateTime UpdateTime;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public Integer getScopeType() {
        return ScopeType;
    }

    public void setScopeType(Integer ScopeType) {
        this.ScopeType = ScopeType;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public LocalDateTime getBeginDate() {
        return BeginDate;
    }

    public void setBeginDate(LocalDateTime BeginDate) {
        this.BeginDate = BeginDate;
    }

    public LocalDateTime getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDateTime EndDate) {
        this.EndDate = EndDate;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
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

    @Override
    public String toString() {
        return "Activity{" +
        "Id=" + Id +
        ", Name=" + Name +
        ", Type=" + Type +
        ", ScopeType=" + ScopeType +
        ", SkuId=" + SkuId +
        ", BeginDate=" + BeginDate +
        ", EndDate=" + EndDate +
        ", Status=" + Status +
        ", Remark=" + Remark +
        ", Version=" + Version +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        ", UpdateBy=" + UpdateBy +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
