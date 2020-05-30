package com.macro.mall.security.annotation;

import java.lang.annotation.*;

/**
 * Custom note, cached method with this note will throw an exception
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
