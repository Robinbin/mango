package com.jws.mango.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(scanBasePackages = {"com.jws.mango.zuul"})
@EnableZuulProxy
public class MangoZuulApplication {
    public static void main(String[] args) {
        //TODO: Can't access the service via zuul
        SpringApplication.run(MangoZuulApplication.class, args);
    }
}
