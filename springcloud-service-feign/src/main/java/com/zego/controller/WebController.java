package com.zego.controller;

import com.zego.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private ProductService productService;

    @GetMapping("/web/hello")
    public String hello(){
        return productService.hello();
    }
}
