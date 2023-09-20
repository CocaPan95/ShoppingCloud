package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class AppUpgrade implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 客户端设备id   1.安卓pad    2.安卓手机   3.ios手机   4. iospad
     */
    private Integer AppId;

    private String AppName;

    /**
     * 版本标识 1.2
     */
    private String AppVersionCode;

    private String AppVersionName;

    private String ImgUrl;

    private String ApkUrl;

    /**
     * 升级版本详细的父级ID
     */
    private Integer UpdateParentId;

    private String UpdateDescription;

    private String UpdateLog;

    private LocalDateTime CreateTime;

    private Boolean IsValid;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getAppId() {
        return AppId;
    }

    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    public String getAppName() {
        return AppName;
    }

    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    public String getAppVersionCode() {
        return AppVersionCode;
    }

    public void setAppVersionCode(String AppVersionCode) {
        this.AppVersionCode = AppVersionCode;
    }

    public String getAppVersionName() {
        return AppVersionName;
    }

    public void setAppVersionName(String AppVersionName) {
        this.AppVersionName = AppVersionName;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public String getApkUrl() {
        return ApkUrl;
    }

    public void setApkUrl(String ApkUrl) {
        this.ApkUrl = ApkUrl;
    }

    public Integer getUpdateParentId() {
        return UpdateParentId;
    }

    public void setUpdateParentId(Integer UpdateParentId) {
        this.UpdateParentId = UpdateParentId;
    }

    public String getUpdateDescription() {
        return UpdateDescription;
    }

    public void setUpdateDescription(String UpdateDescription) {
        this.UpdateDescription = UpdateDescription;
    }

    public String getUpdateLog() {
        return UpdateLog;
    }

    public void setUpdateLog(String UpdateLog) {
        this.UpdateLog = UpdateLog;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public Boolean getIsValid() {
        return IsValid;
    }

    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    @Override
    public String toString() {
        return "AppUpgrade{" +
        "Id=" + Id +
        ", AppId=" + AppId +
        ", AppName=" + AppName +
        ", AppVersionCode=" + AppVersionCode +
        ", AppVersionName=" + AppVersionName +
        ", ImgUrl=" + ImgUrl +
        ", ApkUrl=" + ApkUrl +
        ", UpdateParentId=" + UpdateParentId +
        ", UpdateDescription=" + UpdateDescription +
        ", UpdateLog=" + UpdateLog +
        ", CreateTime=" + CreateTime +
        ", IsValid=" + IsValid +
        "}";
    }
}
