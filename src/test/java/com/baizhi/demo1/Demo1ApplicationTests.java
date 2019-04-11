package com.baizhi.demo1;

import com.baizhi.demo1.entity.User;
import com.baizhi.demo1.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.baizhi.demo1.dao")
public class Demo1ApplicationTests {
    @Autowired
    private UserService service;
    @Test
    public void contextLoads() {
        final List<User> users = service.selectAll();
        System.out.println(users);
    }

}
