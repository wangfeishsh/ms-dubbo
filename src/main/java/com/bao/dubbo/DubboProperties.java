package com.bao.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.dubbo")
public class DubboProperties {

    private ApplicationConfig application;
    private RegistryConfig    registry;
    private ProtocolConfig    protocol;


}
