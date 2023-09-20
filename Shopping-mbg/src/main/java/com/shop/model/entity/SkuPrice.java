package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 渠道价格表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class SkuPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 渠道价格表主键Id
     */
      @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * SkuId
     */
    private Long SkuId;

    /**
     * 渠道
     */
    private Integer VipNum;

    /**
     * 销售价格
     */
    private Double SalePrice;

    /**
     * 创建时间
     */
    private LocalDateTime AddTime;

    /**
     * 更新时间
     */
    private LocalDateTime EditTime;

    /**
     * 是否有效；1：有效，0：无效
     */
    private Boolean Valid;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Long getSkuId() {
        return SkuId;
    }

    public void setSkuId(Long SkuId) {
        this.SkuId = SkuId;
    }

    public Integer getVipNum() {
        return VipNum;
    }

    public void setVipNum(Integer VipNum) {
        this.VipNum = VipNum;
    }

    public Double getSalePrice() {
        return SalePrice;
    }

    public void setSalePrice(Double SalePrice) {
        this.SalePrice = SalePrice;
    }

    public LocalDateTime getAddTime() {
        return AddTime;
    }

    public void setAddTime(LocalDateTime AddTime) {
        this.AddTime = AddTime;
    }

    public LocalDateTime getEditTime() {
        return EditTime;
    }

    public void setEditTime(LocalDateTime EditTime) {
        this.EditTime = EditTime;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    @Override
    public String toString() {
        return "SkuPrice{" +
        "Id=" + Id +
        ", SkuId=" + SkuId +
        ", VipNum=" + VipNum +
        ", SalePrice=" + SalePrice +
        ", AddTime=" + AddTime +
        ", EditTime=" + EditTime +
        ", Valid=" + Valid +
        "}";
    }
}
