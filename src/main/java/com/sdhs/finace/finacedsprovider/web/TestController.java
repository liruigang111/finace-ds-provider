package com.sdhs.finace.finacedsprovider.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Value("${server.port}")
    private String port;
    @PostMapping(value="/port")
    public void getPort(){
        System.out.println("端口号是---"+port);
    }


}
