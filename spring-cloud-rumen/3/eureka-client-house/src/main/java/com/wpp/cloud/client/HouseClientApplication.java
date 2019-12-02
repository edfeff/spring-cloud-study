package com.wpp.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HouseClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseClientApplication.class, args);
    }

}
