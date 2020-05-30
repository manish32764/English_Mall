package com.macro.mall.dto;

import com.macro.mall.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * Added parameters for updating product categories
 * Created by macro on 2018/4/26.
 */
public class PmsProductCategoryParam {
    @ApiModelProperty("Parent Category Number")
    private Long parentId;
    @ApiModelProperty(value = "Product Category Name", required = true)
    @NotEmpty(message = "Product Category Name cannot be empty")
    private String name;
    @ApiModelProperty("Category Unit")
    private String productUnit;
    @ApiModelProperty("Whether to show in navigation bar")
    @FlagValidator(value = {"0", "1"}, message = "status can only be 0 or 1")
    private Integer navStatus;
    @ApiModelProperty("Whether to display")
    @FlagValidator(value = {"0", "1"}, message = "status can only be 0 or 1")
    private Integer showStatus;
    @ApiModelProperty("Sort")
    @Min(value = 0, message = "Sort minimum 0")
    private Integer sort;
    @ApiModelProperty("icon")
    private String icon;
    @ApiModelProperty("keyword")
    private String keywords;
    @ApiModelProperty("Description")
    private String description;
    @ApiModelProperty("Product Related Collection of Selected Properties")
    private List<Long> productAttributeIdList;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public Integer getNavStatus() {
        return navStatus;
    }

    public void setNavStatus(Integer navStatus) {
        this.navStatus = navStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Long> getProductAttributeIdList() {
        return productAttributeIdList;
    }

    public void setProductAttributeIdList(List<Long> productAttributeIdList) {
        this.productAttributeIdList = productAttributeIdList;
    }
}
