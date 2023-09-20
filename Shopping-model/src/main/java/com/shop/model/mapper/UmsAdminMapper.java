package com.shop.model.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.model.entity.UmsAdmin;
import com.shop.model.entity.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author coca
 * @since 2023-09-20
 */
public interface UmsAdminMapper extends BaseMapper<UmsAdmin> {
    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);
}
