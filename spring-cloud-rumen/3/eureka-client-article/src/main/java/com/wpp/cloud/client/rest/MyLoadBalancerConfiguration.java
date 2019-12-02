package com.wpp.cloud.client.rest;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//@Configuration
public class MyLoadBalancerConfiguration {

    @MyLoadBalancer
    @Autowired
    private List<RestTemplate> restTemplates = Collections.emptyList();

    public MyLoadBalancerInterceptor myLoadBalancerInterceptor() {
        return new MyLoadBalancerInterceptor();
    }

    @Bean
    public SmartInitializingSingleton smartInitializingSingleton() {
        return new SmartInitializingSingleton() {
            @Override
            public void afterSingletonsInstantiated() {
                for (RestTemplate restTemplate : restTemplates) {
                    List<ClientHttpRequestInterceptor> interceptors = new ArrayList<>(restTemplate.getInterceptors());
                    interceptors.add(myLoadBalancerInterceptor());
                    restTemplate.setInterceptors(interceptors);
                }
            }
        };
    }

}
