package com.zego.service;

import com.zego.fallback.MyFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SPRINGCLOUD-PRODUCER", fallback = MyFallback.class)
public interface ProductService {

    @GetMapping("/web/hello")
    public String hello();
}
