package com.tribune.service;

import com.tribune.pojo.User;
import org.springframework.stereotype.Service;

public interface UserService {
    /**
     * 添加用户
     * @param user
     */
    public int addUser(User user);

    public User findById(Integer id);
}
