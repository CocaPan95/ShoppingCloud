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
public class V_UserMoney implements Serializable {

    private static final long serialVersionUID = 1L;

    private String CustomerCode;

    private Long CustomerId;

    private String UserName;

    private String Mobile;

    private String RealName;

    private Integer OfficeId;

    private Double DiscountRate;

    private String AreaName;

    private Integer SalesmanId;

    private Integer CustomerType;

    private String StoreName;

    private Integer CompanyId;

    private String Alias;

    private String ColorName;

    private Long UserMoneyId;

    private Double BalanceMoney;

    private Double CreditMoney;

    private Double ReturnMoney;

    private Long CardId;

    private Boolean CardIdValid;

    private String CardNo;

    private Double CardMoney;


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

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
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

    public Integer getSalesmanId() {
        return SalesmanId;
    }

    public void setSalesmanId(Integer SalesmanId) {
        this.SalesmanId = SalesmanId;
    }

    public Integer getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(Integer CustomerType) {
        this.CustomerType = CustomerType;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
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

    public Long getUserMoneyId() {
        return UserMoneyId;
    }

    public void setUserMoneyId(Long UserMoneyId) {
        this.UserMoneyId = UserMoneyId;
    }

    public Double getBalanceMoney() {
        return BalanceMoney;
    }

    public void setBalanceMoney(Double BalanceMoney) {
        this.BalanceMoney = BalanceMoney;
    }

    public Double getCreditMoney() {
        return CreditMoney;
    }

    public void setCreditMoney(Double CreditMoney) {
        this.CreditMoney = CreditMoney;
    }

    public Double getReturnMoney() {
        return ReturnMoney;
    }

    public void setReturnMoney(Double ReturnMoney) {
        this.ReturnMoney = ReturnMoney;
    }

    public Long getCardId() {
        return CardId;
    }

    public void setCardId(Long CardId) {
        this.CardId = CardId;
    }

    public Boolean getCardIdValid() {
        return CardIdValid;
    }

    public void setCardIdValid(Boolean CardIdValid) {
        this.CardIdValid = CardIdValid;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public Double getCardMoney() {
        return CardMoney;
    }

    public void setCardMoney(Double CardMoney) {
        this.CardMoney = CardMoney;
    }

    @Override
    public String toString() {
        return "V_UserMoney{" +
        "CustomerCode=" + CustomerCode +
        ", CustomerId=" + CustomerId +
        ", UserName=" + UserName +
        ", Mobile=" + Mobile +
        ", RealName=" + RealName +
        ", OfficeId=" + OfficeId +
        ", DiscountRate=" + DiscountRate +
        ", AreaName=" + AreaName +
        ", SalesmanId=" + SalesmanId +
        ", CustomerType=" + CustomerType +
        ", StoreName=" + StoreName +
        ", CompanyId=" + CompanyId +
        ", Alias=" + Alias +
        ", ColorName=" + ColorName +
        ", UserMoneyId=" + UserMoneyId +
        ", BalanceMoney=" + BalanceMoney +
        ", CreditMoney=" + CreditMoney +
        ", ReturnMoney=" + ReturnMoney +
        ", CardId=" + CardId +
        ", CardIdValid=" + CardIdValid +
        ", CardNo=" + CardNo +
        ", CardMoney=" + CardMoney +
        "}";
    }
}
