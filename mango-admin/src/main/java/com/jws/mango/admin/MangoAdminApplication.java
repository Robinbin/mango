package com.jws.mango.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.jws.mango.admin"})
@EnableDiscoveryClient
public class MangoAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(MangoAdminApplication.class, args);
    }
}
