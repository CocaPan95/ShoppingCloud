package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class UserBalanceChangeType implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 余额增减类型Id
     */
      @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 余额增减大类型，1为加余额，2为减余额
     */
    private Integer OpType;

    /**
     * 余额增减明细类型，10为余额充值，11为余额扣款，20为返现充值，21为返现扣款，30为订单取消充值，
     */
    private Integer Type;

    /**
     * 余额增减类型名称
     */
    private String Name;

    /**
     * 是否启用，1为启用，0为禁用
     */
    private Boolean Enable;

    /**
     * 是否删除，1为已删除，0为未删除
     */
    private Boolean IsDeleted;

    /**
     * 创建人员
     */
    private String CreateBy;

    /**
     * 创建时间
     */
    private LocalDateTime CreateTime;

    /**
     * 更新人员
     */
    private String UpdateBy;

    /**
     * 更新时间
     */
    private LocalDateTime UpdateTime;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getOpType() {
        return OpType;
    }

    public void setOpType(Integer OpType) {
        this.OpType = OpType;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Boolean getEnable() {
        return Enable;
    }

    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public Boolean getIsDeleted() {
        return IsDeleted;
    }

    public void setIsDeleted(Boolean IsDeleted) {
        this.IsDeleted = IsDeleted;
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
        return "UserBalanceChangeType{" +
        "Id=" + Id +
        ", OpType=" + OpType +
        ", Type=" + Type +
        ", Name=" + Name +
        ", Enable=" + Enable +
        ", IsDeleted=" + IsDeleted +
        ", CreateBy=" + CreateBy +
        ", CreateTime=" + CreateTime +
        ", UpdateBy=" + UpdateBy +
        ", UpdateTime=" + UpdateTime +
        "}";
    }
}
