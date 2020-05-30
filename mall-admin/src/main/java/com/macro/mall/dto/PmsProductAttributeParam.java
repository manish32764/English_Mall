package com.macro.mall.dto;

import com.macro.mall.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * Product attribute parameters
 * Created by macro on 2018/4/26.
 */
public class PmsProductAttributeParam {
    @ApiModelProperty("Property Class ID")
    @NotEmpty(message = "attribute classification cannot be empty")
    private Long productAttributeCategoryId;
    @ApiModelProperty("attribute name")
    @NotEmpty(message = "attribute name cannot be empty")
    private String name;
    @ApiModelProperty("Property Selection Type: 0-> Unique; 1-> Single Select; 2-> Multiple Select")
    @FlagValidator({"0", "1", "2"})
    private Integer selectType;
    @ApiModelProperty("attribute entry method: 0-> manual entry; 1-> select from list")
    @FlagValidator({"0", "1"})
    private Integer inputType;
    @ApiModelProperty("list of optional values separated by commas")
    private String inputList;

    private Integer sort;
    @ApiModelProperty("Category Selection Style: 0-> Normal; 1-> Color")
    @FlagValidator({"0", "1"})
    private Integer filterType;
    @ApiModelProperty("search type; 0-> does not require search; 1-> keyword search; 2-> range search")
    @FlagValidator({"0", "1", "2"})
    private Integer searchType;
    @ApiModelProperty("Same attribute products associated; 0-> not associated; 1-> associated")
    @FlagValidator({"0", "1"})
    private Integer relatedStatus;
    @ApiModelProperty("Whether manual additions are supported; 0-> not supported; 1-> supported")
    @FlagValidator({"0", "1"})
    private Integer handAddStatus;
    @ApiModelProperty("Type of attribute; 0-> Specifications; 1-> Parameters")
    @FlagValidator({"0", "1"})
    private Integer type;

    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSelectType() {
        return selectType;
    }

    public void setSelectType(Integer selectType) {
        this.selectType = selectType;
    }

    public Integer getInputType() {
        return inputType;
    }

    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    public String getInputList() {
        return inputList;
    }

    public void setInputList(String inputList) {
        this.inputList = inputList;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFilterType() {
        return filterType;
    }

    public void setFilterType(Integer filterType) {
        this.filterType = filterType;
    }

    public Integer getSearchType() {
        return searchType;
    }

    public void setSearchType(Integer searchType) {
        this.searchType = searchType;
    }

    public Integer getRelatedStatus() {
        return relatedStatus;
    }

    public void setRelatedStatus(Integer relatedStatus) {
        this.relatedStatus = relatedStatus;
    }

    public Integer getHandAddStatus() {
        return handAddStatus;
    }

    public void setHandAddStatus(Integer handAddStatus) {
        this.handAddStatus = handAddStatus;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
