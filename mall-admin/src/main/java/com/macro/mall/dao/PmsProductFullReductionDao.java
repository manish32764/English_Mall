package com.macro.mall.dao;

import com.macro.mall.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Custom goods full minus Dao
 * Created by macro on 2018/4/26.
 */
public interface PmsProductFullReductionDao {
    /**
     * Bulk Creation
     */
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
