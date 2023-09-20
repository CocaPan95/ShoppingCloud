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
public class CustomerDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID CustomerId
     */
    private Long ID;

    /**
     * 设备类型，0：android;1:ios
     */
    private Boolean IsIos;

    private Boolean IsDelete;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    private LocalDateTime UpdateTime;


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Boolean getIsIos() {
        return IsIos;
    }

    public void setIsIos(Boolean IsIos) {
        this.IsIos = IsIos;
    }

    public Boolean getIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(Boolean IsDelete) {
        this.IsDelete = IsDelete;
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
        return "CustomerDevice{" +
        "ID=" + ID +
        ", IsIos=" + IsIos +
        ", IsDelete=" + IsDelete +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
