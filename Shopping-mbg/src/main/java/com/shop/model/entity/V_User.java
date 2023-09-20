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
public class V_User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer UserId;

    private String LoginName;

    private String LoginPwd;

    private String RealName;

    private String Dept;

    private Integer PositionId;

    private Integer AreaId;

    private Integer OfficeId;

    private Boolean IsSuperAdmin;

    private Boolean Enable;

    private Boolean Valid;

    private Integer CreateUserId;

    private LocalDateTime CreateTime;

    private LocalDateTime UpdateTime;

    private String UpdateName;

    private Integer Gender;

    private String Phone;

    private String QQ;

    private String WechatNo;

    private String Mobile;

    private String Remark;

    private Long CreateOfficeId;

    private LocalDateTime LastLoginTime;

    private LocalDateTime LastVisitTime;

    private String UserPhoto;


    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer UserId) {
        this.UserId = UserId;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String LoginName) {
        this.LoginName = LoginName;
    }

    public String getLoginPwd() {
        return LoginPwd;
    }

    public void setLoginPwd(String LoginPwd) {
        this.LoginPwd = LoginPwd;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String Dept) {
        this.Dept = Dept;
    }

    public Integer getPositionId() {
        return PositionId;
    }

    public void setPositionId(Integer PositionId) {
        this.PositionId = PositionId;
    }

    public Integer getAreaId() {
        return AreaId;
    }

    public void setAreaId(Integer AreaId) {
        this.AreaId = AreaId;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public Boolean getIsSuperAdmin() {
        return IsSuperAdmin;
    }

    public void setIsSuperAdmin(Boolean IsSuperAdmin) {
        this.IsSuperAdmin = IsSuperAdmin;
    }

    public Boolean getEnable() {
        return Enable;
    }

    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public Integer getCreateUserId() {
        return CreateUserId;
    }

    public void setCreateUserId(Integer CreateUserId) {
        this.CreateUserId = CreateUserId;
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

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer Gender) {
        this.Gender = Gender;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getWechatNo() {
        return WechatNo;
    }

    public void setWechatNo(String WechatNo) {
        this.WechatNo = WechatNo;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public Long getCreateOfficeId() {
        return CreateOfficeId;
    }

    public void setCreateOfficeId(Long CreateOfficeId) {
        this.CreateOfficeId = CreateOfficeId;
    }

    public LocalDateTime getLastLoginTime() {
        return LastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime LastLoginTime) {
        this.LastLoginTime = LastLoginTime;
    }

    public LocalDateTime getLastVisitTime() {
        return LastVisitTime;
    }

    public void setLastVisitTime(LocalDateTime LastVisitTime) {
        this.LastVisitTime = LastVisitTime;
    }

    public String getUserPhoto() {
        return UserPhoto;
    }

    public void setUserPhoto(String UserPhoto) {
        this.UserPhoto = UserPhoto;
    }

    @Override
    public String toString() {
        return "V_User{" +
        "UserId=" + UserId +
        ", LoginName=" + LoginName +
        ", LoginPwd=" + LoginPwd +
        ", RealName=" + RealName +
        ", Dept=" + Dept +
        ", PositionId=" + PositionId +
        ", AreaId=" + AreaId +
        ", OfficeId=" + OfficeId +
        ", IsSuperAdmin=" + IsSuperAdmin +
        ", Enable=" + Enable +
        ", Valid=" + Valid +
        ", CreateUserId=" + CreateUserId +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        ", UpdateName=" + UpdateName +
        ", Gender=" + Gender +
        ", Phone=" + Phone +
        ", QQ=" + QQ +
        ", WechatNo=" + WechatNo +
        ", Mobile=" + Mobile +
        ", Remark=" + Remark +
        ", CreateOfficeId=" + CreateOfficeId +
        ", LastLoginTime=" + LastLoginTime +
        ", LastVisitTime=" + LastVisitTime +
        ", UserPhoto=" + UserPhoto +
        "}";
    }
}
