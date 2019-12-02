package com.wpp.cloud.client.rule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * 自定义策略，只调用第一个
 */
public class MyRule implements IRule {
    private ILoadBalancer iLoadBalancer;

    @Override
    public Server choose(Object o) {
        List<Server> servers = iLoadBalancer.getAllServers();
        for (Server server : servers) {
            System.out.println("server:" + server.getHostPort());
        }
        return servers.get(0);

    }

    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        this.iLoadBalancer = iLoadBalancer;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return iLoadBalancer;
    }
}
