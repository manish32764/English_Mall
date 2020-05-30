package com.macro.mall.service;

import com.macro.mall.dto.PmsBrandParam;
import com.macro.mall.model.PmsBrand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Product Branding Service
 * Created by macro on 2018/4/26.
 */
public interface PmsBrandService {
    /**
     * Get all brands
     */
    List<PmsBrand> listAllBrand();

    /**
     * Create a brand
     */
    int createBrand(PmsBrandParam pmsBrandParam);

    /**
     * Modified Brand
     */
    @Transactional
    int updateBrand(Long id, PmsBrandParam pmsBrandParam);

    /**
     * Remove Brand
     */
    int deleteBrand(Long id);

    /**
     * Bulk Brand Removal
     */
    int deleteBrand(List<Long> ids);

    /**
     * Check the brand by page
     */
    List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize);

    /**
     * Get a brand
     */
    PmsBrand getBrand(Long id);

    /**
     * Modify display status
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * Modify Manufacturer Status
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
