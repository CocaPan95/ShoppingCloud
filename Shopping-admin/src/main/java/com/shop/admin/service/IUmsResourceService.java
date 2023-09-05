package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.entity.UmsResource;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 后台资源表 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
public interface IUmsResourceService extends IService<UmsResource> {
    Map<String, List<String>> initResourceRolesMap();
}
