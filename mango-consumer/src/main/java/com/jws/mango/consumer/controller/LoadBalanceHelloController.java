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
public class LoadBalanceHelloController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    //    @HystrixCommand(fallbackMethod = "findByIdFallback")
    @RequestMapping("/lb/call")
    public String call() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("mango-producer");
        log.info("Service Address: {}", serviceInstance.getUri().toString());
        log.info("Service Name: {}", serviceInstance.getServiceId());

        String url = "http://" + serviceInstance.getServiceId() + ":" + serviceInstance.getPort() + "/hello";
        String callServiceResult = restTemplate.getForObject(url, String.class);
        log.info("Call Result: {}", callServiceResult);

        return callServiceResult;
    }
}
