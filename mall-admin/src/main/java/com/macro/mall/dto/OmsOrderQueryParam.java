package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * order query parameters
 * Created by macro on 2018/10/11.
 */
@Getter
@Setter
public class OmsOrderQueryParam {
    @ApiModelProperty(value = "order id")
    private String orderSn;
    @ApiModelProperty(value = "consignee name/number")
    private String receiverKeyword;
    @ApiModelProperty(value = "Orders Status: 0-> Pending Payment; 1-> To Ship; 2-> Shipped; 3-> Completed; 4-> Closed; 5 -> Invalid order")
    private Integer status;
    @ApiModelProperty(value = "order type: 0-> normal order; 1-> deal order")
    private Integer orderType;
    @ApiModelProperty(value = "order source: 0->PC orders; 1->app orders")
    private Integer sourceType;
    @ApiModelProperty(value = "order submission time")
    private String createTime;
}
