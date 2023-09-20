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
public class DefinedColumns implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Long UserId;

    private Long ListId;

    private Long ColumnId;

    private Boolean IsEnable;

    private Boolean IsDeleted;

    private LocalDateTime CreateTime;

    private String CreateName;

    private LocalDateTime UpdateTime;

    private String UpdateName;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public Long getListId() {
        return ListId;
    }

    public void setListId(Long ListId) {
        this.ListId = ListId;
    }

    public Long getColumnId() {
        return ColumnId;
    }

    public void setColumnId(Long ColumnId) {
        this.ColumnId = ColumnId;
    }

    public Boolean getIsEnable() {
        return IsEnable;
    }

    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
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

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    @Override
    public String toString() {
        return "DefinedColumns{" +
        "Id=" + Id +
        ", UserId=" + UserId +
        ", ListId=" + ListId +
        ", ColumnId=" + ColumnId +
        ", IsEnable=" + IsEnable +
        ", IsDeleted=" + IsDeleted +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        ", UpdateTime=" + UpdateTime +
        ", UpdateName=" + UpdateName +
        "}";
    }
}
