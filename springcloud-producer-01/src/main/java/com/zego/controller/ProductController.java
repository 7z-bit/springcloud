package com.zego.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/web/hello")
    public String hello() {
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        int a = 10 / 0;

        return "hello, producer011";
    }
}
