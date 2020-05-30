package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Orders modify consignee information parameters
 * Created by macro on 2018/10/29.
 */
@Getter
@Setter
public class OmsReceiverInfoParam {
    @ApiModelProperty(value = "order ID")
    private Long orderId;
    @ApiModelProperty(value = "consignee name")
    private String receiverName;
    @ApiModelProperty(value = "consignee phone")
    private String receiverPhone;
    @ApiModelProperty(value = "consignee postcode")
    private String receiverPostCode;
    @ApiModelProperty(value = "detailed address")
    private String receiverDetailAddress;
    @ApiModelProperty(value = "Province/Municipality")
    private String receiverProvince;
    @ApiModelProperty(value = "city")
    private String receiverCity;
    @ApiModelProperty(value = "zone")
    private String receiverRegion;
    @ApiModelProperty(value = "Orders Status: 0-> Pending Payment; 1-> To Ship; 2-> Shipped; 3-> Completed; 4-> Closed; 5 -> Invalid order")
    private Integer status;
}
