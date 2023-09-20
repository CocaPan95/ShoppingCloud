package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class UserMoneyAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 记录Id
     */
      @TableId(value = "Id", type = IdType.AUTO)
    private Long Id;

    /**
     * 类型：1为充值审核，2返现审核
     */
    private Integer Type;

    /**
     * 客户Id
     */
    private Long CustomerId;

    /**
     * 操作月份，按yyyy-MM-dd格式存储
     */
    private LocalDate OpData;

    /**
     * 发生金额，即为导入金额
     */
    private Double Amount;

    /**
     * 备注说明
     */
    private String Remark;

    /**
     * 状态：10为待审核，20为审核通过，30为审核失败
     */
    private Integer Status;

    /**
     * 审核失败原因
     */
    private String ErrorMessage;

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

    @Override
    public String toString() {
        return "UserMoneyAudit{" +
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
        "}";
    }
}
