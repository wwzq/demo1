package com.baizhi.demo1.dao;

import com.baizhi.demo1.entity.User;

import java.util.List;

public interface UserDao {
    List<User> select();
}
