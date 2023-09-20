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
public class ExpressCompany implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 快递公司Id
     */
      @TableId(value = "ExpressId", type = IdType.AUTO)
    private Integer ExpressId;

    /**
     * 快递公司编号
     */
    private String ExpressCode;

    /**
     * 快递公司名称
     */
    private String ExpressName;

    /**
     * 快递公司提供的接口码
     */
    private String InterfaceCode;

    private String ImgUrl;

    private Integer SortNo;

    private Boolean IsEnabled;

    private LocalDateTime CreateTime;


    public Integer getExpressId() {
        return ExpressId;
    }

    public void setExpressId(Integer ExpressId) {
        this.ExpressId = ExpressId;
    }

    public String getExpressCode() {
        return ExpressCode;
    }

    public void setExpressCode(String ExpressCode) {
        this.ExpressCode = ExpressCode;
    }

    public String getExpressName() {
        return ExpressName;
    }

    public void setExpressName(String ExpressName) {
        this.ExpressName = ExpressName;
    }

    public String getInterfaceCode() {
        return InterfaceCode;
    }

    public void setInterfaceCode(String InterfaceCode) {
        this.InterfaceCode = InterfaceCode;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }

    public Integer getSortNo() {
        return SortNo;
    }

    public void setSortNo(Integer SortNo) {
        this.SortNo = SortNo;
    }

    public Boolean getIsEnabled() {
        return IsEnabled;
    }

    public void setIsEnabled(Boolean IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    public LocalDateTime getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(LocalDateTime CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    public String toString() {
        return "ExpressCompany{" +
        "ExpressId=" + ExpressId +
        ", ExpressCode=" + ExpressCode +
        ", ExpressName=" + ExpressName +
        ", InterfaceCode=" + InterfaceCode +
        ", ImgUrl=" + ImgUrl +
        ", SortNo=" + SortNo +
        ", IsEnabled=" + IsEnabled +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
