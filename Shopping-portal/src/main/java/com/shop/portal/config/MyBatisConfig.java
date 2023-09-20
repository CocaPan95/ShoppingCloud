package com.shop.portal.config;

import com.shop.common.config.BaseMybatisPlusConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan({"com.shop.portal.mapper","com.shop.model.mapper"})
public class MyBatisConfig extends BaseMybatisPlusConfig {
}
