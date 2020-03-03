package com.zego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudProducer01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProducer01Application.class, args);
    }

}
