package com.abcd.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/hello")
    public String hello() {
        return demoService.returnString();
    }

    @RequestMapping("/ehsan")
    public String hello1() {
        throw new RuntimeException("Runtime error");
    }
}
