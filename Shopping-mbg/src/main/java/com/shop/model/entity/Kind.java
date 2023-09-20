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
public class Kind implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类目Id
     */
    private Integer ID;

    /**
     * 类目名称
     */
    private String Name;

    private Integer Sort;

    /**
     * 是否启用：true为启用，false为禁用
     */
    private Boolean IsEnable;

    /**
     * 是否删除，0为未删除，1为已删除
     */
    private Boolean Valid;

    /**
     * 创建人员
     */
    private String CreateName;

    /**
     * 新建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 更新人员
     */
    private String UpdateName;

    /**
     * 更新时间
     */
    private LocalDateTime UpdateTime;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getSort() {
        return Sort;
    }

    public void setSort(Integer Sort) {
        this.Sort = Sort;
    }

    public Boolean getIsEnable() {
        return IsEnable;
    }

    public void setIsEnable(Boolean IsEnable) {
        this.IsEnable = IsEnable;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    @Override
    public String toString() {
        return "Kind{" +
        "ID=" + ID +
        ", Name=" + Name +
        ", Sort=" + Sort +
        ", IsEnable=" + IsEnable +
        ", Valid=" + Valid +
        ", CreateName=" + CreateName +
        ", CreateTime=" + CreateTime +
        ", UpdateName=" + UpdateName +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
