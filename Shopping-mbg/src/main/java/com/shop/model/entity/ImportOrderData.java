package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 导入订单数据
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class ImportOrderData implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键标识
     */
      private Long Id;

    /**
     * 订单文件标识
     */
    private Long OrderFileId;

    /**
     * 客户编码
     */
    private String CustomerCode;

    /**
     * 店铺名称
     */
    private String StoreName;

    /**
     * 产品名称
     */
    private String ProductName;

    /**
     * 产品规格
     */
    private String ProductSpec;

    /**
     * 产品图片
     */
    private String ProductUrl;

    /**
     * 是否预售
     */
    private Boolean IsPresale;

    /**
     * 货号
     */
    private String SKU;

    /**
     * 箱数
     */
    private Integer Number;

    /**
     * 是否验证通过
     */
    private Boolean Passed;

    /**
     * 错误原因;验证订单生成都可使用
     */
    private String ErrorReason;

    /**
     * 订单提交时间
     */
    private LocalDateTime SubmitTime;

    /**
     * 下单状态;（无、成功、失败）
     */
    private Integer OrderStatus;

    /**
     * 订单编号
     */
    private String OrderNo;

    /**
     * 是否删除
     */
    private Boolean IsDeleted;

    /**
     * 乐观锁
     */
    private Integer Revision;

    /**
     * 创建人
     */
    private String CreatedBy;

    /**
     * 创建时间
     */
    private LocalDateTime CreatedTime;

    /**
     * 更新人
     */
    private String UpdatedBy;

    /**
     * 更新时间
     */
    private LocalDateTime UpdatedTime;

    /**
     * Sku标识
     */
    private Integer SkuId;

    /**
     * 单位
     */
    private String Unit;

    /**
     * 多少一箱
     */
    private Integer SpecText;

    /**
     * 订单标识
     */
    private Long OrderId;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getOrderFileId() {
        return OrderFileId;
    }

    public void setOrderFileId(Long OrderFileId) {
        this.OrderFileId = OrderFileId;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String CustomerCode) {
        this.CustomerCode = CustomerCode;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductSpec() {
        return ProductSpec;
    }

    public void setProductSpec(String ProductSpec) {
        this.ProductSpec = ProductSpec;
    }

    public String getProductUrl() {
        return ProductUrl;
    }

    public void setProductUrl(String ProductUrl) {
        this.ProductUrl = ProductUrl;
    }

    public Boolean getIsPresale() {
        return IsPresale;
    }

    public void setIsPresale(Boolean IsPresale) {
        this.IsPresale = IsPresale;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public Integer getNumber() {
        return Number;
    }

    public void setNumber(Integer Number) {
        this.Number = Number;
    }

    public Boolean getPassed() {
        return Passed;
    }

    public void setPassed(Boolean Passed) {
        this.Passed = Passed;
    }

    public String getErrorReason() {
        return ErrorReason;
    }

    public void setErrorReason(String ErrorReason) {
        this.ErrorReason = ErrorReason;
    }

    public LocalDateTime getSubmitTime() {
        return SubmitTime;
    }

    public void setSubmitTime(LocalDateTime SubmitTime) {
        this.SubmitTime = SubmitTime;
    }

    public Integer getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(Integer OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

    public Integer getRevision() {
        return Revision;
    }

    public void setRevision(Integer Revision) {
        this.Revision = Revision;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public LocalDateTime getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(LocalDateTime CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public String getUpdatedBy() {
        return UpdatedBy;
    }

    public void setUpdatedBy(String UpdatedBy) {
        this.UpdatedBy = UpdatedBy;
    }

    public LocalDateTime getUpdatedTime() {
        return UpdatedTime;
    }

    public void setUpdatedTime(LocalDateTime UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public Integer getSpecText() {
        return SpecText;
    }

    public void setSpecText(Integer SpecText) {
        this.SpecText = SpecText;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long OrderId) {
        this.OrderId = OrderId;
    }

    @Override
    public String toString() {
        return "ImportOrderData{" +
        "Id=" + Id +
        ", OrderFileId=" + OrderFileId +
        ", CustomerCode=" + CustomerCode +
        ", StoreName=" + StoreName +
        ", ProductName=" + ProductName +
        ", ProductSpec=" + ProductSpec +
        ", ProductUrl=" + ProductUrl +
        ", IsPresale=" + IsPresale +
        ", SKU=" + SKU +
        ", Number=" + Number +
        ", Passed=" + Passed +
        ", ErrorReason=" + ErrorReason +
        ", SubmitTime=" + SubmitTime +
        ", OrderStatus=" + OrderStatus +
        ", OrderNo=" + OrderNo +
        ", IsDeleted=" + IsDeleted +
        ", Revision=" + Revision +
        ", CreatedBy=" + CreatedBy +
        ", CreatedTime=" + CreatedTime +
        ", UpdatedBy=" + UpdatedBy +
        ", UpdatedTime=" + UpdatedTime +
        ", SkuId=" + SkuId +
        ", Unit=" + Unit +
        ", SpecText=" + SpecText +
        ", OrderId=" + OrderId +
        "}";
    }
}
