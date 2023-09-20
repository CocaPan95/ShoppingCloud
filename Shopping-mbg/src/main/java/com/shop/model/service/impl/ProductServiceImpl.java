package com.shop.model.service.impl;

import com.shop.model.entity.Product;
import com.shop.model.mapper.ProductMapper;
import com.shop.model.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
