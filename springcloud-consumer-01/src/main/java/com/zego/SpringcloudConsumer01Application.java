package com.zego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableCircuitBreaker
@EnableEurekaClient //开启断路器功能
@SpringBootApplication
public class SpringcloudConsumer01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConsumer01Application.class, args);
    }

}
