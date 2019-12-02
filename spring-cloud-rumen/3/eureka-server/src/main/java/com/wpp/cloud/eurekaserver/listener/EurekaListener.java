package com.wpp.cloud.eurekaserver.listener;

import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaListener {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        System.out.println("==========取消注册==========: " + event.getAppName() + " : " + event.getServerId());
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        System.out.println("==========注册==========: " + event.getInstanceInfo().getInstanceId() + " : " + event.getLeaseDuration());
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
//        System.out.println("==========刷新注册==========: " + event.getAppName() + " : " + event.getServerId());
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        System.out.println("==========注册中心可用了==========");
    }


    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        System.out.println("==========server启动==========");
    }

}
