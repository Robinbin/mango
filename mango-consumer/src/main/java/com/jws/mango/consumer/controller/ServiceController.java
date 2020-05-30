package com.jws.mango.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RefreshScope
public class ServiceController {
    @Value("${hello}")
    private String hello;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("mango-producer");
    }

    @RequestMapping("/discover")
    public Object discover() {
        return loadBalancerClient.choose("mango-producer").getUri().toString();
    }

    @RequestMapping("/hello")
    public String hello() {
        return this.hello;
    }
}
