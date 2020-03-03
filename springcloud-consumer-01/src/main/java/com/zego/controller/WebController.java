package com.zego.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/web/hello")
    //, commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMiliseconds", value = "2000")}
//    @HystrixCommand(fallbackMethod = "error")
    @HystrixCommand(fallbackMethod = "error", commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")})
    public String hello() {
        return restTemplate.getForObject("http://SPRINGCLOUD-PRODUCER/web/hello", String.class);
    }

    public String error() {
        System.out.println("error");
        return "error";
    }
}
