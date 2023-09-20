package com.shop.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 优选专区和产品关系表
 * </p>
 *
 * @author coca
 * @since 2023-09-20
 */
@TableName("cms_prefrence_area_product_relation")
public class CmsPrefrenceAreaProductRelation implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long prefrenceAreaId;

    private Long productId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrefrenceAreaId() {
        return prefrenceAreaId;
    }

    public void setPrefrenceAreaId(Long prefrenceAreaId) {
        this.prefrenceAreaId = prefrenceAreaId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "CmsPrefrenceAreaProductRelation{" +
        "id=" + id +
        ", prefrenceAreaId=" + prefrenceAreaId +
        ", productId=" + productId +
        "}";
    }
}
