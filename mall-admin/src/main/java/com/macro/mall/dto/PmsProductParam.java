package com.macro.mall.dto;

import com.macro.mall.model.*;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Parameters used when creating and modifying products
 * Created by macro on 2018/4/26.
 */
public class PmsProductParam extends PmsProduct {
    @ApiModelProperty("Ladder Price Settings")
    private List<PmsProductLadder> productLadderList;
    @ApiModelProperty("Item Full Price Reduction Set")
    private List<PmsProductFullReduction> productFullReductionList;
    @ApiModelProperty("Product Member Price Settings")
    private List<PmsMemberPrice> memberPriceList;
    @ApiModelProperty("sku inventory information for the product")
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("Product Parameters and Custom Specification Properties")
    private List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("Thematic and Commodity Relations")
    private List<CmsSubjectProductRelation> subjectProductRelationList;
    @ApiModelProperty("The relationship between the preferred area and the product")
    private List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;

    public List<PmsProductLadder> getProductLadderList() {
        return productLadderList;
    }

    public void setProductLadderList(List<PmsProductLadder> productLadderList) {
        this.productLadderList = productLadderList;
    }

    public List<PmsProductFullReduction> getProductFullReductionList() {
        return productFullReductionList;
    }

    public void setProductFullReductionList(List<PmsProductFullReduction> productFullReductionList) {
        this.productFullReductionList = productFullReductionList;
    }

    public List<PmsMemberPrice> getMemberPriceList() {
        return memberPriceList;
    }

    public void setMemberPriceList(List<PmsMemberPrice> memberPriceList) {
        this.memberPriceList = memberPriceList;
    }

    public List<PmsSkuStock> getSkuStockList() {
        return skuStockList;
    }

    public void setSkuStockList(List<PmsSkuStock> skuStockList) {
        this.skuStockList = skuStockList;
    }

    public List<PmsProductAttributeValue> getProductAttributeValueList() {
        return productAttributeValueList;
    }

    public void setProductAttributeValueList(List<PmsProductAttributeValue> productAttributeValueList) {
        this.productAttributeValueList = productAttributeValueList;
    }

    public List<CmsSubjectProductRelation> getSubjectProductRelationList() {
        return subjectProductRelationList;
    }

    public void setSubjectProductRelationList(List<CmsSubjectProductRelation> subjectProductRelationList) {
        this.subjectProductRelationList = subjectProductRelationList;
    }

    public List<CmsPrefrenceAreaProductRelation> getPrefrenceAreaProductRelationList() {
        return prefrenceAreaProductRelationList;
    }

    public void setPrefrenceAreaProductRelationList(List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList) {
        this.prefrenceAreaProductRelationList = prefrenceAreaProductRelationList;
    }
}
