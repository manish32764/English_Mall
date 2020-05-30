package com.macro.mall.portal.component;

import com.macro.mall.portal.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by macro on 2018/8/24.
 * Timer for order timeout cancellation and unlocking inventory
 */
@Component
public class OrderTimeOutCancelTask {
    private Logger LOGGER = LoggerFactory.getLogger(OrderTimeOutCancelTask.class);
    @Autowired
    private OmsPortalOrderService portalOrderService;

    /**
     * cron expression: Seconds Minutes Hours DayofMonth DayofWeek [Year]
     * Scan every 10 minutes to scan orders placed before the set timeout time out and cancel the order if not paid
     */
    @Scheduled(cron = "0 0/10 * ? * ?")
    private void cancelTimeOutOrder() {
        Integer count = portalOrderService.cancelTimeOutOrder();
        LOGGER.info("Cancel order, release locked inventory according to sku number, cancel order quantity: {}", count);
    }
}
