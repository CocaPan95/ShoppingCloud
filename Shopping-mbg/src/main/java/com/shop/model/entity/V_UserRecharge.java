package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class V_UserRecharge implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long UserRechargeId;

    private Double RechargeMoney;

    private String RechargeImg;

    private LocalDate RechargeDate;

    private String UserRemarks;

    private String Examine;

    private String ExamineDesc;

    private LocalDateTime ExamineDate;

    private String ExamineUser;

    private String CustomerCode;

    private Long CustomerId;

    private String UserName;

    private String Mobile;

    private String RealName;

    private String OfficeName;

    private Double DiscountRate;

    private String AreaName;

    private Integer CustomerType;

    private Integer AreaId;

    private Integer OfficeId;

    private Integer SalesmanId;

    private Integer CompanyId;

    private String Alias;

    private String ColorName;

    private Double BalanceMoney;

    private String StoreName;

    private Integer VipNum;

    private String VipNumName;


    public Long getUserRechargeId() {
        return UserRechargeId;
    }

    public void setUserRechargeId(Long UserRechargeId) {
        this.UserRechargeId = UserRechargeId;
    }

    public Double getRechargeMoney() {
        return RechargeMoney;
    }

    public void setRechargeMoney(Double RechargeMoney) {
        this.RechargeMoney = RechargeMoney;
    }

    public String getRechargeImg() {
        return RechargeImg;
    }

    public void setRechargeImg(String RechargeImg) {
        this.RechargeImg = RechargeImg;
    }

    public LocalDate getRechargeDate() {
        return RechargeDate;
    }

    public void setRechargeDate(LocalDate RechargeDate) {
        this.RechargeDate = RechargeDate;
    }

    public String getUserRemarks() {
        return UserRemarks;
    }

    public void setUserRemarks(String UserRemarks) {
        this.UserRemarks = UserRemarks;
    }

    public String getExamine() {
        return Examine;
    }

    public void setExamine(String Examine) {
        this.Examine = Examine;
    }

    public String getExamineDesc() {
        return ExamineDesc;
    }

    public void setExamineDesc(String ExamineDesc) {
        this.ExamineDesc = ExamineDesc;
    }

    public LocalDateTime getExamineDate() {
        return ExamineDate;
    }

    public void setExamineDate(LocalDateTime ExamineDate) {
        this.ExamineDate = ExamineDate;
    }

    public String getExamineUser() {
        return ExamineUser;
    }

    public void setExamineUser(String ExamineUser) {
        this.ExamineUser = ExamineUser;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    public String getOfficeName() {
        return OfficeName;
    }

    public void setOfficeName(String OfficeName) {
        this.OfficeName = OfficeName;
    }

    public Double getDiscountRate() {
        return DiscountRate;
    }

    public void setDiscountRate(Double DiscountRate) {
        this.DiscountRate = DiscountRate;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    public Integer getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(Integer CustomerType) {
        this.CustomerType = CustomerType;
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

    public Integer getSalesmanId() {
        return SalesmanId;
    }

    public void setSalesmanId(Integer SalesmanId) {
        this.SalesmanId = SalesmanId;
    }

    public Integer getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(Integer CompanyId) {
        this.CompanyId = CompanyId;
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

    public Double getBalanceMoney() {
        return BalanceMoney;
    }

    public void setBalanceMoney(Double BalanceMoney) {
        this.BalanceMoney = BalanceMoney;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public Integer getVipNum() {
        return VipNum;
    }

    public void setVipNum(Integer VipNum) {
        this.VipNum = VipNum;
    }

    public String getVipNumName() {
        return VipNumName;
    }

    public void setVipNumName(String VipNumName) {
        this.VipNumName = VipNumName;
    }

    @Override
    public String toString() {
        return "V_UserRecharge{" +
        "UserRechargeId=" + UserRechargeId +
        ", RechargeMoney=" + RechargeMoney +
        ", RechargeImg=" + RechargeImg +
        ", RechargeDate=" + RechargeDate +
        ", UserRemarks=" + UserRemarks +
        ", Examine=" + Examine +
        ", ExamineDesc=" + ExamineDesc +
        ", ExamineDate=" + ExamineDate +
        ", ExamineUser=" + ExamineUser +
        ", CustomerCode=" + CustomerCode +
        ", CustomerId=" + CustomerId +
        ", UserName=" + UserName +
        ", Mobile=" + Mobile +
        ", RealName=" + RealName +
        ", OfficeName=" + OfficeName +
        ", DiscountRate=" + DiscountRate +
        ", AreaName=" + AreaName +
        ", CustomerType=" + CustomerType +
        ", AreaId=" + AreaId +
        ", OfficeId=" + OfficeId +
        ", SalesmanId=" + SalesmanId +
        ", CompanyId=" + CompanyId +
        ", Alias=" + Alias +
        ", ColorName=" + ColorName +
        ", BalanceMoney=" + BalanceMoney +
        ", StoreName=" + StoreName +
        ", VipNum=" + VipNum +
        ", VipNumName=" + VipNumName +
        "}";
    }
}
