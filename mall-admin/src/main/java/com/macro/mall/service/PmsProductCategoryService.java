package com.macro.mall.service;

import com.macro.mall.dto.PmsProductCategoryParam;
import com.macro.mall.dto.PmsProductCategoryWithChildrenItem;
import com.macro.mall.model.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Product Classification Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductCategoryService {
    /**
     * Create Product Categories
     */
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * Modification of Product Categories
     */
    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * Get product categories by page
     */
    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * Delete Product Category
     */
    int delete(Long id);

    /**
     * Get product categories based on ID
     */
    PmsProductCategory getItem(Long id);

    /**
     * Bulk modification of navigation status
     */
    int updateNavStatus(List<Long> ids, Integer navStatus);

    /**
     * Bulk modification of display status
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * Get product categories in hierarchical form
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
