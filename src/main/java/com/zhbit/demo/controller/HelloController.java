package com.zhbit.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //该注解是 @Controller 和 @ResponseBody 注解的合体版
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot！";
    }
}
