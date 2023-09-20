package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 站内消息表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class PushMsg implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 站内消息表主键Id
     */
      @TableId(value = "ID", type = IdType.AUTO)
    private Integer ID;

    /**
     * 用户Id
     */
    private Long CustomerId;

    /**
     * 渠道类型  1进货宝  2我的小店
     */
    private Integer StoreType;

    /**
     * 业务类型  1订单物流  2商品  3账户
     */
    private Integer MsgType;

    /**
     * 业务类型；11：待付款通知，12：支付通知，13：订单发货通知，14：订单签收通知，15：订单取消通知。21：火热预售通知，22：新品上架通知，23：产品到货通知，31：充值信息审核通知，32：充值信息成功通知，33：充值信息拒绝通知，34：充值入账通知，35：返现入账通知，36：退款入账通知
     */
    private Integer BusinessType;

    /**
     * 业务Id OrderId, SkuId, AccountId
     */
    private Integer BusinessId;

    /**
     * 业务值（订单编号）
     */
    private String BusinessValue;

    /**
     * 标题
     */
    private String Title;

    /**
     * 主体信息
     */
    private String Body;

    /**
     * 列表头图
     */
    private String ImgUrl;

    /**
     * App跳转链接地址
     */
    private String AppUrl;

    /**
     * 是否已读；1：已读，0：未读
     */
    private Boolean IsRead;

    /**
     * 是否有效：1：无效，0：有效
     */
    private Boolean IsDelete;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 更新时间
     */
    private LocalDateTime UpdateTime;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Integer getStoreType() {
        return StoreType;
    }

    public void setStoreType(Integer StoreType) {
        this.StoreType = StoreType;
    }

    public Integer getMsgType() {
        return MsgType;
    }

    public void setMsgType(Integer MsgType) {
        this.MsgType = MsgType;
    }

    public Integer getBusinessType() {
        return BusinessType;
    }

    public void setBusinessType(Integer BusinessType) {
        this.BusinessType = BusinessType;
    }

    public Integer getBusinessId() {
        return BusinessId;
    }

    public void setBusinessId(Integer BusinessId) {
        this.BusinessId = BusinessId;
    }

    public String getBusinessValue() {
        return BusinessValue;
    }

    public void setBusinessValue(String BusinessValue) {
        this.BusinessValue = BusinessValue;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String Body) {
        this.Body = Body;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public String getAppUrl() {
        return AppUrl;
    }

    public void setAppUrl(String AppUrl) {
        this.AppUrl = AppUrl;
    }

    public Boolean getIsRead() {
        return IsRead;
    }

    public void setIsRead(Boolean IsRead) {
        this.IsRead = IsRead;
    }

    public Boolean getIsDelete() {
        return IsDelete;
    }

    public void setIsDelete(Boolean IsDelete) {
        this.IsDelete = IsDelete;
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

    @Override
    public String toString() {
        return "PushMsg{" +
        "ID=" + ID +
        ", CustomerId=" + CustomerId +
        ", StoreType=" + StoreType +
        ", MsgType=" + MsgType +
        ", BusinessType=" + BusinessType +
        ", BusinessId=" + BusinessId +
        ", BusinessValue=" + BusinessValue +
        ", Title=" + Title +
        ", Body=" + Body +
        ", ImgUrl=" + ImgUrl +
        ", AppUrl=" + AppUrl +
        ", IsRead=" + IsRead +
        ", IsDelete=" + IsDelete +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
