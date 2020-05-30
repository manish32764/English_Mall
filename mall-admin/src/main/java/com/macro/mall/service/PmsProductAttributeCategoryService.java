package com.macro.mall.service;

import com.macro.mall.dto.PmsProductAttributeCategoryItem;
import com.macro.mall.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * Product Property Category Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductAttributeCategoryService {
    /**
     * Create attribute classifications
     */
    int create(String name);

    /**
     * Modify attribute classification
     */
    int update(Long id, String name);

    /**
     * Delete attribute classification
     */
    int delete(Long id);

    /**
     * Get attribute classification details
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * pagination query attribute classification
     */
    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    /**
     * Get attribute classification containing attributes
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
