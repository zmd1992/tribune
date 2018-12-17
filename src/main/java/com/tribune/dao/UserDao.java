package com.tribune.dao;

import com.tribune.pojo.User;

public interface UserDao {
    public User findById(Integer id);
}
