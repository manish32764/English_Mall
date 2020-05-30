package com.macro.mall.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * dynamic permissions related business classes
 * Created by macro on 2020/2/7.
 */
public interface DynamicSecurityService {
    /**
     * load resource ANT wildcard and resource corresponding MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}
