package com.shop.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.mapper.PmsProductAttributeCategoryMapper;
import com.shop.admin.mapper.PmsProductAttributeMapper;
import com.shop.admin.mapper.PmsProductAttributeValueMapper;
import com.shop.admin.service.IPmsProductAttributeService;
import com.shop.common.exception.Asserts;
import com.shop.model.api.CommonResult;
import com.shop.model.dto.PageParam;
import com.shop.model.dto.ProductAttributeParam;
import com.shop.model.entity.PmsProductAttribute;
import com.shop.model.entity.PmsProductAttributeCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 商品属性参数表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
@Service
public class PmsProductAttributeServiceImpl extends ServiceImpl<PmsProductAttributeMapper, PmsProductAttribute> implements IPmsProductAttributeService {
    @Autowired
    private PmsProductAttributeCategoryMapper productAttributeCategoryMapper;

    @Autowired
    private PmsProductAttributeMapper productAttributeMapper;

    @Override
    public Page<PmsProductAttributeCategory> GetProductAttributeCategoryList(PageParam param) {
        Page<PmsProductAttributeCategory> page = new Page<>(param.getPageNum(), param.getPageSize());
        return productAttributeCategoryMapper.selectPage(page, Wrappers.emptyWrapper());
    }

    @Override
    public PmsProductAttributeCategory GetProductAttributeCategoryById(Long id) {
        return productAttributeCategoryMapper.selectById(id);
    }

    @Override
    public boolean ProductAttributeCategorySave(PmsProductAttributeCategory model) {
        if (model.getId() > 0) {
            PmsProductAttributeCategory productAttributeCategory = productAttributeCategoryMapper.selectById(model.getId());
            if (productAttributeCategory == null) {
                Asserts.fail("产品属性分类为空！");
            }
            productAttributeCategory.setName(model.getName());
            if (productAttributeCategoryMapper.updateById(productAttributeCategory) > 0) {
                return true;
            }
        } else {
            PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
            productAttributeCategory.setName(model.getName());
            productAttributeCategory.setAttributeCount(0);
            productAttributeCategory.setParamCount(0);
            if (productAttributeCategoryMapper.insert(productAttributeCategory) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean ProductAttributeCategoryDel(List<Long> ids) {
        //如果有产品在使用这个禁止删除
        if (productAttributeCategoryMapper.deleteBatchIds(ids) > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Page<PmsProductAttribute> GetProductAttributeList(ProductAttributeParam param) {
        Page<PmsProductAttribute> page = new Page<>(param.getPageNum(), param.getPageSize());
        LambdaQueryWrapper<PmsProductAttribute> productAttributeLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productAttributeLambdaQueryWrapper.eq(PmsProductAttribute::getProductAttributeCategoryId, param.getAttributeCategoryId());
        productAttributeLambdaQueryWrapper.eq(PmsProductAttribute::getType, param.getType());
        return productAttributeMapper.selectPage(page, productAttributeLambdaQueryWrapper);
    }

    @Override
    public boolean ProductAttributeSave(PmsProductAttribute model) {
        if (model.getId() > 0) {
            PmsProductAttribute pmsProductAttribute = productAttributeMapper.selectById(model.getId());
            if (pmsProductAttribute == null) {
                Asserts.fail("产品属性为空！");
            }
            if (productAttributeMapper.updateById(model) > 0) {
                return true;
            }
        } else {

            if (productAttributeMapper.insert(model) > 0) {
                PmsProductAttributeCategory productAttributeCategory = productAttributeCategoryMapper.selectById(model.getId());
                if (model.getType() == 0) {
                    productAttributeCategory.setAttributeCount(productAttributeCategory.getAttributeCount() + 1);
                }
                if (model.getType() == 1) {
                    productAttributeCategory.setParamCount(productAttributeCategory.getParamCount() + 1);
                }
                if (productAttributeCategoryMapper.updateById(productAttributeCategory) > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean ProductAttributeDel(List<Long> ids) {
        PmsProductAttribute productAttribute = productAttributeMapper.selectById(ids.get(0));
        PmsProductAttributeCategory pmsProductAttributeCategory = productAttributeCategoryMapper.selectById(productAttribute.getProductAttributeCategoryId());
        if (productAttribute.getType() == 0) {
            if (pmsProductAttributeCategory.getAttributeCount() >= ids.size()) {
                pmsProductAttributeCategory.setAttributeCount(pmsProductAttributeCategory.getAttributeCount() - ids.size());
            } else {
                pmsProductAttributeCategory.setAttributeCount(0);
            }
        }
        if (productAttribute.getType() == 1) {
            if (pmsProductAttributeCategory.getParamCount() >= ids.size()) {
                pmsProductAttributeCategory.setParamCount(pmsProductAttributeCategory.getParamCount() - ids.size());
            } else {
                pmsProductAttributeCategory.setParamCount(0);
            }
        }
        if (productAttributeMapper.deleteBatchIds(ids) > 0) {
            if (productAttributeCategoryMapper.updateById(pmsProductAttributeCategory) > 0) {
                return true;
            }
        }
        return false;
    }

}
