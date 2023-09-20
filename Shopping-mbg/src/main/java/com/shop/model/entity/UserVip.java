package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 渠道表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class UserVip implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 销售渠道表主键Id
     */
      private Long UserVipId;

    /**
     * 渠道名称
     */
    private String VipNumName;

    /**
     * 颜色
     */
    private String ClassBtnName;

    /**
     * 是否有效；1：有效，0：无效
     */
    private Boolean Valid;

    /**
     * 创建时间
     */
    private LocalDateTime AddTime;


    public Long getUserVipId() {
        return UserVipId;
    }

    public void setUserVipId(Long UserVipId) {
        this.UserVipId = UserVipId;
    }

    public String getVipNumName() {
        return VipNumName;
    }

    public void setVipNumName(String VipNumName) {
        this.VipNumName = VipNumName;
    }

    public String getClassBtnName() {
        return ClassBtnName;
    }

    public void setClassBtnName(String ClassBtnName) {
        this.ClassBtnName = ClassBtnName;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public LocalDateTime getAddTime() {
        return AddTime;
    }

    public void setAddTime(LocalDateTime AddTime) {
        this.AddTime = AddTime;
    }

    @Override
    public String toString() {
        return "UserVip{" +
        "UserVipId=" + UserVipId +
        ", VipNumName=" + VipNumName +
        ", ClassBtnName=" + ClassBtnName +
        ", Valid=" + Valid +
        ", AddTime=" + AddTime +
        "}";
    }
}
