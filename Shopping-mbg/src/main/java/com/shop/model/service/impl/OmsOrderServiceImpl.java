package com.shop.model.service.impl;

import com.shop.model.entity.OmsOrder;
import com.shop.model.mapper.OmsOrderMapper;
import com.shop.model.service.IOmsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-20
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements IOmsOrderService {

}
