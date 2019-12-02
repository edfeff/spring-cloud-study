package com.wpp.cloud.client.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;

@RibbonClient(name = "EUREKA-CLIENT-HOUSE", configuration = RibbonConfiguration.class)
public class HouseServiceConfigration {
}
