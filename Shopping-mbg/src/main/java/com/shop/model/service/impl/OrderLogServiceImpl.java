package com.shop.model.service.impl;

import com.shop.model.entity.OrderLog;
import com.shop.model.mapper.OrderLogMapper;
import com.shop.model.service.IOrderLogService;
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
public class OrderLogServiceImpl extends ServiceImpl<OrderLogMapper, OrderLog> implements IOrderLogService {

}
