package com.jws.mango.consumer.hystrix;

import com.jws.mango.consumer.feign.MangoProducerService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class MangoProducerHystrix implements MangoProducerService {

    @RequestMapping("/hello")
    @Override
    public String hello() {
        return "Sorry, hello service call failed";
    }
}
