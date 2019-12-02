package com.wpp.cloud.client.controller;

import com.wpp.cloud.client.pojo.HouseInfo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/house")
public class HouseController {
    @GetMapping("/data")
    public HouseInfo getData(@RequestParam("name") String name) {
        return new HouseInfo(1, name, name, name);
    }

    @GetMapping("/data/{name}")
    public String getData2(@PathVariable("name") String name) {
        return name;
    }
}
