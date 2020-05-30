package com.macro.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Request Return Parameters
 * Created by macro on 2018/10/17.
 */
@Getter
@Setter
public class OmsOrderReturnApplyParam {
    @ApiModelProperty("order id")
    private Long orderId;
    @ApiModelProperty("Return Item ID")
    private Long productId;
    @ApiModelProperty("order number")
    private String orderSn;
    @ApiModelProperty("Member Username")
    private String memberUsername;
    @ApiModelProperty("Returner Name")
    private String returnName;
    @ApiModelProperty("Returnee Phone")
    private String returnPhone;
    @ApiModelProperty("Product Image")
    private String productPic;
    @ApiModelProperty("Product Name")
    private String productName;
    @ApiModelProperty("Product Brand")
    private String productBrand;
    @ApiModelProperty("Product sales attribute: color: red; size: xl;")
    private String productAttr;
    @ApiModelProperty("Return Quantity")
    private Integer productCount;
    @ApiModelProperty("Unit Price")
    private BigDecimal productPrice;
    @ApiModelProperty("Item actually paid unit price")
    private BigDecimal productRealPrice;
    @ApiModelProperty("Reason")
    private String reason;
    @ApiModelProperty("Description")
    private String description;
    @ApiModelProperty("Certificate pictures separated by commas")
    private String proofPics;

}
