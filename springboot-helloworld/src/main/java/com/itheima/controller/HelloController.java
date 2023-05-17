package com.itheima.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hugaojun Email:nat17185546@163.com
 * @create 2023-05-06-[下午 2:51]-周六
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring boot !";
    }
}
