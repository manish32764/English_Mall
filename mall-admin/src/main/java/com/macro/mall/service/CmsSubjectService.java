package com.macro.mall.service;

import com.macro.mall.model.CmsSubject;

import java.util.List;

/**
 * Product Thematic Service
 * Created by macro on 2018/6/1.
 */
public interface CmsSubjectService {
    /**
     * Inquiry on all topics
     */
    List<CmsSubject> listAll();

    /**
     * Paged search topic
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
