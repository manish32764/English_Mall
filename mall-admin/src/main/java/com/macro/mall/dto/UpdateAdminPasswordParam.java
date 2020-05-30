package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * Modify user name password parameters
 * Created by macro on 2019/10/9.
 */
@Getter
@Setter
public class UpdateAdminPasswordParam {
    @ApiModelProperty(value = "username", required = true)
    @NotEmpty(message = "Username cannot be empty")
    private String username;
    @ApiModelProperty(value = "old password", required = true)
    @NotEmpty(message = "Old password cannot be empty")
    private String oldPassword;
    @ApiModelProperty(value = "new password", required = true)
    @NotEmpty(message = "New password cannot be empty")
    private String newPassword;
}
