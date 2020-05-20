package com.jws.mango.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.jws.mango.producer"})
@EnableDiscoveryClient
public class MangoProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MangoProducerApplication.class, args);
    }
}
