package com.shop.model.service.impl;

import com.shop.model.entity.PushMsg;
import com.shop.model.mapper.PushMsgMapper;
import com.shop.model.service.IPushMsgService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 站内消息表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-19
 */
@Service
public class PushMsgServiceImpl extends ServiceImpl<PushMsgMapper, PushMsg> implements IPushMsgService {

}
