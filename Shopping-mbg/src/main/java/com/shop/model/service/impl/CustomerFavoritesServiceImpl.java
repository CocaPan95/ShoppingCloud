package com.shop.model.service.impl;

import com.shop.model.entity.CustomerFavorites;
import com.shop.model.mapper.CustomerFavoritesMapper;
import com.shop.model.service.ICustomerFavoritesService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class CustomerFavoritesServiceImpl extends ServiceImpl<CustomerFavoritesMapper, CustomerFavorites> implements ICustomerFavoritesService {

}
