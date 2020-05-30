package com.macro.mall.dao;

import com.macro.mall.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Custom Product and Thematic Relationship Operations Dao
 * Created by macro on 2018/4/26.
 */
public interface CmsSubjectProductRelationDao {
    /**
     * Bulk Creation
     */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
