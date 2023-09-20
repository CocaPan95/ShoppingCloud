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
public class V_UserMoneyAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Integer Type;

    private Long CustomerId;

    private LocalDate OpData;

    private Double Amount;

    private String Remark;

    private Integer Status;

    private String ErrorMessage;

    private String CreateBy;

    private LocalDateTime CreateTime;

    private String UpdateBy;

    private LocalDateTime UpdateTime;

    private String StoreName;

    private String CustomerCode;

    private String Mobile;

    private Integer OfficeId;

    private String OfficeName;

    private String AreaName;

    private Integer AreaId;

    private String Alias;

    private Integer CompanyId;

    private String UserName;

    private String RealName;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public LocalDate getOpData() {
        return OpData;
    }

    public void setOpData(LocalDate OpData) {
        this.OpData = OpData;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
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

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public String getOfficeName() {
        return OfficeName;
    }

    public void setOfficeName(String OfficeName) {
        this.OfficeName = OfficeName;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }

    public Integer getAreaId() {
        return AreaId;
    }

    public void setAreaId(Integer AreaId) {
        this.AreaId = AreaId;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public Integer getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(Integer CompanyId) {
        this.CompanyId = CompanyId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    @Override
    public String toString() {
        return "V_UserMoneyAudit{" +
        "Id=" + Id +
        ", Type=" + Type +
        ", CustomerId=" + CustomerId +
        ", OpData=" + OpData +
        ", Amount=" + Amount +
        ", Remark=" + Remark +
        ", Status=" + Status +
        ", ErrorMessage=" + ErrorMessage +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        ", UpdateBy=" + UpdateBy +
        ", UpdateTime=" + UpdateTime +
        ", StoreName=" + StoreName +
        ", CustomerCode=" + CustomerCode +
        ", Mobile=" + Mobile +
        ", OfficeId=" + OfficeId +
        ", OfficeName=" + OfficeName +
        ", AreaName=" + AreaName +
        ", AreaId=" + AreaId +
        ", Alias=" + Alias +
        ", CompanyId=" + CompanyId +
        ", UserName=" + UserName +
        ", RealName=" + RealName +
        "}";
    }
}
