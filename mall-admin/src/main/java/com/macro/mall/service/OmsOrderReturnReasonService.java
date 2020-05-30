package com.macro.mall.service;

import com.macro.mall.model.OmsOrderReturnReason;

import java.util.List;

/**
 * Orders Reason Management Service
 * Created by macro on 2018/10/17.
 */
public interface OmsOrderReturnReasonService {
    /**
     * Add reason for order
     */
    int create(OmsOrderReturnReason returnReason);

    /**
     * Change the reason for return
     */
    int update(Long id, OmsOrderReturnReason returnReason);

    /**
     * Bulk Removal Return Reason
     */
    int delete(List<Long> ids);

    /**
     * Pageable to get the reason for return
     */
    List<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum);

    /**
     * Bulk Change Reason Status
     */
    int updateStatus(List<Long> ids, Integer status);

    /**
     * Get details of individual reason for return
     */
    OmsOrderReturnReason getItem(Long id);
}
