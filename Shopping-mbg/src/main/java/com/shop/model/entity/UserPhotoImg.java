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
public class UserPhotoImg implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer UserPhotoImgId;

    /**
     * 用户ID
     */
    private Integer UserId;

    /**
     * 图片URL地址
     */
    private String ImgUrl;

    /**
     * 是否是默认头像
     */
    private Boolean IsDefault;

    /**
     * 用户类型1是业务员，2是商家
     */
    private Integer UserType;

    private LocalDateTime CreateTime;


    public Integer getUserPhotoImgId() {
        return UserPhotoImgId;
    }

    public void setUserPhotoImgId(Integer UserPhotoImgId) {
        this.UserPhotoImgId = UserPhotoImgId;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer UserId) {
        this.UserId = UserId;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public Boolean getIsDefault() {
        return IsDefault;
    }

    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    public Integer getUserType() {
        return UserType;
    }

    public void setUserType(Integer UserType) {
        this.UserType = UserType;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "UserPhotoImg{" +
        "UserPhotoImgId=" + UserPhotoImgId +
        ", UserId=" + UserId +
        ", ImgUrl=" + ImgUrl +
        ", IsDefault=" + IsDefault +
        ", UserType=" + UserType +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
