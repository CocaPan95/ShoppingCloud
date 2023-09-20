package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 产品大区省份表
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
public class SkuSaleArea implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 产品大区省份表主键Id
     */
      @TableId(value = "Id", type = IdType.AUTO)
    private Integer Id;

    /**
     * 省份Id
     */
    private Integer ProvinceId;

    /**
     * 产品Id
     */
    private Long SkuId;

    /**
     * 创建时间
     */
    private LocalDateTime AddTime;

    /**
     * 大区Id
     */
    private Integer AreaId;


    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(Integer ProvinceId) {
        this.ProvinceId = ProvinceId;
    }

    public Long getSkuId() {
        return SkuId;
    }

    public void setSkuId(Long SkuId) {
        this.SkuId = SkuId;
    }

    public LocalDateTime getAddTime() {
        return AddTime;
    }

    public void setAddTime(LocalDateTime AddTime) {
        this.AddTime = AddTime;
    }

    public Integer getAreaId() {
        return AreaId;
    }

    public void setAreaId(Integer AreaId) {
        this.AreaId = AreaId;
    }

    @Override
    public String toString() {
        return "SkuSaleArea{" +
        "Id=" + Id +
        ", ProvinceId=" + ProvinceId +
        ", SkuId=" + SkuId +
        ", AddTime=" + AddTime +
        ", AreaId=" + AreaId +
        "}";
    }
}
