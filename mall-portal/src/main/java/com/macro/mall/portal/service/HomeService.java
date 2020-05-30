package com.macro.mall.portal.service;

import com.macro.mall.model.CmsSubject;
import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.PmsProductCategory;
import com.macro.mall.portal.domain.HomeContentResult;

import java.util.List;

/**
 * Home Content Management Service
 * Created by macro on 2019/1/28.
 */
public interface HomeService {

    /**
     * Get the contents of the first page
     */
    HomeContentResult content();

    /**
     * First page product recommendation
     */
    List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum);

    /**
     * Get Product Categories
     *
     * @param parentId 0: Obtain Level 1 Classification; Other: Obtain Designated Level 2 Classification
     */
    List<PmsProductCategory> getProductCateList(Long parentId);

    /**
     * ። Obtain topics according to thematic categories
     *
     * @param cateId thematic category id
     */
    List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum);
}
