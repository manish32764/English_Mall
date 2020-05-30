package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.OmsOrderReturnApplyParam;

/**
 * Return of Orders Management Service
 * Created by macro on 2018/10/17.
 */
public interface OmsPortalOrderReturnApplyService {
    /**
     * ። Submit application
     */
    int create(OmsOrderReturnApplyParam returnApply);
}
