package com.tribune.mapper;

import com.tribune.pojo.User;

/**
 * dao层
 */
public interface UserMapper {
    public int insertUser(User user);

    User findUserByUsername(String username);
    public int updateUserById(Integer id);
}
