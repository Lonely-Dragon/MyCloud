package com.sakura.register.nacos.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
@RefreshScope
public class TestController {
    
    @Value("${name}")
    String test = "test";

//    @NacosValue(value = "${namesdf}" ,autoRefreshed = true)
//    String testboot;
    
    @Scheduled(cron = "*/1 * * * * *")
    @RequestMapping(value = "/go",method = RequestMethod.GET)
    public void test(){
        //cloud test
        System.out.println(test);
        
        //boot test
//        System.out.println(testboot);
    }
    
    
}
