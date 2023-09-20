package com.shop.model.service.impl;

import com.shop.model.entity.UserMoney;
import com.shop.model.mapper.UserMoneyMapper;
import com.shop.model.service.IUserMoneyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户金额信息 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class UserMoneyServiceImpl extends ServiceImpl<UserMoneyMapper, UserMoney> implements IUserMoneyService {

}
