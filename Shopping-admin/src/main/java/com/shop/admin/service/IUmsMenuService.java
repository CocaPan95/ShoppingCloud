package com.shop.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.model.dto.UmsMenuNode;
import com.shop.model.entity.UmsMenu;

import java.util.List;

/**
 * <p>
 * 后台菜单表 服务类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
public interface IUmsMenuService extends IService<UmsMenu> {
    int create(UmsMenu umsMenu);
    int update(Long id, UmsMenu umsMenu);
    UmsMenu getItem(Long id);
    int delete(Long id);
    Page<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);
    List<UmsMenuNode> treeList();
    int updateHidden(Long id, Integer hidden);
}
