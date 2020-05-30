package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class PmsProductAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productAttributeCategoryId;
    private String name;
    @ApiModelProperty(value = "attribute selection type: 0-> unique; 1-> single selection; 2-> multiple selection")
    private Integer selectType;
    @ApiModelProperty(value = "attribute entry method: 0-> manual entry; 1-> select from list")
    private Integer inputType;
    @ApiModelProperty(value = "list of optional values separated by commas")
    private String inputList;
    @ApiModelProperty(value = "Sort field: highest image can be uploaded individually")
    private Integer sort;
    @ApiModelProperty(value = "Category Selection Style: 1-> Normal; 1-> Color")
    private Integer filterType;
    @ApiModelProperty(value = "search type; 0-> do not require search; 1-> keyword search; 2-> range search")
    private Integer searchType;
    @ApiModelProperty(value = "the same attribute product is associated; 0-> not associated; 1-> associated")
    private Integer relatedStatus;
    @ApiModelProperty(value = "whether manual additions are supported; 0-> not supported; 1-> supported")
    private Integer handAddStatus;
    @ApiModelProperty(value = "type of attribute; 0-> specification; 1-> parameter")
    private Integer type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productAttributeCategoryId=").append(productAttributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", selectType=").append(selectType);
        sb.append(", inputType=").append(inputType);
        sb.append(", inputList=").append(inputList);
        sb.append(", sort=").append(sort);
        sb.append(", filterType=").append(filterType);
        sb.append(", searchType=").append(searchType);
        sb.append(", relatedStatus=").append(relatedStatus);
        sb.append(", handAddStatus=").append(handAddStatus);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
