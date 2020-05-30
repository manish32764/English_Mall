package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberBrandAttention;

import java.util.List;

/**
 * Members pay attention to service
 * Created by macro on 2018/8/2.
 */
public interface MemberAttentionService {
    /**
     * Add attention
     */
    int add(MemberBrandAttention memberBrandAttention);

    /**
     * Unfollow
     */
    int delete(Long memberId, Long brandId);

    /**
     * Get user watch list
     */
    List<MemberBrandAttention> list(Long memberId);
}
