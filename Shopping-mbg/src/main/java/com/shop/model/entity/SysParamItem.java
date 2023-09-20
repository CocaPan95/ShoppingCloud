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
public class SysParamItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long SysParamItemId;

    private Long SysParamId;

    /**
     * sysparam表paramcode,设置主键
     */
    private String ParamCode;

    /**
     * 参数id
     */
    private Long ItemId;

    /**
     * 参数名称
     */
    private String ItemName;

    /**
     * 其它扩展属性
     */
    private String Attr1;

    private String Attr2;

    private String Attr3;

    private String Attr4;

    private String Attr5;

    private Boolean Enable;

    private Boolean Valid;

    private LocalDateTime CreateTime;

    private LocalDateTime LastModifyTime;

    private Long CreatorId;

    private Long LastModifierId;


    public Long getSysParamItemId() {
        return SysParamItemId;
    }

    public void setSysParamItemId(Long SysParamItemId) {
        this.SysParamItemId = SysParamItemId;
    }

    public Long getSysParamId() {
        return SysParamId;
    }

    public void setSysParamId(Long SysParamId) {
        this.SysParamId = SysParamId;
    }

    public String getParamCode() {
        return ParamCode;
    }

    public void setParamCode(String ParamCode) {
        this.ParamCode = ParamCode;
    }

    public Long getItemId() {
        return ItemId;
    }

    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public String getAttr1() {
        return Attr1;
    }

    public void setAttr1(String Attr1) {
        this.Attr1 = Attr1;
    }

    public String getAttr2() {
        return Attr2;
    }

    public void setAttr2(String Attr2) {
        this.Attr2 = Attr2;
    }

    public String getAttr3() {
        return Attr3;
    }

    public void setAttr3(String Attr3) {
        this.Attr3 = Attr3;
    }

    public String getAttr4() {
        return Attr4;
    }

    public void setAttr4(String Attr4) {
        this.Attr4 = Attr4;
    }

    public String getAttr5() {
        return Attr5;
    }

    public void setAttr5(String Attr5) {
        this.Attr5 = Attr5;
    }

    public Boolean getEnable() {
        return Enable;
    }

    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LocalDateTime getLastModifyTime() {
        return LastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    public Long getCreatorId() {
        return CreatorId;
    }

    public void setCreatorId(Long CreatorId) {
        this.CreatorId = CreatorId;
    }

    public Long getLastModifierId() {
        return LastModifierId;
    }

    public void setLastModifierId(Long LastModifierId) {
        this.LastModifierId = LastModifierId;
    }

    @Override
    public String toString() {
        return "SysParamItem{" +
        "SysParamItemId=" + SysParamItemId +
        ", SysParamId=" + SysParamId +
        ", ParamCode=" + ParamCode +
        ", ItemId=" + ItemId +
        ", ItemName=" + ItemName +
        ", Attr1=" + Attr1 +
        ", Attr2=" + Attr2 +
        ", Attr3=" + Attr3 +
        ", Attr4=" + Attr4 +
        ", Attr5=" + Attr5 +
        ", Enable=" + Enable +
        ", Valid=" + Valid +
        ", CreateTime=" + CreateTime +
        ", LastModifyTime=" + LastModifyTime +
        ", CreatorId=" + CreatorId +
        ", LastModifierId=" + LastModifierId +
        "}";
    }
}
