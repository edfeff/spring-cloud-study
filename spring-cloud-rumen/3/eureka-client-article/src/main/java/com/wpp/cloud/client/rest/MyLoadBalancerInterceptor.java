package com.wpp.cloud.client.rest;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerRequestFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.net.URI;

public class MyLoadBalancerInterceptor implements ClientHttpRequestInterceptor {
    private LoadBalancerClient loadBalancerClient;
    private LoadBalancerRequestFactory factory;

    public MyLoadBalancerInterceptor() {
    }

    public MyLoadBalancerInterceptor(LoadBalancerClient loadBalancerClient, LoadBalancerRequestFactory factory) {
        this.loadBalancerClient = loadBalancerClient;
        this.factory = factory;
    }

    public MyLoadBalancerInterceptor(LoadBalancerClient loadBalancerClient) {
        this(loadBalancerClient, new LoadBalancerRequestFactory(loadBalancerClient));
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        URI uri = request.getURI();
        String serviceName = uri.getHost();
        System.out.println("进入自定义的请求拦截器中。。。" + serviceName);
        return loadBalancerClient.execute(serviceName, factory.createRequest(request, body, execution));
    }
}
