package com.shop.model.service.impl;

import com.shop.model.entity.CustomerLog;
import com.shop.model.mapper.CustomerLogMapper;
import com.shop.model.service.ICustomerLogService;
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
public class CustomerLogServiceImpl extends ServiceImpl<CustomerLogMapper, CustomerLog> implements ICustomerLogService {

}
