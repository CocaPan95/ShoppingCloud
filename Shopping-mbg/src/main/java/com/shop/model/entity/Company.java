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
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer Id;

    private String Name;

    private String Alias;

    private String ColorName;

    private Boolean IsCompany;

    private Boolean IsOwner;

    private Boolean Enable;

    private Boolean IsDeleted;

    private String CreateMan;

    private LocalDateTime CreateTime;

    private String UpdateName;

    private LocalDateTime UpdateTime;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getColorName() {
        return ColorName;
    }

    public void setColorName(String ColorName) {
        this.ColorName = ColorName;
    }

    public Boolean getIsCompany() {
        return IsCompany;
    }

    public void setIsCompany(Boolean IsCompany) {
        this.IsCompany = IsCompany;
    }

    public Boolean getIsOwner() {
        return IsOwner;
    }

    public void setIsOwner(Boolean IsOwner) {
        this.IsOwner = IsOwner;
    }

    public Boolean getEnable() {
        return Enable;
    }

    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public String getCreateMan() {
        return CreateMan;
    }

    public void setCreateMan(String CreateMan) {
        this.CreateMan = CreateMan;
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
        return "Company{" +
        "Id=" + Id +
        ", Name=" + Name +
        ", Alias=" + Alias +
        ", ColorName=" + ColorName +
        ", IsCompany=" + IsCompany +
        ", IsOwner=" + IsOwner +
        ", Enable=" + Enable +
        ", IsDeleted=" + IsDeleted +
        ", CreateMan=" + CreateMan +
        ", CreateTime=" + CreateTime +
        ", UpdateName=" + UpdateName +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
