package com.shop.model.service.impl;

import com.shop.model.entity.UserMoneyLog;
import com.shop.model.mapper.UserMoneyLogMapper;
import com.shop.model.service.IUserMoneyLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户消费记录 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class UserMoneyLogServiceImpl extends ServiceImpl<UserMoneyLogMapper, UserMoneyLog> implements IUserMoneyLogService {

}
