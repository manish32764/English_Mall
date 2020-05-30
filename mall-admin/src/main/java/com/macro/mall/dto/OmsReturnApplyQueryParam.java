package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * Orders return request query parameters
 * Created by macro on 2018/10/18.
 */
@Getter
@Setter
public class OmsReturnApplyQueryParam {
    @ApiModelProperty("Service Number")
    private Long id;
    @ApiModelProperty(value = "consignee name/number")
    private String receiverKeyword;
    @ApiModelProperty(value = "Request Status: 0-> Pending; 1-> Returned; 2-> Completed; 3-> Rejected")
    private Integer status;
    @ApiModelProperty(value = "Request time")
    private String createTime;
    @ApiModelProperty(value = "Processor")
    private String handleMan;
    @ApiModelProperty(value = "Handling Time")
    private String handleTime;
}
