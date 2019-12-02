package com.wpp.cloud.client.config;

import com.wpp.cloud.client.rest.MyLoadBalancer;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {
    @Bean
    @LoadBalanced
//    @MyLoadBalancer
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
