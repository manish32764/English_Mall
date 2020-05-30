package com.macro.mall.service;

import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.dto.UpdateAdminPasswordParam;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsPermission;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Background Administrator Service
 * Created by macro on 2018/4/26.
 */
public interface UmsAdminService {
    /**
     * Obtain background administrator based on user name
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * Registration function
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * Login function
     *
     * @param username username
     * @param password password
     * @return Generated JWT token
     */
    String login(String username, String password);

    /**
     * The ability to refresh tokens
     *
     * @param oldToken old token
     */
    String refreshToken(String oldToken);

    /**
     * Get users based on user id
     */
    UmsAdmin getItem(Long id);

    /**
     * Search users by username or nickname
     */
    List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * Modification of specified user information
     */
    int update(Long id, UmsAdmin admin);

    /**
     * Delete the specified user
     */
    int delete(Long id);

    /**
     * Modify user role relationships
     */
    @Transactional
    int updateRole(Long adminId, List<Long> roleIds);

    /**
     * Gets the user's access to the role
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * Get access to resources for a specified user
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * Modify user's +- permissions
     */
    @Transactional
    int updatePermission(Long adminId, List<Long> permissionIds);

    /**
     * Get all user permissions (including role permissions and +- permissions)
     */
    List<UmsPermission> getPermissionList(Long adminId);

    /**
     * Change password
     */
    int updatePassword(UpdateAdminPasswordParam updatePasswordParam);

    /**
     * Obtain user information
     */
    UserDetails loadUserByUsername(String username);
}
