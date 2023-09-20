package com.shop.model.service.impl;

import com.shop.model.entity.ImportOrderData;
import com.shop.model.mapper.ImportOrderDataMapper;
import com.shop.model.service.IImportOrderDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 导入订单数据 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class ImportOrderDataServiceImpl extends ServiceImpl<ImportOrderDataMapper, ImportOrderData> implements IImportOrderDataService {

}
