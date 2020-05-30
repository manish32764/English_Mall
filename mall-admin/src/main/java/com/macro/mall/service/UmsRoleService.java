package com.macro.mall.service;

import com.macro.mall.model.UmsMenu;
import com.macro.mall.model.UmsPermission;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Background Role Management Service
 * Created by macro on 2018/9/30.
 */
public interface UmsRoleService {
    /**
     * Add Roles
     */
    int create(UmsRole role);

    /**
     * Modify role information
     */
    int update(Long id, UmsRole role);

    /**
     * Bulk Delete Roles
     */
    int delete(List<Long> ids);

    /**
     * Gets permissions for the specified role
     */
    List<UmsPermission> getPermissionList(Long roleId);

    /**
     * Modify the permissions of the specified role
     */
    @Transactional
    int updatePermission(Long roleId, List<Long> permissionIds);

    /**
     * Get a list of all roles
     */
    List<UmsRole> list();

    /**
     * Page to get a list of roles
     */
    List<UmsRole> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * Get the corresponding menu based on administrator ID
     */
    List<UmsMenu> getMenuList(Long adminId);

    /**
     * Get Role-Related Menus
     */
    List<UmsMenu> listMenu(Long roleId);

    /**
     * Get Role-related Resources
     */
    List<UmsResource> listResource(Long roleId);

    /**
     * Assign menus to roles
     */
    @Transactional
    int allocMenu(Long roleId, List<Long> menuIds);

    /**
     * Assign resources to roles
     */
    @Transactional
    int allocResource(Long roleId, List<Long> resourceIds);
}
