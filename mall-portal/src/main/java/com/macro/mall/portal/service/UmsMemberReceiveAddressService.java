package com.macro.mall.portal.service;

import com.macro.mall.model.UmsMemberReceiveAddress;

import java.util.List;

/**
 * User Address Management Service
 * Created by macro on 2018/8/28.
 */
public interface UmsMemberReceiveAddressService {
    /**
     * Add shipping address
     */
    int add(UmsMemberReceiveAddress address);

    /**
     * Delete Ship To Address
     *
     * @param id id id of address table
     */
    int delete(Long id);

    /**
     * Change shipping address
     *
     * @param id      id id of address table
     * @param address modified shipping address information
     */
    int update(Long id, UmsMemberReceiveAddress address);

    /**
     * Returns the shipping address of the current user
     */
    List<UmsMemberReceiveAddress> list();

    /**
     * Get address details
     *
     * @param id Address id
     */
    UmsMemberReceiveAddress getItem(Long id);
}
