package com.shop.model.service.impl;

import com.shop.model.entity.StockLog;
import com.shop.model.mapper.StockLogMapper;
import com.shop.model.service.IStockLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 库存日志表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class StockLogServiceImpl extends ServiceImpl<StockLogMapper, StockLog> implements IStockLogService {

}
