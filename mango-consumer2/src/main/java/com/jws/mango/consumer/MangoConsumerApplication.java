package com.jws.mango.consumer;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServlet;

@SpringBootApplication(scanBasePackages = {"com.jws.mango.consumer"})
@EnableDiscoveryClient
@EnableFeignClients
public class MangoConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MangoConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ServletRegistrationBean getServlet() {
        HttpServlet hystrixMetricsStreamServlet = new HystrixMetricsStreamServlet();

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean<>(hystrixMetricsStreamServlet, "/hystrix.stream");
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setName("HystrixMetricsStreamServlet");

        return servletRegistrationBean;
    }
}
