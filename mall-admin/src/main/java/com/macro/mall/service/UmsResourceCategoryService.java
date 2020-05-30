package com.macro.mall.service;

import com.macro.mall.model.UmsResourceCategory;

import java.util.List;

/**
 * Background Resource Classification Management Service
 * Created by macro on 2020/2/5.
 */
public interface UmsResourceCategoryService {

    /**
     * Access to all resource classifications
     */
    List<UmsResourceCategory> listAll();

    /**
     * Create a resource class
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * Modification of resource classifications
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * Delete Resource Categories
     */
    int delete(Long id);
}
