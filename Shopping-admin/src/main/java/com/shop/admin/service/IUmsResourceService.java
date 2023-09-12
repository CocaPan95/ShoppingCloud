package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
    int create(UmsResource umsResource);
    Map<String, List<String>> initResourceRolesMap();
    int update(Long id, UmsResource umsResource);
    UmsResource getItem(Long id);
    int delete(Long id);
    Page<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);
    List<UmsResource> listAll();
}
