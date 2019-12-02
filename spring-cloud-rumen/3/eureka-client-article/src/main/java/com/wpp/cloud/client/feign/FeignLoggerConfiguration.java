package com.wpp.cloud.client.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignLoggerConfiguration {
    @Bean
    public Logger.Level fullLoggerLevel() {
        return Logger.Level.FULL;
    }
}
