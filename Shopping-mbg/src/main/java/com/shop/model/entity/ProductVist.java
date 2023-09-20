package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 客户产品浏览记录表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class ProductVist implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 客户浏览产品记录表主键Id
     */
      @TableId(value = "PvistId", type = IdType.AUTO)
    private Long PvistId;

    /**
     * 客户Id
     */
    private Long UserId;

    /**
     * 暂不清楚用途 driveSn
     */
    private String Sid;

    /**
     * SkuId
     */
    private Long SkuId;

    /**
     * 浏览时间
     */
    private LocalDateTime VisitTime;

    /**
     * 最后浏览时间
     */
    private LocalDateTime VisitLastTime;

    /**
     * 浏览次数
     */
    private Long VisitCount;


    public Long getPvistId() {
        return PvistId;
    }

    public void setPvistId(Long PvistId) {
        this.PvistId = PvistId;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String Sid) {
        this.Sid = Sid;
    }

    public Long getSkuId() {
        return SkuId;
    }

    public void setSkuId(Long SkuId) {
        this.SkuId = SkuId;
    }

    public LocalDateTime getVisitTime() {
        return VisitTime;
    }

    public void setVisitTime(LocalDateTime VisitTime) {
        this.VisitTime = VisitTime;
    }

    public LocalDateTime getVisitLastTime() {
        return VisitLastTime;
    }

    public void setVisitLastTime(LocalDateTime VisitLastTime) {
        this.VisitLastTime = VisitLastTime;
    }

    public Long getVisitCount() {
        return VisitCount;
    }

    public void setVisitCount(Long VisitCount) {
        this.VisitCount = VisitCount;
    }

    @Override
    public String toString() {
        return "ProductVist{" +
        "PvistId=" + PvistId +
        ", UserId=" + UserId +
        ", Sid=" + Sid +
        ", SkuId=" + SkuId +
        ", VisitTime=" + VisitTime +
        ", VisitLastTime=" + VisitLastTime +
        ", VisitCount=" + VisitCount +
        "}";
    }
}
