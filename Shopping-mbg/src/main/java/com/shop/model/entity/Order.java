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
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer OrderId;

    /**
     * 订单编码
     */
    private String OrderNo;

    /**
     * 客户Id
     */
    private Integer CustomerId;

    private String ContactName;

    private Integer ProvinceId;

    private Integer CityId;

    private Integer DistrictId;

    private String ProvinceName;

    private String CityName;

    private String DistrictName;

    private String Address;

    private String Mobile;

    private String Tel;

    private String Postcode;

    /**
     * 商品金额总计=商品金额小计总和
     */
    private Double TotalMoney;

    /**
     * 运费
     */
    private Double Freight;

    /**
     * 优惠金额
     */
    private Double DiscountMoney;

    /**
     * 订单金额=商品金额总计+运费-优惠金额
     */
    private Double OrderMoney;

    /**
     * 支付类型（1-支付宝 2-银行转帐）
     */
    private Integer PaymentType;

    /**
     * 发票Title
     */
    private String InvoiceTitle;

    /**
     * 客户留言
     */
    private String CustomerRemark;

    /**
     * 支付时间
     */
    private LocalDateTime PaymentTime;

    /**
     * 签收时间
     */
    private LocalDateTime SignTime;

    /**
     * 支付单号（当 PaymentType=2 时有意义）
     */
    private String PaymentNo;

    /**
     * 全部、-100   【存储过程里查询的时候使用】	1 待付款、	2 待发货、	3 待收货、	4 交易成功、	-1 交易关闭
     */
    private Integer Status;

    /**
     * 备注
     */
    private String Memo;

    /**
     * 订单是否有效
     */
    private Boolean IsValid;

    private Integer OrderType;

    /**
     * 支付状态（当 OrderSort=2 时有意义）：1-线下支付，已提交汇款信息，等待审核   2-已付款，默认为0
     */
    private Integer PayStatus;

    private Integer SalesmanId;

    private Integer SourceId;

    private Integer OfficeId;

    /**
     * 下单时间
     */
    private LocalDateTime CreateTime;

    private LocalDateTime UpdateTime;

    /**
     * 是否自动确认收货
     */
    private Boolean IsAutoSign;

    private String UpdateName;

    private Long CreateOfficeId;

    private Long CreateSalesmanId;

    /**
     * 是否预售订单
     */
    private Boolean IsPresale;

    private Long PayOfficeId;

    private Long PaySalesmanId;

    /**
     * 1是微信app支付，2是扫码支付
     */
    private Integer WxPayType;

    private Long WarehouseId;

    private Long CreateWarehouseId;

    /**
     * 购买时的客户类型
     */
    private Integer BuyingCustomerType;

    private Boolean IsDaigou;

    private String DeliveryQrcode;


    public Integer getOrderId() {
        return OrderId;
    }

    public void setOrderId(Integer OrderId) {
        this.OrderId = OrderId;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
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

    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public String getDistrictName() {
        return DistrictName;
    }

    public void setDistrictName(String DistrictName) {
        this.DistrictName = DistrictName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    public Double getTotalMoney() {
        return TotalMoney;
    }

    public void setTotalMoney(Double TotalMoney) {
        this.TotalMoney = TotalMoney;
    }

    public Double getFreight() {
        return Freight;
    }

    public void setFreight(Double Freight) {
        this.Freight = Freight;
    }

    public Double getDiscountMoney() {
        return DiscountMoney;
    }

    public void setDiscountMoney(Double DiscountMoney) {
        this.DiscountMoney = DiscountMoney;
    }

    public Double getOrderMoney() {
        return OrderMoney;
    }

    public void setOrderMoney(Double OrderMoney) {
        this.OrderMoney = OrderMoney;
    }

    public Integer getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(Integer PaymentType) {
        this.PaymentType = PaymentType;
    }

    public String getInvoiceTitle() {
        return InvoiceTitle;
    }

    public void setInvoiceTitle(String InvoiceTitle) {
        this.InvoiceTitle = InvoiceTitle;
    }

    public String getCustomerRemark() {
        return CustomerRemark;
    }

    public void setCustomerRemark(String CustomerRemark) {
        this.CustomerRemark = CustomerRemark;
    }

    public LocalDateTime getPaymentTime() {
        return PaymentTime;
    }

    public void setPaymentTime(LocalDateTime PaymentTime) {
        this.PaymentTime = PaymentTime;
    }

    public LocalDateTime getSignTime() {
        return SignTime;
    }

    public void setSignTime(LocalDateTime SignTime) {
        this.SignTime = SignTime;
    }

    public String getPaymentNo() {
        return PaymentNo;
    }

    public void setPaymentNo(String PaymentNo) {
        this.PaymentNo = PaymentNo;
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

    public Boolean getIsValid() {
        return IsValid;
    }

    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    public Integer getOrderType() {
        return OrderType;
    }

    public void setOrderType(Integer OrderType) {
        this.OrderType = OrderType;
    }

    public Integer getPayStatus() {
        return PayStatus;
    }

    public void setPayStatus(Integer PayStatus) {
        this.PayStatus = PayStatus;
    }

    public Integer getSalesmanId() {
        return SalesmanId;
    }

    public void setSalesmanId(Integer SalesmanId) {
        this.SalesmanId = SalesmanId;
    }

    public Integer getSourceId() {
        return SourceId;
    }

    public void setSourceId(Integer SourceId) {
        this.SourceId = SourceId;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
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

    public Boolean getIsAutoSign() {
        return IsAutoSign;
    }

    public void setIsAutoSign(Boolean IsAutoSign) {
        this.IsAutoSign = IsAutoSign;
    }

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
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

    public Boolean getIsPresale() {
        return IsPresale;
    }

    public void setIsPresale(Boolean IsPresale) {
        this.IsPresale = IsPresale;
    }

    public Long getPayOfficeId() {
        return PayOfficeId;
    }

    public void setPayOfficeId(Long PayOfficeId) {
        this.PayOfficeId = PayOfficeId;
    }

    public Long getPaySalesmanId() {
        return PaySalesmanId;
    }

    public void setPaySalesmanId(Long PaySalesmanId) {
        this.PaySalesmanId = PaySalesmanId;
    }

    public Integer getWxPayType() {
        return WxPayType;
    }

    public void setWxPayType(Integer WxPayType) {
        this.WxPayType = WxPayType;
    }

    public Long getWarehouseId() {
        return WarehouseId;
    }

    public void setWarehouseId(Long WarehouseId) {
        this.WarehouseId = WarehouseId;
    }

    public Long getCreateWarehouseId() {
        return CreateWarehouseId;
    }

    public void setCreateWarehouseId(Long CreateWarehouseId) {
        this.CreateWarehouseId = CreateWarehouseId;
    }

    public Integer getBuyingCustomerType() {
        return BuyingCustomerType;
    }

    public void setBuyingCustomerType(Integer BuyingCustomerType) {
        this.BuyingCustomerType = BuyingCustomerType;
    }

    public Boolean getIsDaigou() {
        return IsDaigou;
    }

    public void setIsDaigou(Boolean IsDaigou) {
        this.IsDaigou = IsDaigou;
    }

    public String getDeliveryQrcode() {
        return DeliveryQrcode;
    }

    public void setDeliveryQrcode(String DeliveryQrcode) {
        this.DeliveryQrcode = DeliveryQrcode;
    }

    @Override
    public String toString() {
        return "Order{" +
        "OrderId=" + OrderId +
        ", OrderNo=" + OrderNo +
        ", CustomerId=" + CustomerId +
        ", ContactName=" + ContactName +
        ", ProvinceId=" + ProvinceId +
        ", CityId=" + CityId +
        ", DistrictId=" + DistrictId +
        ", ProvinceName=" + ProvinceName +
        ", CityName=" + CityName +
        ", DistrictName=" + DistrictName +
        ", Address=" + Address +
        ", Mobile=" + Mobile +
        ", Tel=" + Tel +
        ", Postcode=" + Postcode +
        ", TotalMoney=" + TotalMoney +
        ", Freight=" + Freight +
        ", DiscountMoney=" + DiscountMoney +
        ", OrderMoney=" + OrderMoney +
        ", PaymentType=" + PaymentType +
        ", InvoiceTitle=" + InvoiceTitle +
        ", CustomerRemark=" + CustomerRemark +
        ", PaymentTime=" + PaymentTime +
        ", SignTime=" + SignTime +
        ", PaymentNo=" + PaymentNo +
        ", Status=" + Status +
        ", Memo=" + Memo +
        ", IsValid=" + IsValid +
        ", OrderType=" + OrderType +
        ", PayStatus=" + PayStatus +
        ", SalesmanId=" + SalesmanId +
        ", SourceId=" + SourceId +
        ", OfficeId=" + OfficeId +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        ", IsAutoSign=" + IsAutoSign +
        ", UpdateName=" + UpdateName +
        ", CreateOfficeId=" + CreateOfficeId +
        ", CreateSalesmanId=" + CreateSalesmanId +
        ", IsPresale=" + IsPresale +
        ", PayOfficeId=" + PayOfficeId +
        ", PaySalesmanId=" + PaySalesmanId +
        ", WxPayType=" + WxPayType +
        ", WarehouseId=" + WarehouseId +
        ", CreateWarehouseId=" + CreateWarehouseId +
        ", BuyingCustomerType=" + BuyingCustomerType +
        ", IsDaigou=" + IsDaigou +
        ", DeliveryQrcode=" + DeliveryQrcode +
        "}";
    }
}
