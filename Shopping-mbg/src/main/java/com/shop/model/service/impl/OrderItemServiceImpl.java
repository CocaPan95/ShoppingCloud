package com.shop.model.service.impl;

import com.shop.model.entity.OrderItem;
import com.shop.model.mapper.OrderItemMapper;
import com.shop.model.service.IOrderItemService;
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
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
