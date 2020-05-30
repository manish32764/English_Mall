package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.ConfirmOrderResult;
import com.macro.mall.portal.domain.OrderParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * Front desk order management service
 * Created by macro on 2018/8/30.
 */
public interface OmsPortalOrderService {
    /**
     * Generate confirmation information based on the user's shopping cart information
     */
    ConfirmOrderResult generateConfirmOrder();

    /**
     * Generate orders based on submission information
     */
    @Transactional
    Map<String, Object> generateOrder(OrderParam orderParam);

    /**
     * Callback after successful payment
     */
    @Transactional
    Integer paySuccess(Long orderId);

    /**
     * Automatic cancellation of overtime orders
     */
    @Transactional
    Integer cancelTimeOutOrder();

    /**
     * Cancel a single overtime order
     */
    @Transactional
    void cancelOrder(Long orderId);

    /**
     * Send a late message to cancel the order
     */
    void sendDelayMessageCancelOrder(Long orderId);
}
