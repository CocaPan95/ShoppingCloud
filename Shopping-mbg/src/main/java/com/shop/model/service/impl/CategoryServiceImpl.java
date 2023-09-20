package com.shop.model.service.impl;

import com.shop.model.entity.Category;
import com.shop.model.mapper.CategoryMapper;
import com.shop.model.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 分类表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
