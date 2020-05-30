package com.macro.mall.dao;

import com.macro.mall.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Product parameters, product custom specification attribute Dao
 * Created by macro on 2018/4/26.
 */
public interface PmsProductAttributeValueDao {
    /**
     * Bulk Creation
     */
    int insertList(@Param("list") List<PmsProductAttributeValue> productAttributeValueList);
}
