package com.macro.mall.service;

import com.macro.mall.model.SmsHomeAdvertise;

import java.util.List;

/**
 * Home Page Ad Management Service
 * Created by macro on 2018/11/7.
 */
public interface SmsHomeAdvertiseService {
    /**
     * Add ads
     */
    int create(SmsHomeAdvertise advertise);

    /**
     * Bulk Delete Ads
     */
    int delete(List<Long> ids);

    /**
     * Change up and down status
     */
    int updateStatus(Long id, Integer status);

    /**
     * Get ad details
     */
    SmsHomeAdvertise getItem(Long id);

    /**
     * Updated ads
     */
    int update(Long id, SmsHomeAdvertise advertise);

    /**
     * Page Search Ads
     */
    List<SmsHomeAdvertise> list(String name, Integer type, String endTime, Integer pageSize, Integer pageNum);
}
