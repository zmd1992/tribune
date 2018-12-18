package com.tribune.service;

import com.tribune.pojo.User;
import org.springframework.stereotype.Service;

public interface UserService {
    /**
     * 添加用户
     * @param user
     */
    public int addUser(User user);

    /**
     * 根据用户名查询密码
     * @param username
     * @return
     */
    public User findUserByUsername(String username);
}
