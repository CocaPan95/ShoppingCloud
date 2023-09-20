package com.shop.model.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class V_UserPositionRection implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long UserId;

    private Integer OfficeId;

    private Integer AreaId;

    private Boolean Valid;

    private Boolean Enable;

    private Integer PositionId;


    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public Integer getOfficeId() {
        return OfficeId;
    }

    public void setOfficeId(Integer OfficeId) {
        this.OfficeId = OfficeId;
    }

    public Integer getAreaId() {
        return AreaId;
    }

    public void setAreaId(Integer AreaId) {
        this.AreaId = AreaId;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public Boolean getEnable() {
        return Enable;
    }

    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    public Integer getPositionId() {
        return PositionId;
    }

    public void setPositionId(Integer PositionId) {
        this.PositionId = PositionId;
    }

    @Override
    public String toString() {
        return "V_UserPositionRection{" +
        "UserId=" + UserId +
        ", OfficeId=" + OfficeId +
        ", AreaId=" + AreaId +
        ", Valid=" + Valid +
        ", Enable=" + Enable +
        ", PositionId=" + PositionId +
        "}";
    }
}
