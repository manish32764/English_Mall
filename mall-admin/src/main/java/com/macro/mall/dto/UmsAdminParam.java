package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * User Login Parameters
 * Created by macro on 2018/4/26.
 */
@Getter
@Setter
public class UmsAdminParam {
    @ApiModelProperty(value = "username", required = true)
    @NotEmpty(message = "Username cannot be empty")
    private String username;
    @ApiModelProperty(value = "password", required = true)
    @NotEmpty(message = "Password cannot be empty")
    private String password;
    @ApiModelProperty(value = "User avatar")
    private String icon;
    @ApiModelProperty(value = "Mailbox")
    @Email(message = "Email format is illegal")
    private String email;
    @ApiModelProperty(value = "user nickname")
    private String nickName;
    @ApiModelProperty(value = "Remarks")
    private String note;
}
