package com.baizhi.demo1.controller;

import com.baizhi.demo1.entity.User;
import com.baizhi.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("test")
@ResponseBody
public class TestController {
    @Autowired
    private UserService service;
    @RequestMapping("hello")
   public List<User> Hello(){
        final List<User> users = service.selectAll();
        System.out.println("Hello World!");
       return users;
   }
}
