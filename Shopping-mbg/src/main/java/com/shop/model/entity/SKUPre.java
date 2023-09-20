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
public class SKUPre implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer Id;

    private Integer SkuId;

    private Boolean IsAudited;

    private Boolean IsSecondEdit;


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

    public Boolean getIsAudited() {
        return IsAudited;
    }

    public void setIsAudited(Boolean IsAudited) {
        this.IsAudited = IsAudited;
    }

    public Boolean getIsSecondEdit() {
        return IsSecondEdit;
    }

    public void setIsSecondEdit(Boolean IsSecondEdit) {
        this.IsSecondEdit = IsSecondEdit;
    }

    @Override
    public String toString() {
        return "SKUPre{" +
        "Id=" + Id +
        ", SkuId=" + SkuId +
        ", IsAudited=" + IsAudited +
        ", IsSecondEdit=" + IsSecondEdit +
        "}";
    }
}
