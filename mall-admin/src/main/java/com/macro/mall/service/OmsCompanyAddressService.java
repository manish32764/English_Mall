package com.macro.mall.service;

import com.macro.mall.model.OmsCompanyAddress;

import java.util.List;

/**
 * Ship To Address Pipe Service
 * Created by macro on 2018/10/18.
 */
public interface OmsCompanyAddressService {
    /**
     * Get all shipping addresses
     */
    List<OmsCompanyAddress> list();
}
