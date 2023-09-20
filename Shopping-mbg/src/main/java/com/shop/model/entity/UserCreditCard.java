package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户信用卡
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class UserCreditCard implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 信用卡主键ID
     */
      @TableId(value = "CardId", type = IdType.AUTO)
    private Long CardId;

    /**
     * 信用卡No
     */
    private String CardNo;

    /**
     * 信用额度
     */
    private Double CardMoney;

    /**
     * 开卡时间
     */
    private LocalDate Btime;

    /**
     * 截止时间
     */
    private LocalDate Etime;

    /**
     * 是否有效
     */
    private Boolean Valid;

    /**
     * 商家Id
     */
    private Long CustomerId;

    /**
     * 备注说明
     */
    private String Remarks;

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


    public Long getCardId() {
        return CardId;
    }

    public void setCardId(Long CardId) {
        this.CardId = CardId;
    }

    public String getCardNo() {
        return CardNo;
    }

    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    public Double getCardMoney() {
        return CardMoney;
    }

    public void setCardMoney(Double CardMoney) {
        this.CardMoney = CardMoney;
    }

    public LocalDate getBtime() {
        return Btime;
    }

    public void setBtime(LocalDate Btime) {
        this.Btime = Btime;
    }

    public LocalDate getEtime() {
        return Etime;
    }

    public void setEtime(LocalDate Etime) {
        this.Etime = Etime;
    }

    public Boolean getValid() {
        return Valid;
    }

    public void setValid(Boolean Valid) {
        this.Valid = Valid;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
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

    @Override
    public String toString() {
        return "UserCreditCard{" +
        "CardId=" + CardId +
        ", CardNo=" + CardNo +
        ", CardMoney=" + CardMoney +
        ", Btime=" + Btime +
        ", Etime=" + Etime +
        ", Valid=" + Valid +
        ", CustomerId=" + CustomerId +
        ", Remarks=" + Remarks +
        ", CREATED_BY=" + CREATED_BY +
        ", CREATED_TIME=" + CREATED_TIME +
        ", UPDATED_BY=" + UPDATED_BY +
        ", UPDATED_TIME=" + UPDATED_TIME +
        "}";
    }
}
