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
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 订单Id
     */
    private Long CustomerId;

    /**
     * 订单编码
     */
    private String CustomerCode;

    /**
     * 用户名
     */
    private String UserName;

    /**
     * 密码
     */
    private String Password;

    /**
     * 客户姓名
     */
    private String RealName;

    /**
     * 省
     */
    private Integer ProvinceId;

    /**
     * 市
     */
    private Integer CityId;

    /**
     * 区
     */
    private Integer DistrictId;

    /**
     * 客户地址
     */
    private String Address;

    /**
     * 电话
     */
    private String Tel;

    /**
     * 手机
     */
    private String Mobile;

    private String QQ;

    private String Email;

    private String StoreName;

    /**
     * 客户级别
     */
    private Integer CustomerLevel;

    /**
     * 1 终端店 2经销商 3批发商 4运营商
     */
    private Integer CustomerType;

    /**
     * 是否激活
     */
    private Boolean IsEmailActivate;

    /**
     * 激活时间
     */
    private LocalDateTime EmailActivateTime;

    private Integer OfficeId;

    /**
     * 0  删除商家 1 有效商家 2 冻结商家
     */
    private Integer Status;

    /**
     * 备注
     */
    private String Memo;

    /**
     * 该客户所属的业务员ID
     */
    private Integer SalesmanId;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    private LocalDateTime UpdateTime;

    /**
     * 最后访问时间
     */
    private LocalDateTime LastVisitTime;

    private LocalDateTime LastLoginTime;

    private String UpdateName;

    /**
     * 0：有效 1：无效
     */
    private Boolean Valid;

    private Long CreateOfficeId;

    private Long CreateSalesmanId;

    private Integer ScopeType;

    private Integer StoreType;

    /**
     * 1 本站客户 2 瑞士轮客户 3App用户
     */
    private Integer SourceId;

    private Double DiscountRate;

    private String DeviceToken;

    private Integer DeviceTypeId;

    /**
     * 客户等级
     */
    private Integer Customer;

    private Integer VipNum;

    private Integer CompanyId;

    private Boolean IsPurchaseDirectSku;


    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    public Integer getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(Integer ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    public Integer getCityId() {
        return CityId;
    }

    public void setCityId(Integer CityId) {
        this.CityId = CityId;
    }

    public Integer getDistrictId() {
        return DistrictId;
    }

    public void setDistrictId(Integer DistrictId) {
        this.DistrictId = DistrictId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public Integer getCustomerLevel() {
        return CustomerLevel;
    }

    public void setCustomerLevel(Integer CustomerLevel) {
        this.CustomerLevel = CustomerLevel;
    }

    public Integer getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(Integer CustomerType) {
        this.CustomerType = CustomerType;
    }

    public Boolean getIsEmailActivate() {
        return IsEmailActivate;
    }

    public void setIsEmailActivate(Boolean IsEmailActivate) {
        this.IsEmailActivate = IsEmailActivate;
    }

    public LocalDateTime getEmailActivateTime() {
        return EmailActivateTime;
    }

    public void setEmailActivateTime(LocalDateTime EmailActivateTime) {
        this.EmailActivateTime = EmailActivateTime;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String Memo) {
        this.Memo = Memo;
    }

    public Integer getSalesmanId() {
        return SalesmanId;
    }

    public void setSalesmanId(Integer SalesmanId) {
        this.SalesmanId = SalesmanId;
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

    public LocalDateTime getLastVisitTime() {
        return LastVisitTime;
    }

    public void setLastVisitTime(LocalDateTime LastVisitTime) {
        this.LastVisitTime = LastVisitTime;
    }

    public LocalDateTime getLastLoginTime() {
        return LastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime LastLoginTime) {
        this.LastLoginTime = LastLoginTime;
    }

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public Long getCreateOfficeId() {
        return CreateOfficeId;
    }

    public void setCreateOfficeId(Long CreateOfficeId) {
        this.CreateOfficeId = CreateOfficeId;
    }

    public Long getCreateSalesmanId() {
        return CreateSalesmanId;
    }

    public void setCreateSalesmanId(Long CreateSalesmanId) {
        this.CreateSalesmanId = CreateSalesmanId;
    }

    public Integer getScopeType() {
        return ScopeType;
    }

    public void setScopeType(Integer ScopeType) {
        this.ScopeType = ScopeType;
    }

    public Integer getStoreType() {
        return StoreType;
    }

    public void setStoreType(Integer StoreType) {
        this.StoreType = StoreType;
    }

    public Integer getSourceId() {
        return SourceId;
    }

    public void setSourceId(Integer SourceId) {
        this.SourceId = SourceId;
    }

    public Double getDiscountRate() {
        return DiscountRate;
    }

    public void setDiscountRate(Double DiscountRate) {
        this.DiscountRate = DiscountRate;
    }

    public String getDeviceToken() {
        return DeviceToken;
    }

    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    public Integer getDeviceTypeId() {
        return DeviceTypeId;
    }

    public void setDeviceTypeId(Integer DeviceTypeId) {
        this.DeviceTypeId = DeviceTypeId;
    }

    public Integer getCustomer() {
        return Customer;
    }

    public void setCustomer(Integer Customer) {
        this.Customer = Customer;
    }

    public Integer getVipNum() {
        return VipNum;
    }

    public void setVipNum(Integer VipNum) {
        this.VipNum = VipNum;
    }

    public Integer getCompanyId() {
        return CompanyId;
    }

    public void setCompanyId(Integer CompanyId) {
        this.CompanyId = CompanyId;
    }

    public Boolean getIsPurchaseDirectSku() {
        return IsPurchaseDirectSku;
    }

    public void setIsPurchaseDirectSku(Boolean IsPurchaseDirectSku) {
        this.IsPurchaseDirectSku = IsPurchaseDirectSku;
    }

    @Override
    public String toString() {
        return "Customer{" +
        "CustomerId=" + CustomerId +
        ", CustomerCode=" + CustomerCode +
        ", UserName=" + UserName +
        ", Password=" + Password +
        ", RealName=" + RealName +
        ", ProvinceId=" + ProvinceId +
        ", CityId=" + CityId +
        ", DistrictId=" + DistrictId +
        ", Address=" + Address +
        ", Tel=" + Tel +
        ", Mobile=" + Mobile +
        ", QQ=" + QQ +
        ", Email=" + Email +
        ", StoreName=" + StoreName +
        ", CustomerLevel=" + CustomerLevel +
        ", CustomerType=" + CustomerType +
        ", IsEmailActivate=" + IsEmailActivate +
        ", EmailActivateTime=" + EmailActivateTime +
        ", OfficeId=" + OfficeId +
        ", Status=" + Status +
        ", Memo=" + Memo +
        ", SalesmanId=" + SalesmanId +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        ", LastVisitTime=" + LastVisitTime +
        ", LastLoginTime=" + LastLoginTime +
        ", UpdateName=" + UpdateName +
        ", Valid=" + Valid +
        ", CreateOfficeId=" + CreateOfficeId +
        ", CreateSalesmanId=" + CreateSalesmanId +
        ", ScopeType=" + ScopeType +
        ", StoreType=" + StoreType +
        ", SourceId=" + SourceId +
        ", DiscountRate=" + DiscountRate +
        ", DeviceToken=" + DeviceToken +
        ", DeviceTypeId=" + DeviceTypeId +
        ", Customer=" + Customer +
        ", VipNum=" + VipNum +
        ", CompanyId=" + CompanyId +
        ", IsPurchaseDirectSku=" + IsPurchaseDirectSku +
        "}";
    }
}
