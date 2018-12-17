package com.tribune.dao.impl;

import com.tribune.dao.UserDao;
import com.tribune.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by zhangmengdan
 * created at 2018/12/16 23:11
 **/
public class UserDaoImpl implements UserDao {
    @Autowired
    public UserDao userDao;

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }
}
