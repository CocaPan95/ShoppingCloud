package com.shop.model.entity.sqlserver;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 品牌表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@TableName(value = "product.Brand")
public class Brand implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @TableId(value = "brandId", type = IdType.AUTO)
    private Integer brandId;

    /**
     * 品牌编码
     */
    @TableField("brandCode")
    private String brandCode;

    /**
     * 品牌名称
     */
    @TableField("brandName")
    private String brandName;

    /**
     * 父品牌	，顶级品牌 ParentId=0
     */
    @TableField("parentId")
    private Integer parentId;

    /**
     * 品牌图片
     */
    @TableField("imageUrl")
    private String imageUrl;

    /**
     * 品牌介绍
     */
    @TableField("brandInfo")
    private String brandInfo;

    /**
     * 是否启用禁用；1：启用，0：禁用
     */
    @TableField("isEnable")
    private Boolean isEnable;

    /**
     * 是否有效；0：有效，1：无效
     */
    @TableField("valid")
    private Boolean valid;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("updateTime")
    private LocalDateTime updateTime;

    /**
     * 创建人
     */
    @TableField("createName")
    private String createName;

    /**
     * 更新人
     */
    @TableField("updateName")
    private String updateName;

    /**
     * 排序；数字越大,越在APP端越靠前
     */
    @TableField("orderNum")
    private Integer orderNum;

    /**
     * 类目Id
     */
    @TableField("kindId")
    private Integer kindId;


    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(String brandInfo) {
        this.brandInfo = brandInfo;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    @Override
    public String toString() {
        return "Brand{" +
        "brandId=" + brandId +
        ", brandCode=" + brandCode +
        ", brandName=" + brandName +
        ", parentId=" + parentId +
        ", imageUrl=" + imageUrl +
        ", brandInfo=" + brandInfo +
        ", isEnable=" + isEnable +
        ", valid=" + valid +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", createName=" + createName +
        ", updateName=" + updateName +
        ", orderNum=" + orderNum +
        ", kindId=" + kindId +
        "}";
    }
}
