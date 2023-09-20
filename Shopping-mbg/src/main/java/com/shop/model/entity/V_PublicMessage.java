package com.shop.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 1
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class V_PublicMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer MessageId;

    private String MessageTitle;

    private String MessageImg;

    private String MessageContent;

    private Integer ReadNum;

    private LocalDateTime SendTime;

    private String SendTimeStr;

    private Boolean IsPublish;

    private Long CustomerId;

    private String JsonContent;

    private Boolean Valid;

    private LocalDateTime CreateTime;

    private String CreateName;

    private LocalDateTime UpdateTime;

    private String MicroContent;

    private String UpdateName;

    private String ReadTime;

    private Integer MessageType;


    public Integer getMessageId() {
        return MessageId;
    }

    public void setMessageId(Integer MessageId) {
        this.MessageId = MessageId;
    }

    public String getMessageTitle() {
        return MessageTitle;
    }

    public void setMessageTitle(String MessageTitle) {
        this.MessageTitle = MessageTitle;
    }

    public String getMessageImg() {
        return MessageImg;
    }

    public void setMessageImg(String MessageImg) {
        this.MessageImg = MessageImg;
    }

    public String getMessageContent() {
        return MessageContent;
    }

    public void setMessageContent(String MessageContent) {
        this.MessageContent = MessageContent;
    }

    public Integer getReadNum() {
        return ReadNum;
    }

    public void setReadNum(Integer ReadNum) {
        this.ReadNum = ReadNum;
    }

    public LocalDateTime getSendTime() {
        return SendTime;
    }

    public void setSendTime(LocalDateTime SendTime) {
        this.SendTime = SendTime;
    }

    public String getSendTimeStr() {
        return SendTimeStr;
    }

    public void setSendTimeStr(String SendTimeStr) {
        this.SendTimeStr = SendTimeStr;
    }

    public Boolean getIsPublish() {
        return IsPublish;
    }

    public void setIsPublish(Boolean IsPublish) {
        this.IsPublish = IsPublish;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getJsonContent() {
        return JsonContent;
    }

    public void setJsonContent(String JsonContent) {
        this.JsonContent = JsonContent;
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

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public String getMicroContent() {
        return MicroContent;
    }

    public void setMicroContent(String MicroContent) {
        this.MicroContent = MicroContent;
    }

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    public String getReadTime() {
        return ReadTime;
    }

    public void setReadTime(String ReadTime) {
        this.ReadTime = ReadTime;
    }

    public Integer getMessageType() {
        return MessageType;
    }

    public void setMessageType(Integer MessageType) {
        this.MessageType = MessageType;
    }

    @Override
    public String toString() {
        return "V_PublicMessage{" +
        "MessageId=" + MessageId +
        ", MessageTitle=" + MessageTitle +
        ", MessageImg=" + MessageImg +
        ", MessageContent=" + MessageContent +
        ", ReadNum=" + ReadNum +
        ", SendTime=" + SendTime +
        ", SendTimeStr=" + SendTimeStr +
        ", IsPublish=" + IsPublish +
        ", CustomerId=" + CustomerId +
        ", JsonContent=" + JsonContent +
        ", Valid=" + Valid +
        ", CreateTime=" + CreateTime +
        ", CreateName=" + CreateName +
        ", UpdateTime=" + UpdateTime +
        ", MicroContent=" + MicroContent +
        ", UpdateName=" + UpdateName +
        ", ReadTime=" + ReadTime +
        ", MessageType=" + MessageType +
        "}";
    }
}
