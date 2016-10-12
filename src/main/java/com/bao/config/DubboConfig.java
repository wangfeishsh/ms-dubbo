package com.bao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.annotation.Order;

/**
 * Created by baochunyu on 2016/6/22.
 */
//@Order(100)
@Configuration
@ImportResource("classpath:application-dubbo-provider.xml")
public class DubboConfig {
}
