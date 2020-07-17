package com.tao.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/index")
    public String index(){
        return System.getProperties().getProperty("os.name");
    }
}
