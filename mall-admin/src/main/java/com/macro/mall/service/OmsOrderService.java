package com.macro.mall.service;

import com.macro.mall.dto.*;
import com.macro.mall.model.OmsOrder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Orders Management Service
 * Created by macro on 2018/10/11.
 */
public interface OmsOrderService {
    /**
     * Orders Inquiry
     */
    List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * Bulk shipping
     */
    @Transactional
    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * Bulk Close Orders
     */
    @Transactional
    int close(List<Long> ids, String note);

    /**
     * Bulk Delete Orders
     */
    int delete(List<Long> ids);

    /**
     * Get the details of the specified order
     */
    OmsOrderDetail detail(Long id);

    /**
     * Modifying order consignee information
     */
    @Transactional
    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    /**
     * Modification of order fee information
     */
    @Transactional
    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    /**
     * Modification of order notes
     */
    @Transactional
    int updateNote(Long id, String note, Integer status);
}
