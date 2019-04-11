package com.baizhi.demo1.service.impl;

import com.baizhi.demo1.dao.UserDao;
import com.baizhi.demo1.entity.User;
import com.baizhi.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;
    @Override
    public List<User> selectAll() {
        return dao.select();
    }
}
