package com.macro.mall.search.service;

import com.macro.mall.search.domain.EsProduct;
import com.macro.mall.search.domain.EsProductRelatedInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Product Search Management Service
 * Created by macro on 2018/6/19.
 */
public interface EsProductService {
    /**
     * Import all products from the database to ES
     */
    int importAll();

    /**
     * Delete items based on id
     */
    void delete(Long id);

    /**
     * Create products based on id
     */
    EsProduct create(Long id);

    /**
     * Delete items in bulk
     */
    void delete(List<Long> ids);

    /**
     * Search for name or subtitle by keyword
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

    /**
     * Search for a name or subtitle composite query by keyword
     */
    Page<EsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort);

    /**
     * Recommended items based on product id
     */
    Page<EsProduct> recommend(Long id, Integer pageNum, Integer pageSize);

    /**
     * Get brands, categories, attributes related to search terms
     */
    EsProductRelatedInfo searchRelatedInfo(String keyword);
}
