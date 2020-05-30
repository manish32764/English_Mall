package com.macro.mall.service;

import com.macro.mall.dto.PmsProductParam;
import com.macro.mall.dto.PmsProductQueryParam;
import com.macro.mall.dto.PmsProductResult;
import com.macro.mall.model.PmsProduct;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Product Management Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductService {
    /**
     * Create a product
     */
    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED)
    int create(PmsProductParam productParam);

    /**
     * Update information based on product number
     */
    PmsProductResult getUpdateInfo(Long id);

    /**
     * Update product
     */
    @Transactional
    int update(Long id, PmsProductParam productParam);

    /**
     * Search products by page
     */
    List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum);

    /**
     * Bulk Modification of Review Status
     *
     * @param ids          Product ID
     * @param verifyStatus Review Status
     * @param detail       review details
     */
    @Transactional
    int updateVerifyStatus(List<Long> ids, Integer verifyStatus, String detail);

    /**
     * Modify listing status in bulk
     */
    int updatePublishStatus(List<Long> ids, Integer publishStatus);

    /**
     * Bulk revision of product recommendation status
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * Bulk modification of new product status
     */
    int updateNewStatus(List<Long> ids, Integer newStatus);

    /**
     * Delete items in bulk
     */
    int updateDeleteStatus(List<Long> ids, Integer deleteStatus);

    /**
     * Fuzzy search by product name or item number
     */
    List<PmsProduct> list(String keyword);
}
