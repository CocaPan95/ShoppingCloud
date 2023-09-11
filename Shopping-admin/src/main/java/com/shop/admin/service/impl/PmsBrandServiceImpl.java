package com.shop.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.mapper.PmsBrandMapper;
import com.shop.admin.service.IPmsBrandService;
import com.shop.model.dto.PmsBrandParam;
import com.shop.model.entity.PmsBrand;
import com.shop.model.entity.PmsProductAttribute;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements IPmsBrandService {
    @Override
    public List<PmsBrand> listAllBrand() {
        return baseMapper.selectList(Wrappers.emptyWrapper());
    }

    @Override
    public int createBrand(PmsBrandParam pmsBrandParam) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandParam, pmsBrand);
        //如果创建时首字母为空，取名称的第一个为首字母
        if (StringUtils.isEmpty(pmsBrand.getFirstLetter())) {
            pmsBrand.setFirstLetter(pmsBrand.getName().substring(0, 1));
        }
        return baseMapper.insert(pmsBrand);
    }

    @Override
    public int updateBrand(Long id, PmsBrandParam pmsBrandParam) {
        PmsBrand pmsBrand = new PmsBrand();
        BeanUtils.copyProperties(pmsBrandParam, pmsBrand);
        pmsBrand.setId(id);
        //如果创建时首字母为空，取名称的第一个为首字母
        if (StringUtils.isEmpty(pmsBrand.getFirstLetter())) {
            pmsBrand.setFirstLetter(pmsBrand.getName().substring(0, 1));
        }
        //更新品牌时要更新商品中的品牌名称
//        PmsProduct product = new PmsProduct();
//        product.setBrandName(pmsBrand.getName());
//        PmsProductExample example = new PmsProductExample();
//        example.createCriteria().andBrandIdEqualTo(id);
//        productMapper.updateByExampleSelective(product,example);
        return baseMapper.updateById(pmsBrand);
    }

    @Override
    public int deleteBrand(Long id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public int deleteBrand(List<Long> ids) {
        return baseMapper.deleteBatchIds(ids);
    }

    @Override
    public Page<PmsBrand> listBrand(String keyword, int pageNum, int pageSize) {
        Page<PmsBrand> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<PmsBrand> brandLambdaQueryWrapper = new LambdaQueryWrapper<>();
        if (!StringUtils.isEmpty(keyword)) {
            brandLambdaQueryWrapper.like(PmsBrand::getName,keyword);
        }
        brandLambdaQueryWrapper.orderByDesc(PmsBrand::getSort);
        return baseMapper.selectPage(page,brandLambdaQueryWrapper);
    }

    @Override
    public PmsBrand getBrand(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setShowStatus(showStatus);
        LambdaQueryWrapper<PmsBrand> brandLambdaQueryWrapper = new LambdaQueryWrapper<>();
        brandLambdaQueryWrapper.in(PmsBrand::getId,ids);
        return baseMapper.update(pmsBrand, brandLambdaQueryWrapper);
    }

    @Override
    public int updateFactoryStatus(List<Long> ids, Integer factoryStatus) {
        PmsBrand pmsBrand = new PmsBrand();
        pmsBrand.setFactoryStatus(factoryStatus);
        LambdaQueryWrapper<PmsBrand> brandLambdaQueryWrapper = new LambdaQueryWrapper<>();
        brandLambdaQueryWrapper.in(PmsBrand::getId,ids);
        return baseMapper.update(pmsBrand, brandLambdaQueryWrapper);
    }
}
