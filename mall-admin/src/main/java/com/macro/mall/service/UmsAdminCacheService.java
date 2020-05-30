package com.macro.mall.service;

import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsResource;

import java.util.List;

/**
 * Background user cache operation class
 * Created by macro on 2020/3/13.
 */
public interface UmsAdminCacheService {
    /**
     * Delete background user cache
     */
    void delAdmin(Long adminId);

    /**
     * Delete background user resource list cache
     */
    void delResourceList(Long adminId);

    /**
     * Delete the associated background user cache when the role-related resource information changes
     */
    void delResourceListByRole(Long roleId);

    /**
     * Delete the associated background user cache when the role-related resource information changes
     */
    void delResourceListByRoleIds(List<Long> roleIds);

    /**
     * Delete resource project background user cache when resource information changes
     */
    void delResourceListByResource(Long resourceId);

    /**
     * Obtain cache background user information
     */
    UmsAdmin getAdmin(String username);

    /**
     * Set up cache background user information
     */
    void setAdmin(UmsAdmin admin);

    /**
     * Get cache background user resource list
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * Set up background user resource list
     */
    void setResourceList(Long adminId, List<UmsResource> resourceList);
}
