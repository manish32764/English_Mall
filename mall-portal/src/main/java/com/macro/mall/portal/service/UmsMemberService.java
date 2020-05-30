package com.macro.mall.portal.service;

import com.macro.mall.model.UmsMember;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

/**
 * Member Management Service
 * Created by macro on 2018/8/3.
 */
public interface UmsMemberService {
    /**
     * Get members based on user name
     */
    UmsMember getByUsername(String username);

    /**
     * Get membership based on membership number
     */
    UmsMember getById(Long id);

    /**
     * User Registration
     */
    @Transactional
    void register(String username, String password, String telephone, String authCode);

    /**
     * Generate verification code
     */
    String generateAuthCode(String telephone);

    /**
     * Change password
     */
    @Transactional
    void updatePassword(String telephone, String password, String authCode);

    /**
     * Get the current login member
     */
    UmsMember getCurrentMember();

    /**
     * Modify membership points based on member id
     */
    void updateIntegration(Long id, Integer integration);


    /**
     * Obtain user information
     */
    UserDetails loadUserByUsername(String username);

    /**
     * Get token after login
     */
    String login(String username, String password);

    /**
     * Refresh token
     */
    String refreshToken(String token);
}
