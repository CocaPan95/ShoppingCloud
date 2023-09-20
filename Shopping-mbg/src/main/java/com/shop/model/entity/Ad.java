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
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private String Name;

    private String Url;

    private String Title;

    private String ImgUrl;

    /**
     * 0.无效，1.有效
     */
    private Boolean IsValid;

    private LocalDateTime CreateTime;

    private LocalDateTime UpdateTime;

    private String CreateName;

    private String UpdateName;

    private Boolean IsPublish;

    /**
     * 图片类型 1.启动页图片,2,3,4
     */
    private Integer ImgType;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public Boolean getIsValid() {
        return IsValid;
    }

    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    public LocalDateTime getUpdateTime() {
        return UpdateTime;
    }

    public void setUpdateTime(LocalDateTime UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public String getCreateName() {
        return CreateName;
    }

    public void setCreateName(String CreateName) {
        this.CreateName = CreateName;
    }

    public String getUpdateName() {
        return UpdateName;
    }

    public void setUpdateName(String UpdateName) {
        this.UpdateName = UpdateName;
    }

    public Boolean getIsPublish() {
        return IsPublish;
    }

    public void setIsPublish(Boolean IsPublish) {
        this.IsPublish = IsPublish;
    }

    public Integer getImgType() {
        return ImgType;
    }

    public void setImgType(Integer ImgType) {
        this.ImgType = ImgType;
    }

    @Override
    public String toString() {
        return "Ad{" +
        "Id=" + Id +
        ", Name=" + Name +
        ", Url=" + Url +
        ", Title=" + Title +
        ", ImgUrl=" + ImgUrl +
        ", IsValid=" + IsValid +
        ", CreateTime=" + CreateTime +
        ", UpdateTime=" + UpdateTime +
        ", CreateName=" + CreateName +
        ", UpdateName=" + UpdateName +
        ", IsPublish=" + IsPublish +
        ", ImgType=" + ImgType +
        "}";
    }
}
