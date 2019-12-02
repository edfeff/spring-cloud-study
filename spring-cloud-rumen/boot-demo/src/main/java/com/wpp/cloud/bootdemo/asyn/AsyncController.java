package com.wpp.cloud.bootdemo.asyn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/async")
public class AsyncController {
    @Autowired
    AsyncHandler handler;

    @GetMapping("/m1")
    public String m1() {
        handler.asyncM1();
        return "hello async m1";
    }
}
