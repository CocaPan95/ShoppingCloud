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
public class OrderLog implements Serializable {

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
     * 订单日志类型
     */
    private Integer LogType;

    /**
     * 日志生成时间
     */
    private LocalDateTime CreateTime;

    /**
     * 日志操作人
     */
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
        return "OrderLog{" +
        "LogId=" + LogId +
        ", Id=" + Id +
        ", LogContent=" + LogContent +
        ", LogType=" + LogType +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        "}";
    }
}
