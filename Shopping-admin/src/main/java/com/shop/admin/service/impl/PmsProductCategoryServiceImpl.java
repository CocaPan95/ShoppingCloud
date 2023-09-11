package com.shop.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.mapper.PmsProductCategoryAttributeRelationMapper;
import com.shop.admin.mapper.PmsProductCategoryMapper;
import com.shop.admin.service.IPmsProductCategoryService;
import com.shop.model.dto.PmsProductCategoryParam;
import com.shop.model.entity.PmsProductAttribute;
import com.shop.model.entity.PmsProductCategory;
import com.shop.model.entity.PmsProductCategoryAttributeRelation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
@Service
public class PmsProductCategoryServiceImpl extends ServiceImpl<PmsProductCategoryMapper, PmsProductCategory> implements IPmsProductCategoryService {
    @Autowired
    private PmsProductCategoryAttributeRelationMapper productCategoryAttributeRelationMapper;

    @Override
    public int create(PmsProductCategoryParam productCategoryParam){
        PmsProductCategory productCategory = new PmsProductCategory();
        productCategory.setProductCount(0);
        BeanUtils.copyProperties(productCategoryParam, productCategory);
        setCategoryLevel(productCategory);
        int count = baseMapper.insert(productCategory);
        //创建筛选属性关联
        List<Long> productAttributeIdList = productCategoryParam.getProductAttributeIdList();
        if(!CollectionUtils.isEmpty(productAttributeIdList)){
            insertRelationList(productCategory.getId(), productAttributeIdList);
        }
        return count;
    }
    @Override
    public int update(Long id, PmsProductCategoryParam pmsProductCategoryParam){
        PmsProductCategory productCategory = new PmsProductCategory();
        productCategory.setId(id);
        BeanUtils.copyProperties(pmsProductCategoryParam, productCategory);
        setCategoryLevel(productCategory);

        //产品先不改了，后面做到再改

        //更新筛选属性信息
        //同时更新筛选属性的信息
        LambdaQueryWrapper<PmsProductCategoryAttributeRelation> productCategoryAttributeRelationLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productCategoryAttributeRelationLambdaQueryWrapper.eq(PmsProductCategoryAttributeRelation::getProductCategoryId,id);
        productCategoryAttributeRelationMapper.delete(productCategoryAttributeRelationLambdaQueryWrapper);
        if(!CollectionUtils.isEmpty(pmsProductCategoryParam.getProductAttributeIdList())){
            insertRelationList(id,pmsProductCategoryParam.getProductAttributeIdList());
        }
        return baseMapper.updateById(productCategory);
    }

    @Override
    public Page<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum) {
        Page<PmsProductCategory> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<PmsProductCategory> productCategoryLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productCategoryLambdaQueryWrapper.eq(PmsProductCategory::getParentId,parentId);
        productCategoryLambdaQueryWrapper.orderByDesc(PmsProductCategory::getSort);
        return baseMapper.selectPage(page,productCategoryLambdaQueryWrapper);
    }

    @Override
    public int delete(Long id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public PmsProductCategory getItem(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public int updateNavStatus(List<Long> ids, Integer navStatus) {
        PmsProductCategory productCategory = new PmsProductCategory();
        productCategory.setNavStatus(navStatus);
        LambdaQueryWrapper<PmsProductCategory> productCategoryLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productCategoryLambdaQueryWrapper.in(PmsProductCategory::getId,ids);
        return baseMapper.update(productCategory,productCategoryLambdaQueryWrapper);
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        PmsProductCategory productCategory = new PmsProductCategory();
        productCategory.setShowStatus(showStatus);
        LambdaQueryWrapper<PmsProductCategory> productCategoryLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productCategoryLambdaQueryWrapper.in(PmsProductCategory::getId,ids);
        return baseMapper.update(productCategory,productCategoryLambdaQueryWrapper);
    }

    /**
     * 批量插入商品分类与筛选属性关系表
     * @param productCategoryId 商品分类id
     * @param productAttributeIdList 相关商品筛选属性id集合
     */
    private void insertRelationList(Long productCategoryId, List<Long> productAttributeIdList) {
        List<PmsProductCategoryAttributeRelation> relationList = new ArrayList<>();
        for (Long productAttrId : productAttributeIdList) {
            PmsProductCategoryAttributeRelation relation = new PmsProductCategoryAttributeRelation();
            relation.setProductAttributeId(productAttrId);
            relation.setProductCategoryId(productCategoryId);
            productCategoryAttributeRelationMapper.insert(relation);
        }
    }
    /**
     * 根据分类的parentId设置分类的level
     */
    private void setCategoryLevel(PmsProductCategory productCategory) {
        //没有父分类时为一级分类
        if (productCategory.getParentId() == 0) {
            productCategory.setLevel(0);
        } else {
            //有父分类时选择根据父分类level设置
            PmsProductCategory parentCategory = baseMapper.selectById(productCategory.getParentId());
            if (parentCategory != null) {
                productCategory.setLevel(parentCategory.getLevel() + 1);
            } else {
                productCategory.setLevel(0);
            }
        }
    }
}
