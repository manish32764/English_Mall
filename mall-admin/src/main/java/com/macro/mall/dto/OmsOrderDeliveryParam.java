package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Orders shipping parameters
 * Created by macro on 2018/10/12.
 */
@Getter
@Setter
public class OmsOrderDeliveryParam {
    @ApiModelProperty("order id")
    private Long orderId;
    @ApiModelProperty("Logistics Company")
    private String deliveryCompany;
    @ApiModelProperty("Logistics Number")
    private String deliverySn;
}
