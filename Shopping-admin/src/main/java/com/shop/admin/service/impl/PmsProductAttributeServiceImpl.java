package com.shop.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.service.IPmsProductAttributeService;
import com.shop.model.dto.PmsProductAttributeParam;
import com.shop.model.entity.PmsProductAttribute;
import com.shop.model.entity.PmsProductAttributeCategory;
import com.shop.model.mapper.PmsProductAttributeCategoryMapper;
import com.shop.model.mapper.PmsProductAttributeMapper;
import org.springframework.beans.BeanUtils;
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
    private PmsProductAttributeMapper productAttributeMapper;
    @Autowired
    private PmsProductAttributeCategoryMapper productAttributeCategoryMapper;

    @Override
    public Page<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum) {
        Page<PmsProductAttribute> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<PmsProductAttribute> productAttributeLambdaQueryWrapper=new LambdaQueryWrapper<>();
        productAttributeLambdaQueryWrapper.orderByDesc(PmsProductAttribute::getSort);
        productAttributeLambdaQueryWrapper.eq(PmsProductAttribute::getType,type);
        productAttributeLambdaQueryWrapper.eq(PmsProductAttribute::getProductAttributeCategoryId,cid);
        return productAttributeMapper.selectPage(page,productAttributeLambdaQueryWrapper);
    }

    @Override
    public int create(PmsProductAttributeParam pmsProductAttributeParam) {
        PmsProductAttribute pmsProductAttribute = new PmsProductAttribute();
        BeanUtils.copyProperties(pmsProductAttributeParam, pmsProductAttribute);
        int count = productAttributeMapper.insert(pmsProductAttribute);
        //新增商品属性以后需要更新商品属性分类数量
        PmsProductAttributeCategory pmsProductAttributeCategory = productAttributeCategoryMapper.selectById(pmsProductAttribute.getProductAttributeCategoryId());
        if (pmsProductAttribute.getType() == 0) {
            pmsProductAttributeCategory.setAttributeCount(pmsProductAttributeCategory.getAttributeCount() + 1);
        } else if (pmsProductAttribute.getType() == 1) {
            pmsProductAttributeCategory.setParamCount(pmsProductAttributeCategory.getParamCount() + 1);
        }
        productAttributeCategoryMapper.updateById(pmsProductAttributeCategory);
        return count;
    }

    @Override
    public int update(Long id, PmsProductAttributeParam productAttributeParam) {
        PmsProductAttribute pmsProductAttribute = new PmsProductAttribute();
        pmsProductAttribute.setId(id);
        BeanUtils.copyProperties(productAttributeParam, pmsProductAttribute);
        return productAttributeMapper.updateById(pmsProductAttribute);
    }

    @Override
    public PmsProductAttribute getItem(Long id) {
        return productAttributeMapper.selectById(id);
    }

    @Override
    public int delete(List<Long> ids) {
        //获取分类
        PmsProductAttribute pmsProductAttribute = productAttributeMapper.selectById(ids.get(0));
        Integer type = pmsProductAttribute.getType();
        PmsProductAttributeCategory pmsProductAttributeCategory = productAttributeCategoryMapper.selectById(pmsProductAttribute.getProductAttributeCategoryId());
        LambdaQueryWrapper<PmsProductAttribute> productAttributeLambdaQueryWrapper=new LambdaQueryWrapper<>();
        productAttributeLambdaQueryWrapper.in(PmsProductAttribute::getId,ids);
        int count = productAttributeMapper.delete(productAttributeLambdaQueryWrapper);
        //删除完成后修改数量
        if (type == 0) {
            if (pmsProductAttributeCategory.getAttributeCount() >= count) {
                pmsProductAttributeCategory.setAttributeCount(pmsProductAttributeCategory.getAttributeCount() - count);
            } else {
                pmsProductAttributeCategory.setAttributeCount(0);
            }
        } else if (type == 1) {
            if (pmsProductAttributeCategory.getParamCount() >= count) {
                pmsProductAttributeCategory.setParamCount(pmsProductAttributeCategory.getParamCount() - count);
            } else {
                pmsProductAttributeCategory.setParamCount(0);
            }
        }
        productAttributeCategoryMapper.updateById(pmsProductAttributeCategory);
        return count;
    }



}
