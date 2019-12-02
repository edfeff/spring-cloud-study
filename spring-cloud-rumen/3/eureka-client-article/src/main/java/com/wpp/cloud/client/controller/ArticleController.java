package com.wpp.cloud.client.controller;

import com.wpp.cloud.client.feign.HouseRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleController {
    @Value("${house.service.name}")
    private String house;


    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    HouseRemoteClient houseRemoteClient;


    @GetMapping("/instance")
    public Object instance() {
        ServiceInstance choose = loadBalancerClient.choose(house);
        return choose;
    }

    @GetMapping("/article/hello")
    public String hello() {
        return houseRemoteClient.hello();
//        return restTemplate.getForObject("http://" + house + "/user/hello", String.class);
    }

}
