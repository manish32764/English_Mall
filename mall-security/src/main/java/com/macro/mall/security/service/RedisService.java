package com.macro.mall.security.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * redis operation service
 * Created by macro on 2020/3/3.
 */
public interface RedisService {

    /**
     * Save attributes
     */
    void set(String key, Object value, long time);

    /**
     * Save attributes
     */
    void set(String key, Object value);

    /**
     * Get properties
     */
    Object get(String key);

    /**
     * Delete attributes
     */
    Boolean del(String key);

    /**
     * Bulk Delete Properties
     */
    Long del(List<String> keys);

    /**
     * Set Expiration Time
     */
    Boolean expire(String key, long time);

    /**
     * Obtain Expiration Time
     */
    Long getExpire(String key);

    /**
     * Determine if there is this attribute
     */
    Boolean hasKey(String key);

    /**
     * Incremental by delta
     */
    Long incr(String key, long delta);

    /**
     * Deducted by delta
     */
    Long decr(String key, long delta);

    /**
     * Get properties in Hash struct
     */
    Object hGet(String key, String hashKey);

    /**
     * Put an attribute into the Hash struct
     */
    Boolean hSet(String key, String hashKey, Object value, long time);

    /**
     * Put an attribute into the Hash struct
     */
    void hSet(String key, String hashKey, Object value);

    /**
     * Get the entire Hash structure directly
     */
    Map<Object, Object> hGetAll(String key);

    /**
     * Set the entire Hash structure directly
     */
    Boolean hSetAll(String key, Map<String, Object> map, long time);

    /**
     * Set the entire Hash structure directly
     */
    void hSetAll(String key, Map<String, Object> map);

    /**
     * Delete properties in the Hash structure
     */
    void hDel(String key, Object... hashKey);

    /**
     * Determine if the property is present in the Hash structure
     */
    Boolean hHasKey(String key, String hashKey);

    /**
     * attribute increment in Hash structure
     */
    Long hIncr(String key, String hashKey, Long delta);

    /**
     * Property reduction in Hash structure
     */
    Long hDecr(String key, String hashKey, Long delta);

    /**
     * Get Set structure
     */
    Set<Object> sMembers(String key);

    /**
     * Add properties to the Set structure
     */
    Long sAdd(String key, Object... values);

    /**
     * Add properties to the Set structure
     */
    Long sAdd(String key, long time, Object... values);

    /**
     * is a property in Set
     */
    Boolean sIsMember(String key, Object value);

    /**
     * Gets the length of the Set structure
     */
    Long sSize(String key);

    /**
     * Delete properties in Set structure
     */
    Long sRemove(String key, Object... values);

    /**
     * Get properties in List structure
     */
    List<Object> lRange(String key, long start, long end);

    /**
     * Gets the length of the List structure
     */
    Long lSize(String key);

    /**
     * Get attributes in List based on index
     */
    Object lIndex(String key, long index);

    /**
     * Add attributes to the List structure
     */
    Long lPush(String key, Object value);

    /**
     * Add attributes to the List structure
     */
    Long lPush(String key, Object value, long time);

    /**
     * Add properties in bulk to the List structure
     */
    Long lPushAll(String key, Object... values);

    /**
     * Add properties in bulk to the List structure
     */
    Long lPushAll(String key, Long time, Object... values);

    /**
     * Remove attributes from List structure
     */
    Long lRemove(String key, long count, Object value);
}
