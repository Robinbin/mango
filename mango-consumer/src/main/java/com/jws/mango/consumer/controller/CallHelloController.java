package com.jws.mango.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class CallHelloController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/call")
    public String call() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("mango-producer");
        log.info("Service Address: {}", serviceInstance.getHost());
        log.info("Service Name: {}", serviceInstance.getServiceId());

        String callServiceResult = new RestTemplate().getForObject(serviceInstance.getUri().toString() + "/hello", String.class);
        log.info("Call Result: {}", callServiceResult);

        return callServiceResult;
    }
}
