package com.tribune.service.impl;

import com.tribune.dao.UserDao;
import com.tribune.dao.impl.UserDaoImpl;
import com.tribune.pojo.User;
import com.tribune.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * created by zhangmengdan
 * created at 2018/12/16 23:12
 **/
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public User findById(Integer id) {
        User user = userDao.findById(id);
        return user;
    }
}
