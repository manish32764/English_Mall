package com.macro.mall.service;

import com.macro.mall.dto.OmsOrderReturnApplyResult;
import com.macro.mall.dto.OmsReturnApplyQueryParam;
import com.macro.mall.dto.OmsUpdateStatusParam;
import com.macro.mall.model.OmsOrderReturnApply;

import java.util.List;

/**
 * Return Request Management Service
 * Created by macro on 2018/10/18.
 */
public interface OmsOrderReturnApplyService {
    /**
     * Pageview Request
     */
    List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * Bulk Removal Request
     */
    int delete(List<Long> ids);

    /**
     * Change the status of the application
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * Obtain details of the specified application
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
