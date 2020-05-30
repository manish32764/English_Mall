package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Confirm receipt submission parameters
 * Created by macro on 2018/10/18.
 */
@Getter
@Setter
public class OmsUpdateStatusParam {
    @ApiModelProperty("Service Number")
    private Long id;
    @ApiModelProperty("Ship to address association id")
    private Long companyAddressId;
    @ApiModelProperty("Confirm Refund amount")
    private BigDecimal returnAmount;
    @ApiModelProperty("Processing Comments")
    private String handleNote;
    @ApiModelProperty("Processor")
    private String handleMan;
    @ApiModelProperty("Receipt Remarks")
    private String receiveNote;
    @ApiModelProperty("consignee")
    private String receiveMan;
    @ApiModelProperty("Request Status: 1-> In Return; 2-> Completed; 3-> Rejected")
    private Integer status;
}
