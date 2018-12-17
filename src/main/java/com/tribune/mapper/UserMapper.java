package com.tribune.mapper;

import com.tribune.pojo.User;

/**
 * dao层
 */
public interface UserMapper {
    public User findById(Integer id);
    public int insertUser(User user);
}
