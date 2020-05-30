package com.macro.mall.dao;

import com.macro.mall.model.PmsProductLadder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Custom membership ladder price Dao
 * Created by macro on 2018/4/26.
 */
public interface PmsProductLadderDao {
    /**
     * Bulk Creation
     */
    int insertList(@Param("list") List<PmsProductLadder> productLadderList);
}
