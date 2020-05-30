package com.macro.mall.portal.domain;

import com.macro.mall.model.OmsOrder;
import com.macro.mall.model.OmsOrderItem;

import java.util.List;

/**
 * Details of the order containing the order item information
 * Created by macro on 2018/9/4.
 */
public class OmsOrderDetail extends OmsOrder {
    private List<OmsOrderItem> orderItemList;

    public List<OmsOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OmsOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
