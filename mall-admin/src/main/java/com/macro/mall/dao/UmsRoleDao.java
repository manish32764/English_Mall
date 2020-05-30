package com.macro.mall.dao;

import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Custom background role management Dao
 * Created by macro on 2020/2/2.
 */
public interface UmsRoleDao {
    /**
     * Get menus based on background user ID
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);

    /**
     * Get menus based on role ID
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Long roleId);

    /**
     * Get resources based on role ID
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Long roleId);
}
