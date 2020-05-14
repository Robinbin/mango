package com.jws.mango.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jws.mango.admin"})
public class MangoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MangoWebApplication.class, args);
    }
}
