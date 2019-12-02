package com.wpp.cloud.client.controller;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.EurekaClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    EurekaClient eurekaClient;

    @GetMapping("/{instance}")
    public List<InstanceInfo> info(@PathVariable String instance) {
        List<InstanceInfo> instancesByVipAddress = eurekaClient.getInstancesByVipAddress(instance, false);
        return instancesByVipAddress;
    }
}

