package com.ourside.wxapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Czz
 * @Description TODO
 * @Date 2019-03-30 13:56
 * @Version 1.0
 */
@Configuration
public class WxAppConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
