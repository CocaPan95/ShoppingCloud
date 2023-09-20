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
public class ActivityCustomerQuota implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long Id;

    private Long ActivityId;

    private Long CustomerId;

    private Integer SkuId;

    private Integer FirstOrderId;

    private Integer MaxFirstOrderQty;

    private Integer MaxTotalPurchaseQty;

    private Integer TotalOrderedQty;

    private Integer TotalOutboundQty;

    private Long Version;

    private String CreateBy;

    private LocalDateTime CreateTime;

    private String UpdateBy;

    private LocalDateTime UpdateTime;

    private Long Id;

    private Long ActivityId;

    private Long CustomerId;

    private Integer SkuId;

    private Integer FirstOrderId;

    private Integer FirstOrderQty;

    private Integer MaxFirstOrderQty;

    private Integer MaxTotalPurchaseQty;

    private Integer TotalOrderedQty;

    private Integer TotalOutboundQty;

    private Long Version;

    private String CreateBy;

    private LocalDateTime CreateTime;

    private String UpdateBy;

    private LocalDateTime UpdateTime;


    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getActivityId() {
        return ActivityId;
    }

    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getFirstOrderId() {
        return FirstOrderId;
    }

    public void setFirstOrderId(Integer FirstOrderId) {
        this.FirstOrderId = FirstOrderId;
    }

    public Integer getMaxFirstOrderQty() {
        return MaxFirstOrderQty;
    }

    public void setMaxFirstOrderQty(Integer MaxFirstOrderQty) {
        this.MaxFirstOrderQty = MaxFirstOrderQty;
    }

    public Integer getMaxTotalPurchaseQty() {
        return MaxTotalPurchaseQty;
    }

    public void setMaxTotalPurchaseQty(Integer MaxTotalPurchaseQty) {
        this.MaxTotalPurchaseQty = MaxTotalPurchaseQty;
    }

    public Integer getTotalOrderedQty() {
        return TotalOrderedQty;
    }

    public void setTotalOrderedQty(Integer TotalOrderedQty) {
        this.TotalOrderedQty = TotalOrderedQty;
    }

    public Integer getTotalOutboundQty() {
        return TotalOutboundQty;
    }

    public void setTotalOutboundQty(Integer TotalOutboundQty) {
        this.TotalOutboundQty = TotalOutboundQty;
    }

    public Long getVersion() {
        return Version;
    }

    public void setVersion(Long Version) {
        this.Version = Version;
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

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public Long getActivityId() {
        return ActivityId;
    }

    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getFirstOrderId() {
        return FirstOrderId;
    }

    public void setFirstOrderId(Integer FirstOrderId) {
        this.FirstOrderId = FirstOrderId;
    }

    public Integer getFirstOrderQty() {
        return FirstOrderQty;
    }

    public void setFirstOrderQty(Integer FirstOrderQty) {
        this.FirstOrderQty = FirstOrderQty;
    }

    public Integer getMaxFirstOrderQty() {
        return MaxFirstOrderQty;
    }

    public void setMaxFirstOrderQty(Integer MaxFirstOrderQty) {
        this.MaxFirstOrderQty = MaxFirstOrderQty;
    }

    public Integer getMaxTotalPurchaseQty() {
        return MaxTotalPurchaseQty;
    }

    public void setMaxTotalPurchaseQty(Integer MaxTotalPurchaseQty) {
        this.MaxTotalPurchaseQty = MaxTotalPurchaseQty;
    }

    public Integer getTotalOrderedQty() {
        return TotalOrderedQty;
    }

    public void setTotalOrderedQty(Integer TotalOrderedQty) {
        this.TotalOrderedQty = TotalOrderedQty;
    }

    public Integer getTotalOutboundQty() {
        return TotalOutboundQty;
    }

    public void setTotalOutboundQty(Integer TotalOutboundQty) {
        this.TotalOutboundQty = TotalOutboundQty;
    }

    public Long getVersion() {
        return Version;
    }

    public void setVersion(Long Version) {
        this.Version = Version;
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

    @Override
    public String toString() {
        return "ActivityCustomerQuota{" +
        "Id=" + Id +
        ", ActivityId=" + ActivityId +
        ", CustomerId=" + CustomerId +
        ", SkuId=" + SkuId +
        ", FirstOrderId=" + FirstOrderId +
        ", MaxFirstOrderQty=" + MaxFirstOrderQty +
        ", MaxTotalPurchaseQty=" + MaxTotalPurchaseQty +
        ", TotalOrderedQty=" + TotalOrderedQty +
        ", TotalOutboundQty=" + TotalOutboundQty +
        ", Version=" + Version +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        ", UpdateBy=" + UpdateBy +
        ", UpdateTime=" + UpdateTime +
        ", Id=" + Id +
        ", ActivityId=" + ActivityId +
        ", CustomerId=" + CustomerId +
        ", SkuId=" + SkuId +
        ", FirstOrderId=" + FirstOrderId +
        ", FirstOrderQty=" + FirstOrderQty +
        ", MaxFirstOrderQty=" + MaxFirstOrderQty +
        ", MaxTotalPurchaseQty=" + MaxTotalPurchaseQty +
        ", TotalOrderedQty=" + TotalOrderedQty +
        ", TotalOutboundQty=" + TotalOutboundQty +
        ", Version=" + Version +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        ", UpdateBy=" + UpdateBy +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
