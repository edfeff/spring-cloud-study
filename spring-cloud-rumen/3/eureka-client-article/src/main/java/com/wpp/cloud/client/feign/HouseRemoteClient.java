package com.wpp.cloud.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "EUREKA-CLIENT-HOUSE", configuration = FeignLoggerConfiguration.class)
public interface HouseRemoteClient {
    @GetMapping("/user/hello")
    String hello();
}
