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
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 日志Id
     */
      @TableId(value = "LogId", type = IdType.AUTO)
    private Long LogId;

    /**
     * 操作表的主键id
     */
    private Long Id;

    /**
     * 日志内容
     */
    private String LogContent;

    /**
     * 日志类型,0系统操作日志,1后台登录日志,2订单日志,3终端店日志，4产品日志，5SKU日志，6品牌日志，7地区日志，8办事处日志，9广告日志，10站内公信日志，11站内私信日志，12系统用户，13职位日志,14模块日志,15功能日志 28优惠券 50 SKU渠道映射
     */
    private Integer LogType;

    /**
     * 日志生成时间
     */
    private LocalDateTime CreateTime;

    private String CreateName;


    public Long getLogId() {
        return LogId;
    }

    public void setLogId(Long LogId) {
        this.LogId = LogId;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getLogContent() {
        return LogContent;
    }

    public void setLogContent(String LogContent) {
        this.LogContent = LogContent;
    }

    public Integer getLogType() {
        return LogType;
    }

    public void setLogType(Integer LogType) {
        this.LogType = LogType;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    @Override
    public String toString() {
        return "Log{" +
        "LogId=" + LogId +
        ", Id=" + Id +
        ", LogContent=" + LogContent +
        ", LogType=" + LogType +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        "}";
    }
}
