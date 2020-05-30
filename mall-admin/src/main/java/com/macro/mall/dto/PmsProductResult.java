package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * Search results returned when a single product is modified
 * Created by macro on 2018/4/26.
 */
public class PmsProductResult extends PmsProductParam {
    @ApiModelProperty("Parent id of Product Selected Category")
    private Long cateParentId;

    public Long getCateParentId() {
        return cateParentId;
    }

    public void setCateParentId(Long cateParentId) {
        this.cateParentId = cateParentId;
    }
}
