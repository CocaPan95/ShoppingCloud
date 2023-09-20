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
public class BrandVipNum implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 品牌Id
     */
    private Integer BrandId;

    /**
     * 等级Id
     */
    private Integer VipNum;

    private LocalDateTime CreateTime;

    private String CreateUser;

    private LocalDateTime EditTime;

    private String EditUser;

    /**
     * 1=有效，0=无效
     */
    private Boolean Valid;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getBrandId() {
        return BrandId;
    }

    public void setBrandId(Integer BrandId) {
        this.BrandId = BrandId;
    }

    public Integer getVipNum() {
        return VipNum;
    }

    public void setVipNum(Integer VipNum) {
        this.VipNum = VipNum;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getCreateUser() {
        return CreateUser;
    }

    public void setCreateUser(String CreateUser) {
        this.CreateUser = CreateUser;
    }

    public LocalDateTime getEditTime() {
        return EditTime;
    }

    public void setEditTime(LocalDateTime EditTime) {
        this.EditTime = EditTime;
    }

    public String getEditUser() {
        return EditUser;
    }

    public void setEditUser(String EditUser) {
        this.EditUser = EditUser;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    @Override
    public String toString() {
        return "BrandVipNum{" +
        "Id=" + Id +
        ", BrandId=" + BrandId +
        ", VipNum=" + VipNum +
        ", CreateTime=" + CreateTime +
        ", CreateUser=" + CreateUser +
        ", EditTime=" + EditTime +
        ", EditUser=" + EditUser +
        ", Valid=" + Valid +
        "}";
    }
}
