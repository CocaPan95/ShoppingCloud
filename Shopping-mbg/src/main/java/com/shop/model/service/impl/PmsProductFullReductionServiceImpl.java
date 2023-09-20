package com.shop.model.service.impl;

import com.shop.model.entity.PmsProductFullReduction;
import com.shop.model.mapper.PmsProductFullReductionMapper;
import com.shop.model.service.IPmsProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-20
 */
@Service
public class PmsProductFullReductionServiceImpl extends ServiceImpl<PmsProductFullReductionMapper, PmsProductFullReduction> implements IPmsProductFullReductionService {

}
