package com.wpp.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.wpp.cloud.client")
public class ArticleClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleClientApplication.class, args);
    }

}
