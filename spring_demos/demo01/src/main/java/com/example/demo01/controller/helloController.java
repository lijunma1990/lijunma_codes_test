package com.example.demo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 李二白
 * @Description TODO
 * @Date 2023/8/8 14:20
 * @Version 1.0
 */
@RestController
public class helloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello world !";
    }
}
