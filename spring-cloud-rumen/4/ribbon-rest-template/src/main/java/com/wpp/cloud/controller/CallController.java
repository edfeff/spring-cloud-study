package com.wpp.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/call")
public class CallController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/data")
    public HouseInfo getData(@RequestParam("name") String name) {
        return restTemplate.getForObject("http://localhost:8181/house/data?name=" + name, HouseInfo.class);
    }

    @GetMapping("/data/{name}")
    public String getData2(@PathVariable("name") String name) {
        return restTemplate.getForObject("http://localhost:8181/house/data/{name}", String.class, name);
    }

}
