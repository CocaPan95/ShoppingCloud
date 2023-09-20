package com.shop.admin.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.service.IPmsProductService;
import com.shop.model.dto.PmsProductParam;
import com.shop.model.dto.PmsProductQueryParam;
import com.shop.model.dto.PmsProductResult;
import com.shop.model.entity.*;
import com.shop.model.mapper.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
@Service
public class PmsProductServiceImpl extends ServiceImpl<PmsProductMapper, PmsProduct> implements IPmsProductService {

    @Autowired
    private PmsSkuStockMapper skuStockMapper;
    @Autowired
    private PmsProductAttributeValueMapper productAttributeValueMapper;
    @Autowired
    private PmsProductVertifyRecordMapper pmsProductVertifyRecordMapper;

    @Autowired
    private PmsProductCategoryMapper pmsProductCategoryMapper;


    public void CalProductInfo() {

        LambdaQueryWrapper<PmsProductCategory> productCategoryLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productCategoryLambdaQueryWrapper.in(PmsProductCategory::getId, new ArrayList<Long>() {{
            add(68L);
            add(69L);
        }});
        List<PmsProductCategory> productCategoryList = pmsProductCategoryMapper.selectList(productCategoryLambdaQueryWrapper);
        long categoryCount = productCategoryList.stream().count();
        for (int j = 0; j < categoryCount; j++) {
            PmsProductCategory productCategory = productCategoryList.get(j);
            String productSnCategory = "";
            String attr = "";
            BigDecimal price = BigDecimal.valueOf(0);
            if (productCategory.getName().equals("魔法包")) {
                productSnCategory = "MFB-";
                price = BigDecimal.valueOf(35);
                attr = "1张SSR/UR/AR/1张SR/R闪+5张R普";
            }
            if (productCategory.getName().equals("灵犀包")) {
                productSnCategory = "LXB-";
                price = BigDecimal.valueOf(100);
                attr = "1张AR/UR/MR/SSR/SR+5张R";
            }
            for (int i = 0; i < 2000; i++) {
                PmsProductParam model = new PmsProductParam();
                model.setBrandId(60L);
                model.setBrandName("叶罗丽");
                model.setProductCategoryId(productCategory.getId());
                model.setProductCategoryName(productCategory.getName());
                model.setProductAttributeCategoryId(18L);
                model.setName("叶罗丽-" + productCategory.getName() + "-第" + i + "弹");
                model.setPic("http://jhbupload.oss-cn-hangzhou.aliyuncs.com/product/20190904104347845lgbuv.jpg");
                model.setProductSn("YLL-" + productSnCategory + i);
                model.setDeleteStatus(0);
                model.setPublishStatus(1);
                model.setNewStatus(0);
                model.setRecommandStatus(0);
                model.setVerifyStatus(1);
                model.setSale(0);
                model.setSort(i);
                model.setPrice(price);
                model.setDescription("描述：" + "叶罗丽-" + productCategory.getName() + "-第" + i + "弹");
                model.setSubTitle("副标题：" + "叶罗丽-" + productCategory.getName() + "-第" + i + "弹");
                model.setOriginalPrice(price);
                model.setUnit("盒");
                model.setWeight(BigDecimal.valueOf(300));
                model.setKeywords("叶罗丽," + productCategory.getName());
                model.setNote("");
                model.setAlbumPics("http://jhbupload.oss-cn-hangzhou.aliyuncs.com/product/20190904104347845lgbuv.jpg");
                baseMapper.insert(model);
                Long productId = model.getId();
                List<PmsProductAttributeValue> productAttributeValueList = new ArrayList<>();
                PmsProductAttributeValue productAttributeValue1 = new PmsProductAttributeValue();
                productAttributeValue1.setProductAttributeId(63L);
                productAttributeValue1.setValue("叶罗丽");
                PmsProductAttributeValue productAttributeValue2 = new PmsProductAttributeValue();
                productAttributeValue2.setProductAttributeId(64L);
                productAttributeValue2.setValue("收藏卡");
                productAttributeValueList.add(productAttributeValue2);
                PmsProductAttributeValue productAttributeValue3 = new PmsProductAttributeValue();
                productAttributeValue3.setProductAttributeId(65L);
                productAttributeValue3.setValue("180*160*40");
                productAttributeValueList.add(productAttributeValue3);
                PmsProductAttributeValue productAttributeValue4 = new PmsProductAttributeValue();
                productAttributeValue4.setProductAttributeId(66L);
                productAttributeValue4.setValue(attr);
                productAttributeValueList.add(productAttributeValue4);
                PmsProductAttributeValue productAttributeValue5 = new PmsProductAttributeValue();
                productAttributeValue5.setProductAttributeId(67L);
                productAttributeValue5.setValue("盒,箱");
                productAttributeValueList.add(productAttributeValue5);
                for (PmsProductAttributeValue pmsProductAttributeValue : productAttributeValueList) {
                    pmsProductAttributeValue.setProductId(productId);
                    productAttributeValueMapper.insert(pmsProductAttributeValue);
                }
                PmsSkuStock stock1 = new PmsSkuStock();
                stock1.setPic("http://jhbupload.oss-cn-hangzhou.aliyuncs.com/product/20190904104347845lgbuv.jpg");
                stock1.setPrice(price);
                stock1.setSale(0);
                stock1.setStock(200);
                stock1.setLowStock(10);
                stock1.setSkuCode("YLL-" + productSnCategory + i + "-B");
                stock1.setPromotionPrice(price.subtract(BigDecimal.valueOf(10)));
                stock1.setSpData("[{\"key\":\"规格\",\"value\":\"盒\"}]");
                skuStockMapper.insert(stock1);
                PmsSkuStock stock2 = new PmsSkuStock();
                stock1.setPic("http://jhbupload.oss-cn-hangzhou.aliyuncs.com/product/20190904104347845lgbuv.jpg");
                stock1.setPrice(price.multiply(BigDecimal.valueOf(100)));
                stock1.setSale(0);
                stock1.setStock(200);
                stock1.setLowStock(10);
                stock1.setSkuCode("ATM-" + productSnCategory + i + "-C");
                stock1.setPromotionPrice((price.multiply(BigDecimal.valueOf(100))).subtract(BigDecimal.valueOf(10)));
                stock1.setSpData("[{\"key\":\"规格\",\"value\":\"箱\"}]");
                skuStockMapper.insert(stock1);
            }
        }

    }


    @Override
    public int create(PmsProductParam productParam) {
        CalProductInfo();
        //创建商品
//        PmsProduct product = productParam;
//        product.setId(null);
//        int count = baseMapper.insert(product);
//
//        Long productId = product.getId();
//
//        for (PmsProductAttributeValue pmsProductAttributeValue : productParam.getProductAttributeValueList()) {
//            pmsProductAttributeValue.setProductId(productId);
//            productAttributeValueMapper.insert(pmsProductAttributeValue);
//        }
//        //处理sku的编码
//        handleSkuStockCode(productParam.getSkuStockList(), productId);
//
//        for (PmsSkuStock pmsSkuStock : productParam.getSkuStockList()) {
//            pmsSkuStock.setProductId(productId);
//            skuStockMapper.insert(pmsSkuStock);
//        }
        return 1;
    }

    public void CalSkuInfo() {

    }

    @Override
    public PmsProductResult getUpdateInfo(Long id) {
        PmsProductResult result = new PmsProductResult();
        PmsProduct pmsProduct = baseMapper.selectById(id);
        BeanUtils.copyProperties(pmsProduct, result);
        LambdaQueryWrapper<PmsSkuStock> skuStockLambdaQueryWrapper = new LambdaQueryWrapper<>();
        skuStockLambdaQueryWrapper.eq(PmsSkuStock::getProductId, id);
        List<PmsSkuStock> pmsSkuStocks = skuStockMapper.selectList(skuStockLambdaQueryWrapper);
        result.setSkuStockList(pmsSkuStocks);
        LambdaQueryWrapper<PmsProductAttributeValue> productAttributeValueLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productAttributeValueLambdaQueryWrapper.eq(PmsProductAttributeValue::getProductId, id);
        List<PmsProductAttributeValue> pmsProductAttributeValues = productAttributeValueMapper.selectList(productAttributeValueLambdaQueryWrapper);
        result.setProductAttributeValueList(pmsProductAttributeValues);
        return result;
    }

    @Override
    public int update(Long id, PmsProductParam productParam) {
        //更新商品信息
        PmsProduct product = productParam;
        product.setId(id);
        int count = baseMapper.updateById(product);

        //修改sku库存信息
        handleUpdateSkuStockList(id, productParam);
        //修改商品参数,添加自定义商品规格
        LambdaQueryWrapper<PmsProductAttributeValue> productAttributeValue = new LambdaQueryWrapper<>();
        productAttributeValue.eq(PmsProductAttributeValue::getProductId, id);
        productAttributeValueMapper.delete(productAttributeValue);
        for (PmsProductAttributeValue pmsProductAttributeValue : productParam.getProductAttributeValueList()) {
            pmsProductAttributeValue.setProductId(id);
            productAttributeValueMapper.insert(pmsProductAttributeValue);
        }
        return count;
    }

    @Override
    public Page<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum) {
        Page<PmsProduct> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<PmsProduct> productLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productLambdaQueryWrapper.eq(PmsProduct::getDeleteStatus, 0);
        if (productQueryParam.getPublishStatus() != null) {
            productLambdaQueryWrapper.eq(PmsProduct::getPublishStatus, productQueryParam.getPublishStatus());
        }
        if (productQueryParam.getVerifyStatus() != null) {
            productLambdaQueryWrapper.eq(PmsProduct::getVerifyStatus, productQueryParam.getVerifyStatus());
        }
        if (!StringUtils.isEmpty(productQueryParam.getKeyword())) {
            productLambdaQueryWrapper.or().eq(PmsProduct::getName, productQueryParam.getKeyword());
        }
        if (!StringUtils.isEmpty(productQueryParam.getProductSn())) {
            productLambdaQueryWrapper.or().eq(PmsProduct::getProductSn, productQueryParam.getProductSn());
        }
        if (productQueryParam.getBrandId() != null) {
            productLambdaQueryWrapper.eq(PmsProduct::getBrandId, productQueryParam.getBrandId());
        }
        if (productQueryParam.getProductCategoryId() != null) {
            productLambdaQueryWrapper.eq(PmsProduct::getProductCategoryId, productQueryParam.getProductCategoryId());
        }
        return baseMapper.selectPage(page, productLambdaQueryWrapper);
    }

    @Override
    public int updateVerifyStatus(List<Long> ids, Integer verifyStatus, String detail) {
        PmsProduct product = new PmsProduct();
        product.setVerifyStatus(verifyStatus);
        LambdaQueryWrapper<PmsProduct> productLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productLambdaQueryWrapper.in(PmsProduct::getId, ids);
        List<PmsProductVertifyRecord> list = new ArrayList<>();
        int count = baseMapper.update(product, productLambdaQueryWrapper);
        //修改完审核状态后插入审核记录
        for (Long id : ids) {
            PmsProductVertifyRecord record = new PmsProductVertifyRecord();
            record.setProductId(id);
            record.setCreateTime(LocalDateTime.now());
            record.setDetail(detail);
            record.setStatus(verifyStatus);
            record.setVertifyMan("test");
            pmsProductVertifyRecordMapper.insert(record);
        }
        return count;
    }

    @Override
    public int updatePublishStatus(List<Long> ids, Integer publishStatus) {
        PmsProduct record = new PmsProduct();
        record.setPublishStatus(publishStatus);
        LambdaQueryWrapper<PmsProduct> productLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productLambdaQueryWrapper.in(PmsProduct::getId, ids);
        return baseMapper.update(record, productLambdaQueryWrapper);
    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        PmsProduct record = new PmsProduct();
        record.setRecommandStatus(recommendStatus);
        LambdaQueryWrapper<PmsProduct> productLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productLambdaQueryWrapper.in(PmsProduct::getId, ids);
        return baseMapper.update(record, productLambdaQueryWrapper);
    }

    @Override
    public int updateNewStatus(List<Long> ids, Integer newStatus) {
        PmsProduct record = new PmsProduct();
        record.setNewStatus(newStatus);
        LambdaQueryWrapper<PmsProduct> productLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productLambdaQueryWrapper.in(PmsProduct::getId, ids);
        return baseMapper.update(record, productLambdaQueryWrapper);
    }

    @Override
    public int updateDeleteStatus(List<Long> ids, Integer deleteStatus) {
        PmsProduct record = new PmsProduct();
        record.setDeleteStatus(deleteStatus);
        LambdaQueryWrapper<PmsProduct> productLambdaQueryWrapper = new LambdaQueryWrapper<>();
        productLambdaQueryWrapper.in(PmsProduct::getId, ids);
        return baseMapper.update(record, productLambdaQueryWrapper);
    }

    private void handleUpdateSkuStockList(Long id, PmsProductParam productParam) {
        //当前的sku信息
        List<PmsSkuStock> currSkuList = productParam.getSkuStockList();
        //当前没有sku直接删除
        if (CollUtil.isEmpty(currSkuList)) {
            LambdaQueryWrapper<PmsSkuStock> skuStockLambdaQueryWrapper = new LambdaQueryWrapper<>();
            skuStockLambdaQueryWrapper.eq(PmsSkuStock::getProductId, id);
            skuStockMapper.delete(skuStockLambdaQueryWrapper);
            return;
        }
        //获取初始sku信息
        LambdaQueryWrapper<PmsSkuStock> skuStockLambdaQueryWrapper = new LambdaQueryWrapper<>();
        skuStockLambdaQueryWrapper.eq(PmsSkuStock::getProductId, id);
        List<PmsSkuStock> oriStuList = skuStockMapper.selectList(skuStockLambdaQueryWrapper);
        //获取新增sku信息
        List<PmsSkuStock> insertSkuList = currSkuList.stream().filter(item -> item.getId() == null).collect(Collectors.toList());
        //获取需要更新的sku信息
        List<PmsSkuStock> updateSkuList = currSkuList.stream().filter(item -> item.getId() != null).collect(Collectors.toList());
        List<Long> updateSkuIds = updateSkuList.stream().map(PmsSkuStock::getId).collect(Collectors.toList());
        //获取需要删除的sku信息
        List<PmsSkuStock> removeSkuList = oriStuList.stream().filter(item -> !updateSkuIds.contains(item.getId())).collect(Collectors.toList());
        handleSkuStockCode(insertSkuList, id);
        handleSkuStockCode(updateSkuList, id);
        //新增sku
        if (CollUtil.isNotEmpty(insertSkuList)) {
            for (PmsSkuStock pmsSkuStock : insertSkuList) {
                skuStockMapper.insert(pmsSkuStock);
            }
        }
        //删除sku
        if (CollUtil.isNotEmpty(removeSkuList)) {
            List<Long> removeSkuIds = removeSkuList.stream().map(PmsSkuStock::getId).collect(Collectors.toList());
            LambdaQueryWrapper<PmsSkuStock> skuStockLambdaQueryWrapperDel = new LambdaQueryWrapper<>();
            skuStockLambdaQueryWrapperDel.in(PmsSkuStock::getId, removeSkuIds);
            skuStockMapper.delete(skuStockLambdaQueryWrapperDel);
        }
        //修改sku
        if (CollUtil.isNotEmpty(updateSkuList)) {
            for (PmsSkuStock pmsSkuStock : updateSkuList) {
                skuStockMapper.updateById(pmsSkuStock);
            }
        }

    }


    private void handleSkuStockCode(List<PmsSkuStock> skuStockList, Long productId) {
        if (CollectionUtils.isEmpty(skuStockList)) return;
        for (int i = 0; i < skuStockList.size(); i++) {
            PmsSkuStock skuStock = skuStockList.get(i);
            if (StringUtils.isEmpty(skuStock.getSkuCode())) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
                StringBuilder sb = new StringBuilder();
                //日期
                sb.append(sdf.format(new Date()));
                //四位商品id
                sb.append(String.format("%04d", productId));
                //三位索引id
                sb.append(String.format("%03d", i + 1));
                skuStock.setSkuCode(sb.toString());
            }
        }
    }
}
