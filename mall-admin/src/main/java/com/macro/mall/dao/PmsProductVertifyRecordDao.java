package com.macro.mall.dao;

import com.macro.mall.model.PmsProductVertifyRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Custom Product Review Log Management Dao
 * Created by macro on 2018/4/27.
 */
public interface PmsProductVertifyRecordDao {
    /**
     * Bulk Creation
     */
    int insertList(@Param("list") List<PmsProductVertifyRecord> list);
}
