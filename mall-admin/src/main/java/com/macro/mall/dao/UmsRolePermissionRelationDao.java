package com.macro.mall.dao;

import com.macro.mall.model.UmsPermission;
import com.macro.mall.model.UmsRolePermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Custom Role Rights Relationship Management Dao
 * Created by macro on 2018/9/30.
 */
public interface UmsRolePermissionRelationDao {
    /**
     * Bulk Insert Roles and Permission Relations
     */
    int insertList(@Param("list") List<UmsRolePermissionRelation> list);

    /**
     * Get permissions based on roles
     */
    List<UmsPermission> getPermissionList(@Param("roleId") Long roleId);
}
