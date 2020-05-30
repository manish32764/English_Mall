package com.macro.mall.service;

import com.macro.mall.dto.UmsMenuNode;
import com.macro.mall.model.UmsMenu;

import java.util.List;

/**
 * Background menu management service
 * Created by macro on 2020/2/2.
 */
public interface UmsMenuService {
    /**
     * Create background menu
     */
    int create(UmsMenu umsMenu);

    /**
     * Modify background menu
     */
    int update(Long id, UmsMenu umsMenu);

    /**
     * Get menu details by ID
     */
    UmsMenu getItem(Long id);

    /**
     * Delete menu based on ID
     */
    int delete(Long id);

    /**
     * Search background menu by page
     */
    List<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * Tree structure returns a list of all menus
     */
    List<UmsMenuNode> treeList();

    /**
     * Modify menu display status
     */
    int updateHidden(Long id, Integer hidden);
}
