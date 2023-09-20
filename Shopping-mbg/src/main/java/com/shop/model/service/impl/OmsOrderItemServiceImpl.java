package com.shop.model.service.impl;

import com.shop.model.entity.OmsOrderItem;
import com.shop.model.mapper.OmsOrderItemMapper;
import com.shop.model.service.IOmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-20
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements IOmsOrderItemService {

}
