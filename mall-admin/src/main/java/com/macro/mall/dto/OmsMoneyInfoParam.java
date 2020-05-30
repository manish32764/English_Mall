package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Modifying the order fee information parameters
 * Created by macro on 2018/10/29.
 */
@Getter
@Setter
public class OmsMoneyInfoParam {
    @ApiModelProperty("order ID")
    private Long orderId;
    @ApiModelProperty("Shipping Fee")
    private BigDecimal freightAmount;
    @ApiModelProperty("Admin background adjust the discount amount used for orders")
    private BigDecimal discountAmount;
    @ApiModelProperty("Orders Status: 0-> Pending Payment; 1-> To Ship; 2-> Shipped; 3-> Completed; 4-> Closed; 5-> Inactive Orders")
    private Integer status;
}
