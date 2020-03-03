package com.zego.fallback;

import com.zego.service.ProductService;
import org.springframework.stereotype.Component;

@Component
public class MyFallback implements ProductService {
    @Override
    public String hello() {
        return "远程服务不可用，暂时采用本地逻辑代替";
    }
}
