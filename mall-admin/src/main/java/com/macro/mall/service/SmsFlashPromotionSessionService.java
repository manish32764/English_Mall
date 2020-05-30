package com.macro.mall.service;

import com.macro.mall.dto.SmsFlashPromotionSessionDetail;
import com.macro.mall.model.SmsFlashPromotionSession;

import java.util.List;

/**
 * Limited Time Purchase Management Service
 * Created by macro on 2018/11/16.
 */
public interface SmsFlashPromotionSessionService {
    /**
     * Add a session
     */
    int create(SmsFlashPromotionSession promotionSession);

    /**
     * Modification of sessions
     */
    int update(Long id, SmsFlashPromotionSession promotionSession);

    /**
     * Modifying the opening status of the session
     */
    int updateStatus(Long id, Integer status);

    /**
     * Delete the session
     */
    int delete(Long id);

    /**
     * Get details
     */
    SmsFlashPromotionSession getItem(Long id);

    /**
     * Get a list of trips based on enabled status
     */
    List<SmsFlashPromotionSession> list();

    /**
     * Get all available sessions and their number
     */
    List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId);
}
