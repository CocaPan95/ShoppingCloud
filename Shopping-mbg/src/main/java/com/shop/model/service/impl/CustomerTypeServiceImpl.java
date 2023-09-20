package com.shop.model.service.impl;

import com.shop.model.entity.CustomerType;
import com.shop.model.mapper.CustomerTypeMapper;
import com.shop.model.service.ICustomerTypeService;
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
public class CustomerTypeServiceImpl extends ServiceImpl<CustomerTypeMapper, CustomerType> implements ICustomerTypeService {

}
