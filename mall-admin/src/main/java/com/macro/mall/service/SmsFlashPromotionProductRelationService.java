package com.macro.mall.service;

import com.macro.mall.dto.SmsFlashPromotionProduct;
import com.macro.mall.model.SmsFlashPromotionProductRelation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Limited time purchase association management service
 * Created by macro on 2018/11/16.
 */
public interface SmsFlashPromotionProductRelationService {
    /**
     * Add association in bulk
     */
    @Transactional
    int create(List<SmsFlashPromotionProductRelation> relationList);

    /**
     * Modify related information
     */
    int update(Long id, SmsFlashPromotionProductRelation relation);

    /**
     * Delete association
     */
    int delete(Long id);

    /**
     * Get related details
     */
    SmsFlashPromotionProductRelation getItem(Long id);

    /**
     * Check related product and promotion information by page
     *
     * @param flashPromotionId        Limited Time Purchase id
     * @param flashPromotionSessionId Limited Time Purchase id
     */
    List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum);

    /**
     * Number of relationships based on event and event id
     *
     * @param flashPromotionId
     * @param flashPromotionSessionId
     * @return
     */
    long getCount(Long flashPromotionId, Long flashPromotionSessionId);
}
