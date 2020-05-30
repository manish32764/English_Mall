package com.macro.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * My Batis configuration class
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.macro.mall.mapper", "com.macro.mall.dao"})
public class MyBatisConfig {
}
