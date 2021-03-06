package com.macro.mall.portal.domain;

import lombok.Getter;

/**
 * Message Queuing Enumeration Configuration
 * Created by macro on 2018/9/14.
 */
@Getter
public enum QueueEnum {
    /**
     * Message Notification Queue
     */
    QUEUE_ORDER_CANCEL("mall.order.direct", "mall.order.cancel", "mall.order.cancel"),
    /**
     * Message notification ttl queue
     */
    QUEUE_TTL_ORDER_CANCEL("mall.order.direct.ttl", "mall.order.cancel.ttl", "mall.order.cancel.ttl");

    /**
     * Exchange Name
     */
    private String exchange;
    /**
     * Queue Name
     */
    private String name;
    /**
     * Routing Keys
     */
    private String routeKey;

    QueueEnum(String exchange, String name, String routeKey) {
        this.exchange = exchange;
        this.name = name;
        this.routeKey = routeKey;
    }
}
