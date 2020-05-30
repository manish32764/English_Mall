package com.macro.mall.dao;

import com.macro.mall.model.PmsSkuStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Custom Product SKU Management Dao
 * Created by macro on 2018/4/26.
 */
public interface PmsSkuStockDao {
    /**
     * Bulk Insert Operation
     */
    int insertList(@Param("list") List<PmsSkuStock> skuStockList);

    /**
     * Bulk insert or replace operations
     */
    int replaceList(@Param("list") List<PmsSkuStock> skuStockList);
}
