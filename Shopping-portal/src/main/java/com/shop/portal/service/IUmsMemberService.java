package com.shop.portal.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.api.CommonResult;
import com.shop.model.dto.UserDto;
import com.shop.model.entity.UmsMember;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-04
 */
public interface IUmsMemberService extends IService<UmsMember> {
    UserDto loadUserByUsername(String username);
    UmsMember getByUsername(String username);
    CommonResult login(String username, String password);
    /**
     * 用户注册
     */
    @Transactional
    void register(String username, String password, String telephone, String authCode);
    /**
     * 修改密码
     */
    @Transactional
    void updatePassword(String telephone, String password, String authCode);

    /**
     * 获取当前登录会员
     */
    UmsMember getCurrentMember();

    /**
     * 根据会员id修改会员积分
     */
    void updateIntegration(Long id,Integer integration);
    /**
     * 生成验证码
     */
    String generateAuthCode(String telephone);
}
