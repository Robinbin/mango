package com.jws.mango.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.jws.mango.consumer"})
@EnableDiscoveryClient
public class MangoConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MangoConsumerApplication.class, args);
    }
}
