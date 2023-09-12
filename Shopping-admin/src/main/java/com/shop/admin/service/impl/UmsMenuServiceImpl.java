package com.shop.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.admin.mapper.UmsMenuMapper;
import com.shop.admin.service.IUmsMenuService;
import com.shop.model.dto.UmsMenuNode;
import com.shop.model.entity.UmsMenu;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 后台菜单表 服务实现类
 * </p>
 *
 * @author coca
 * @since 2023-09-05
 */
@Service
public class UmsMenuServiceImpl extends ServiceImpl<UmsMenuMapper, UmsMenu> implements IUmsMenuService {
    @Override
    public int create(UmsMenu umsMenu) {
        umsMenu.setCreateTime(LocalDateTime.now());
        updateLevel(umsMenu);
        return baseMapper.insert(umsMenu);
    }

    /**
     * 修改菜单层级
     */
    private void updateLevel(UmsMenu umsMenu) {
        if (umsMenu.getParentId() == 0) {
            //没有父菜单时为一级菜单
            umsMenu.setLevel(0);
        } else {
            //有父菜单时选择根据父菜单level设置
            UmsMenu parentMenu = baseMapper.selectById(umsMenu.getParentId());
            if (parentMenu != null) {
                umsMenu.setLevel(parentMenu.getLevel() + 1);
            } else {
                umsMenu.setLevel(0);
            }
        }
    }

    @Override
    public int update(Long id, UmsMenu umsMenu) {
        umsMenu.setId(id);
        updateLevel(umsMenu);
        return baseMapper.updateById(umsMenu);
    }

    @Override
    public UmsMenu getItem(Long id) {
        return baseMapper.selectById(id);
    }

    @Override
    public int delete(Long id) {
        return baseMapper.deleteById(id);
    }

    @Override
    public Page<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum) {
        Page<UmsMenu> page=new Page<>(pageNum,pageSize);
        LambdaQueryWrapper<UmsMenu> menuLambdaQueryWrapper=new LambdaQueryWrapper<>();
        menuLambdaQueryWrapper.eq(UmsMenu::getParentId,parentId);
        menuLambdaQueryWrapper.orderByDesc(UmsMenu::getSort);
        return baseMapper.selectPage(page,menuLambdaQueryWrapper);
    }

    @Override
    public List<UmsMenuNode> treeList() {
        List<UmsMenu> menuList = baseMapper.selectList(Wrappers.emptyWrapper());
        List<UmsMenuNode> result = menuList.stream()
                .filter(menu -> menu.getParentId().equals(0L))
                .map(menu -> covertMenuNode(menu, menuList)).collect(Collectors.toList());
        return result;
    }

    @Override
    public int updateHidden(Long id, Integer hidden) {
        UmsMenu umsMenu = new UmsMenu();
        umsMenu.setId(id);
        umsMenu.setHidden(hidden);
        return baseMapper.updateById(umsMenu);
    }

    /**
     * 将UmsMenu转化为UmsMenuNode并设置children属性
     */
    private UmsMenuNode covertMenuNode(UmsMenu menu, List<UmsMenu> menuList) {
        UmsMenuNode node = new UmsMenuNode();
        BeanUtils.copyProperties(menu, node);
        List<UmsMenuNode> children = menuList.stream()
                .filter(subMenu -> subMenu.getParentId().equals(menu.getId()))
                .map(subMenu -> covertMenuNode(subMenu, menuList)).collect(Collectors.toList());
        node.setChildren(children);
        return node;
    }
}
