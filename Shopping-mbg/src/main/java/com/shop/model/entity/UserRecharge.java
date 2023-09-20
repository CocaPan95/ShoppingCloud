package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户充值记录
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class UserRecharge implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
      @TableId(value = "UserRechargeId", type = IdType.AUTO)
    private Long UserRechargeId;

    /**
     * 商家Id
     */
    private Long CustomerId;

    /**
     * 充值金额
     */
    private Double RechargeMoney;

    /**
     * 充值截图
     */
    private String RechargeImg;

    /**
     * 充值时间
     */
    private LocalDate RechargeDate;

    /**
     * 充值备注说明
     */
    private String UserRemarks;

    private LocalDateTime ExamineDate;

    /**
     * 审核人
     */
    private String ExamineUser;

    /**
     * 审核状态(0=待审核，1=审核通过，2=被拒绝)
     */
    private String Examine;

    /**
     * 审核说明
     */
    private String ExamineDesc;

    /**
     * 创建人
     */
    private String CREATED_BY;

    /**
     * 创建时间
     */
    private LocalDateTime CREATED_TIME;

    /**
     * 更新人
     */
    private String UPDATED_BY;

    /**
     * 更新时间
     */
    private LocalDateTime UPDATED_TIME;

    private String RechargeSmallImg;


    public Long getUserRechargeId() {
        return UserRechargeId;
    }

    public void setUserRechargeId(Long UserRechargeId) {
        this.UserRechargeId = UserRechargeId;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public Double getRechargeMoney() {
        return RechargeMoney;
    }

    public void setRechargeMoney(Double RechargeMoney) {
        this.RechargeMoney = RechargeMoney;
    }

    public String getRechargeImg() {
        return RechargeImg;
    }

    public void setRechargeImg(String RechargeImg) {
        this.RechargeImg = RechargeImg;
    }

    public LocalDate getRechargeDate() {
        return RechargeDate;
    }

    public void setRechargeDate(LocalDate RechargeDate) {
        this.RechargeDate = RechargeDate;
    }

    public String getUserRemarks() {
        return UserRemarks;
    }

    public void setUserRemarks(String UserRemarks) {
        this.UserRemarks = UserRemarks;
    }

    public LocalDateTime getExamineDate() {
        return ExamineDate;
    }

    public void setExamineDate(LocalDateTime ExamineDate) {
        this.ExamineDate = ExamineDate;
    }

    public String getExamineUser() {
        return ExamineUser;
    }

    public void setExamineUser(String ExamineUser) {
        this.ExamineUser = ExamineUser;
    }

    public String getExamine() {
        return Examine;
    }

    public void setExamine(String Examine) {
        this.Examine = Examine;
    }

    public String getExamineDesc() {
        return ExamineDesc;
    }

    public void setExamineDesc(String ExamineDesc) {
        this.ExamineDesc = ExamineDesc;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public LocalDateTime getCREATED_TIME() {
        return CREATED_TIME;
    }

    public void setCREATED_TIME(LocalDateTime CREATED_TIME) {
        this.CREATED_TIME = CREATED_TIME;
    }

    public String getUPDATED_BY() {
        return UPDATED_BY;
    }

    public void setUPDATED_BY(String UPDATED_BY) {
        this.UPDATED_BY = UPDATED_BY;
    }

    public LocalDateTime getUPDATED_TIME() {
        return UPDATED_TIME;
    }

    public void setUPDATED_TIME(LocalDateTime UPDATED_TIME) {
        this.UPDATED_TIME = UPDATED_TIME;
    }

    public String getRechargeSmallImg() {
        return RechargeSmallImg;
    }

    public void setRechargeSmallImg(String RechargeSmallImg) {
        this.RechargeSmallImg = RechargeSmallImg;
    }

    @Override
    public String toString() {
        return "UserRecharge{" +
        "UserRechargeId=" + UserRechargeId +
        ", CustomerId=" + CustomerId +
        ", RechargeMoney=" + RechargeMoney +
        ", RechargeImg=" + RechargeImg +
        ", RechargeDate=" + RechargeDate +
        ", UserRemarks=" + UserRemarks +
        ", ExamineDate=" + ExamineDate +
        ", ExamineUser=" + ExamineUser +
        ", Examine=" + Examine +
        ", ExamineDesc=" + ExamineDesc +
        ", CREATED_BY=" + CREATED_BY +
        ", CREATED_TIME=" + CREATED_TIME +
        ", UPDATED_BY=" + UPDATED_BY +
        ", UPDATED_TIME=" + UPDATED_TIME +
        ", RechargeSmallImg=" + RechargeSmallImg +
        "}";
    }
}
