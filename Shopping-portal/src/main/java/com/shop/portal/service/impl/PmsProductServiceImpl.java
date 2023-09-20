package com.shop.portal.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.model.dto.PmsPortalProductDetail;
import com.shop.model.dto.PmsProductCategoryNode;
import com.shop.model.entity.*;
import com.shop.model.mapper.*;
import com.shop.portal.service.IPmsProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-20
 */
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements IPmsProductService {
    @Autowired
    private PmsProductCategoryMapper productCategoryMapper;
    @Autowired
    private PmsBrandMapper brandMapper;
    @Autowired
    private PmsProductAttributeMapper productAttributeMapper;
    @Autowired
    private PmsProductAttributeValueMapper productAttributeValueMapper;
    @Autowired
    private PmsSkuStockMapper skuStockMapper;
    @Override
    public Page<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort) {
        Page<PmsProduct> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<PmsProduct> productLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productLambdaQueryWrapper.eq(PmsProduct::getDeleteStatus, 0);
        if (StrUtil.isNotEmpty(keyword)) {
            productLambdaQueryWrapper.like(PmsProduct::getName, keyword);
        }
        if (brandId != null) {
            productLambdaQueryWrapper.eq(PmsProduct::getBrandId, brandId);
        }
        if (productCategoryId != null) {
            productLambdaQueryWrapper.eq(PmsProduct::getProductCategoryId, productCategoryId);
        }
        //1->按新品；2->按销量；3->价格从低到高；4->价格从高到低
        if (sort == 1) {
            productLambdaQueryWrapper.orderByDesc(PmsProduct::getId);
        } else if (sort == 2) {
            productLambdaQueryWrapper.orderByDesc(PmsProduct::getSale);
        } else if (sort == 3) {
            productLambdaQueryWrapper.orderByAsc(PmsProduct::getPrice);
        } else if (sort == 4) {
            productLambdaQueryWrapper.orderByDesc(PmsProduct::getPrice);
        }
        return baseMapper.selectPage(page, productLambdaQueryWrapper);
    }

    @Override
    public PmsPortalProductDetail detail(Long id) {
        PmsPortalProductDetail result = new PmsPortalProductDetail();
        //获取商品信息
        PmsProduct product = baseMapper.selectById(id);
        result.setProduct(product);
        //获取品牌信息
        PmsBrand brand = brandMapper.selectById(product.getBrandId());
        result.setBrand(brand);
        //获取商品属性信息
        LambdaQueryWrapper<PmsProductAttribute> productAttributeLambdaQueryWrapper=new LambdaQueryWrapper<>();
        productAttributeLambdaQueryWrapper.eq(PmsProductAttribute::getProductAttributeCategoryId,product.getProductAttributeCategoryId());
        List<PmsProductAttribute> productAttributeList = productAttributeMapper.selectList(productAttributeLambdaQueryWrapper);
        result.setProductAttributeList(productAttributeList);
        //获取商品属性值信息
        if (CollUtil.isNotEmpty(productAttributeList)) {
            List<Long> attributeIds = productAttributeList.stream().map(PmsProductAttribute::getId).collect(Collectors.toList());
            LambdaQueryWrapper<PmsProductAttributeValue> productAttributeValueLambdaQueryWrapper=new LambdaQueryWrapper<>();
            productAttributeValueLambdaQueryWrapper.eq(PmsProductAttributeValue::getProductId,product.getId());
            productAttributeValueLambdaQueryWrapper.in(PmsProductAttributeValue::getProductAttributeId,attributeIds);
            List<PmsProductAttributeValue> productAttributeValueList = productAttributeValueMapper.selectList(productAttributeValueLambdaQueryWrapper);
            result.setProductAttributeValueList(productAttributeValueList);
        }
        //获取商品SKU库存信息
        LambdaQueryWrapper<PmsSkuStock> skuStockLambdaQueryWrapper=new LambdaQueryWrapper<>();
        skuStockLambdaQueryWrapper.eq(PmsSkuStock::getProductId,product.getId());
        List<PmsSkuStock> skuStockList = skuStockMapper.selectList(skuStockLambdaQueryWrapper);
        result.setSkuStockList(skuStockList);

        return result;
    }

    @Override
    public List<PmsProductCategoryNode> categoryTreeList() {
        List<PmsProductCategory> allList = productCategoryMapper.selectList(Wrappers.emptyWrapper());
        List<PmsProductCategoryNode> result = allList.stream()
                .filter(item -> item.getParentId().equals(0L))
                .map(item -> covert(item, allList)).collect(Collectors.toList());
        return result;
    }

    /**
     * 初始对象转化为节点对象
     */
    private PmsProductCategoryNode covert(PmsProductCategory item, List<PmsProductCategory> allList) {
        PmsProductCategoryNode node = new PmsProductCategoryNode();
        BeanUtils.copyProperties(item, node);
        List<PmsProductCategoryNode> children = allList.stream()
                .filter(subItem -> subItem.getParentId().equals(item.getId()))
                .map(subItem -> covert(subItem, allList)).collect(Collectors.toList());
        node.setChildren(children);
        return node;
    }
}
