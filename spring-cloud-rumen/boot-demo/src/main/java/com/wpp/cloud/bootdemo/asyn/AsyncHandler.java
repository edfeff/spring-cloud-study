package com.wpp.cloud.bootdemo.asyn;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@EnableAsync
@Component
public class AsyncHandler {
    @Async
    void asyncM1() {
        System.out.println(Thread.currentThread().getName() + ":async: M1");
    }
}
