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
public class IndexCarouselInfo implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    private Integer SkuId;

    private String SKuName;

    private String ImgUrl;

    private String Keyword;

    private Integer IsValid;

    private LocalDateTime CreateTime;


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

    public String getSKuName() {
        return SKuName;
    }

    public void setSKuName(String SKuName) {
        this.SKuName = SKuName;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public Integer getIsValid() {
        return IsValid;
    }

    public void setIsValid(Integer IsValid) {
        this.IsValid = IsValid;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "IndexCarouselInfo{" +
        "Id=" + Id +
        ", SkuId=" + SkuId +
        ", SKuName=" + SKuName +
        ", ImgUrl=" + ImgUrl +
        ", Keyword=" + Keyword +
        ", IsValid=" + IsValid +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
