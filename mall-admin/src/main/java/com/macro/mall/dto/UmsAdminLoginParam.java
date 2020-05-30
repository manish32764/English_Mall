package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * User Login Parameters
 * Created by macro on 2018/4/26.
 */
public class UmsAdminLoginParam {
    @ApiModelProperty(value = "username", required = true)
    @NotEmpty(message = "Username cannot be empty")
    private String username;
    @ApiModelProperty(value = "password", required = true)
    @NotEmpty(message = "Password cannot be empty")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
