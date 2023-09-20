package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 预售表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class Presale_Retired implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 预售表主键Id
     */
      @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * SkuId
     */
    private Integer SkuId;

    /**
     * 预售开始时间
     */
    private LocalDateTime BeginTime;

    /**
     * 预售截止时间
     */
    private LocalDateTime EndTime;

    /**
     * 预售简介
     */
    private String PresaleDesc;

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

    public Integer getSkuId() {
        return SkuId;
    }

    public void setSkuId(Integer SkuId) {
        this.SkuId = SkuId;
    }

    public LocalDateTime getBeginTime() {
        return BeginTime;
    }

    public void setBeginTime(LocalDateTime BeginTime) {
        this.BeginTime = BeginTime;
    }

    public LocalDateTime getEndTime() {
        return EndTime;
    }

    public void setEndTime(LocalDateTime EndTime) {
        this.EndTime = EndTime;
    }

    public String getPresaleDesc() {
        return PresaleDesc;
    }

    public void setPresaleDesc(String PresaleDesc) {
        this.PresaleDesc = PresaleDesc;
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
        return "Presale_Retired{" +
        "Id=" + Id +
        ", SkuId=" + SkuId +
        ", BeginTime=" + BeginTime +
        ", EndTime=" + EndTime +
        ", PresaleDesc=" + PresaleDesc +
        ", AddTime=" + AddTime +
        ", EditTime=" + EditTime +
        ", Valid=" + Valid +
        "}";
    }
}
