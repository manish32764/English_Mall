package com.macro.mall.dto;

import com.macro.mall.validator.FlagValidator;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

/**
 * Brand Communication Parameters
 * Created by macro on 2018/4/26.
 */
public class PmsBrandParam {
    @ApiModelProperty(value = "brand name", required = true)
    @NotEmpty(message = "Name cannot be empty")
    private String name;
    @ApiModelProperty(value = "brand initials")
    private String firstLetter;
    @ApiModelProperty(value = "sort field")
    @Min(value = 0, message = "Sort minimum 0")
    private Integer sort;
    @ApiModelProperty(value = "Manufacturer Manufacturer")
    @FlagValidator(value = {"0", "1"}, message = "Manufacturer status is incorrect")
    private Integer factoryStatus;
    @ApiModelProperty(value = "whether to display")
    @FlagValidator(value = {"0", "1"}, message = "display status is incorrect")
    private Integer showStatus;
    @ApiModelProperty(value = "brand logo", required = true)
    @NotEmpty(message = "Brand logo cannot be empty")
    private String logo;
    @ApiModelProperty(value = "Brand larger")
    private String bigPic;
    @ApiModelProperty(value = "Brand Story")
    private String brandStory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFactoryStatus() {
        return factoryStatus;
    }

    public void setFactoryStatus(Integer factoryStatus) {
        this.factoryStatus = factoryStatus;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory;
    }
}
