package com.wpp.cloud.bootdemo.endpoint;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
public class AppHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        builder.withDetail("自定义的信息--1", "1");
        builder.withDetail("自定义的信息--2", "2");
        builder.withDetail("自定义的信息--3", "3");
        builder.withDetail("自定义的信息--4", "4");
    }
}
