package com.macro.mall.service;

import com.macro.mall.model.SmsFlashPromotion;

import java.util.List;

/**
 * Limited Time Purchase Event Management Service
 * Created by macro on 2018/11/16.
 */
public interface SmsFlashPromotionService {
    /**
     * Add Activity
     */
    int create(SmsFlashPromotion flashPromotion);

    /**
     * Modification of designated activities
     */
    int update(Long id, SmsFlashPromotion flashPromotion);

    /**
     * Delete a single activity
     */
    int delete(Long id);

    /**
     * Change the status of the up-down-line
     */
    int updateStatus(Long id, Integer status);

    /**
     * Get details
     */
    SmsFlashPromotion getItem(Long id);

    /**
     * pagination query activity
     */
    List<SmsFlashPromotion> list(String keyword, Integer pageSize, Integer pageNum);
}
