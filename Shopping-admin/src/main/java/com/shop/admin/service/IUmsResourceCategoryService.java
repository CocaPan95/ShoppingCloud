package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.entity.UmsResourceCategory;

import java.util.List;

/**
 * <p>
 * 资源分类表 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
public interface IUmsResourceCategoryService extends IService<UmsResourceCategory> {
    List<UmsResourceCategory> listAll();
    int create(UmsResourceCategory umsResourceCategory);
    int update(Long id, UmsResourceCategory umsResourceCategory);
    int delete(Long id);
}
