package com.macro.mall.dao;

import com.macro.mall.model.UmsAdminRoleRelation;
import com.macro.mall.model.UmsPermission;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Custom background user and role management Dao
 * Created by macro on 2018/10/8.
 */
public interface UmsAdminRoleRelationDao {
    /**
     * Bulk Insert User Role Relationship
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * Gets for all roles
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * Gets user permissions for all roles
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * Get all user permissions (including +- permissions)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

    /**
     * Get all resources accessible to the user
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * Get a list of resource related user IDs
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
