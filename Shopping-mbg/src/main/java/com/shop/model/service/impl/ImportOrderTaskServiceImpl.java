package com.shop.model.service.impl;

import com.shop.model.entity.ImportOrderTask;
import com.shop.model.mapper.ImportOrderTaskMapper;
import com.shop.model.service.IImportOrderTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 代下单任务表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class ImportOrderTaskServiceImpl extends ServiceImpl<ImportOrderTaskMapper, ImportOrderTask> implements IImportOrderTaskService {

}
