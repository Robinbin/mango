package com.jws.mango.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jws
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, JWS Mango!";
    }
}
