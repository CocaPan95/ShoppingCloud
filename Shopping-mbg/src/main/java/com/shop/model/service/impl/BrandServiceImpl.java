package com.shop.model.service.impl;

import com.shop.model.entity.Brand;
import com.shop.model.mapper.BrandMapper;
import com.shop.model.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
