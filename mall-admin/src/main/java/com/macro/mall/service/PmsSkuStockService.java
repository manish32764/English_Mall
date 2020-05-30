package com.macro.mall.service;

import com.macro.mall.model.PmsSkuStock;

import java.util.List;

/**
 * sku goods inventory management service
 * Created by macro on 2018/4/27.
 */
public interface PmsSkuStockService {
    /**
     * Fuzzy search based on product id and skuCode
     */
    List<PmsSkuStock> getList(Long pid, String keyword);

    /**
     * Update product inventory information in bulk
     */
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
