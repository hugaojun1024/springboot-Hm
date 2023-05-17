package com.itheima.test;

import com.itheima.springboottest.SpringboottestApplication;
import com.itheima.springboottest.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hugaojun Email:nat17185546@163.com
 * @create 2023-05-09-[上午 11:18]-周二
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringboottestApplication.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testAdd() {
        userService.add();
    }
}
