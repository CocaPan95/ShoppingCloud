package com.shop.model.service.impl;

import com.shop.model.entity.Customer;
import com.shop.model.mapper.CustomerMapper;
import com.shop.model.service.ICustomerService;
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
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
