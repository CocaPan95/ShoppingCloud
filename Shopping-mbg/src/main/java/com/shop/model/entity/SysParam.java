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
public class SysParam implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "SysParamId", type = IdType.AUTO)
    private Long SysParamId;

    private String ParamName;

    private String ParamCode;

    /**
     * 参数项paramid是否必须设置值
     */
    private Boolean MustSetId;

    /**
     * 是否为int值，true：paramid必须为int类型值，否则随意
     */
    private Boolean IsIntId;

    private String Remark;

    private Boolean Valid;

    private LocalDateTime CreateTime;

    private Long CreatorId;

    private LocalDateTime LastModifyTime;

    private Long LastModifierId;


    public Long getSysParamId() {
        return SysParamId;
    }

    public void setSysParamId(Long SysParamId) {
        this.SysParamId = SysParamId;
    }

    public String getParamName() {
        return ParamName;
    }

    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    public String getParamCode() {
        return ParamCode;
    }

    public void setParamCode(String ParamCode) {
        this.ParamCode = ParamCode;
    }

    public Boolean getMustSetId() {
        return MustSetId;
    }

    public void setMustSetId(Boolean MustSetId) {
        this.MustSetId = MustSetId;
    }

    public Boolean getIsIntId() {
        return IsIntId;
    }

    public void setIsIntId(Boolean IsIntId) {
        this.IsIntId = IsIntId;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
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

    public Long getCreatorId() {
        return CreatorId;
    }

    public void setCreatorId(Long CreatorId) {
        this.CreatorId = CreatorId;
    }

    public LocalDateTime getLastModifyTime() {
        return LastModifyTime;
    }

    public void setLastModifyTime(LocalDateTime LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    public Long getLastModifierId() {
        return LastModifierId;
    }

    public void setLastModifierId(Long LastModifierId) {
        this.LastModifierId = LastModifierId;
    }

    @Override
    public String toString() {
        return "SysParam{" +
        "SysParamId=" + SysParamId +
        ", ParamName=" + ParamName +
        ", ParamCode=" + ParamCode +
        ", MustSetId=" + MustSetId +
        ", IsIntId=" + IsIntId +
        ", Remark=" + Remark +
        ", Valid=" + Valid +
        ", CreateTime=" + CreateTime +
        ", CreatorId=" + CreatorId +
        ", LastModifyTime=" + LastModifyTime +
        ", LastModifierId=" + LastModifierId +
        "}";
    }
}
