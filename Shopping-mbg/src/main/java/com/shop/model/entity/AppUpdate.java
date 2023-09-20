package com.shop.model.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class AppUpdate implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer AppId;

    /**
     * 版本号
     */
    private String Ver;

    private String IosVer;

    /**
     * 更新包下载地址
     */
    private String VerUrl;

    /**
     * 是否开启更新
     */
    private Boolean IsOpen;

    /**
     * 是否是大更新
     */
    private Boolean IsBigUpdate;

    /**
     * 是否系统维护
     */
    private Boolean IsMaintain;

    /**
     * 更新说明
     */
    private String Desc;

    /**
     * 安卓整包升级地址
     */
    private String AndroidUrl;

    /**
     * Ios整包升级地址
     */
    private String IosUrl;

    /**
     * 二维码图片地址
     */
    private String WebCodeUrl;

    /**
     * 软件说明
     */
    private String SoftAbout;

    private Integer AndroidDownloadCount;

    private Integer IosDownloadCount;

    private Boolean IsPasswordLogin;


    public Integer getAppId() {
        return AppId;
    }

    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    public String getVer() {
        return Ver;
    }

    public void setVer(String Ver) {
        this.Ver = Ver;
    }

    public String getIosVer() {
        return IosVer;
    }

    public void setIosVer(String IosVer) {
        this.IosVer = IosVer;
    }

    public String getVerUrl() {
        return VerUrl;
    }

    public void setVerUrl(String VerUrl) {
        this.VerUrl = VerUrl;
    }

    public Boolean getIsOpen() {
        return IsOpen;
    }

    public void setIsOpen(Boolean IsOpen) {
        this.IsOpen = IsOpen;
    }

    public Boolean getIsBigUpdate() {
        return IsBigUpdate;
    }

    public void setIsBigUpdate(Boolean IsBigUpdate) {
        this.IsBigUpdate = IsBigUpdate;
    }

    public Boolean getIsMaintain() {
        return IsMaintain;
    }

    public void setIsMaintain(Boolean IsMaintain) {
        this.IsMaintain = IsMaintain;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getAndroidUrl() {
        return AndroidUrl;
    }

    public void setAndroidUrl(String AndroidUrl) {
        this.AndroidUrl = AndroidUrl;
    }

    public String getIosUrl() {
        return IosUrl;
    }

    public void setIosUrl(String IosUrl) {
        this.IosUrl = IosUrl;
    }

    public String getWebCodeUrl() {
        return WebCodeUrl;
    }

    public void setWebCodeUrl(String WebCodeUrl) {
        this.WebCodeUrl = WebCodeUrl;
    }

    public String getSoftAbout() {
        return SoftAbout;
    }

    public void setSoftAbout(String SoftAbout) {
        this.SoftAbout = SoftAbout;
    }

    public Integer getAndroidDownloadCount() {
        return AndroidDownloadCount;
    }

    public void setAndroidDownloadCount(Integer AndroidDownloadCount) {
        this.AndroidDownloadCount = AndroidDownloadCount;
    }

    public Integer getIosDownloadCount() {
        return IosDownloadCount;
    }

    public void setIosDownloadCount(Integer IosDownloadCount) {
        this.IosDownloadCount = IosDownloadCount;
    }

    public Boolean getIsPasswordLogin() {
        return IsPasswordLogin;
    }

    public void setIsPasswordLogin(Boolean IsPasswordLogin) {
        this.IsPasswordLogin = IsPasswordLogin;
    }

    @Override
    public String toString() {
        return "AppUpdate{" +
        "AppId=" + AppId +
        ", Ver=" + Ver +
        ", IosVer=" + IosVer +
        ", VerUrl=" + VerUrl +
        ", IsOpen=" + IsOpen +
        ", IsBigUpdate=" + IsBigUpdate +
        ", IsMaintain=" + IsMaintain +
        ", Desc=" + Desc +
        ", AndroidUrl=" + AndroidUrl +
        ", IosUrl=" + IosUrl +
        ", WebCodeUrl=" + WebCodeUrl +
        ", SoftAbout=" + SoftAbout +
        ", AndroidDownloadCount=" + AndroidDownloadCount +
        ", IosDownloadCount=" + IosDownloadCount +
        ", IsPasswordLogin=" + IsPasswordLogin +
        "}";
    }
}
