package com.macro.mall.service;

import com.macro.mall.dto.UmsPermissionNode;
import com.macro.mall.model.UmsPermission;

import java.util.List;

/**
 * Background User Rights Management Service
 * Created by macro on 2018/9/29.
 */
public interface UmsPermissionService {
    /**
     * Add Permissions
     */
    int create(UmsPermission permission);

    /**
     * Modify Permissions
     */
    int update(Long id, UmsPermission permission);

    /**
     * Bulk Delete Permissions
     */
    int delete(List<Long> ids);

    /**
     * Returns all permissions in a hierarchy
     */
    List<UmsPermissionNode> treeList();

    /**
     * Get all permissions
     */
    List<UmsPermission> list();
}
