package com.macro.mall.service;

import com.macro.mall.model.UmsResource;

import java.util.List;

/**
 * Background Resource Management Service
 * Created by macro on 2020/2/2.
 */
public interface UmsResourceService {
    /**
     * Add resources
     */
    int create(UmsResource umsResource);

    /**
     * Modifying resources
     */
    int update(Long id, UmsResource umsResource);

    /**
     * Get resource details
     */
    UmsResource getItem(Long id);

    /**
     * Delete Resource
     */
    int delete(Long id);

    /**
     * Pagequery resources
     */
    List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);

    /**
     * Querate all resources
     */
    List<UmsResource> listAll();
}
