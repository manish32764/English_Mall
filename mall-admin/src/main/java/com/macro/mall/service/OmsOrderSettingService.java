package com.macro.mall.service;

import com.macro.mall.model.OmsOrderSetting;

/**
 * Orders Setup Service
 * Created by macro on 2018/10/16.
 */
public interface OmsOrderSettingService {
    /**
     * Get the specified order settings
     */
    OmsOrderSetting getItem(Long id);

    /**
     * Modify the specified order settings
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
