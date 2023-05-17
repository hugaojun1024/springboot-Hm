package com.itheima.springbootinit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hugaojun Email:nat17185546@163.com
 * @create 2023-05-06-[下午 3:47]-周六
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Autowired
    private Environment env;

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello() {
        return "hello Spring Boot 222 !";
    }

    @RequestMapping("/hello2")
    public String hello2() {
        System.out.println(name);
        System.out.println("person.name");

        System.out.println("-------------------------------------------");

        System.out.println(env.getProperty("name"));
        System.out.println(env.getProperty("address[0]"));

        System.out.println("-------------------------------------------");

        System.out.println(person);
        String[] address = person.getAddress();
        for (String s : address) {
            System.out.println(s);
        }
        return "hello Spring Boot 222 !";
    }
}
