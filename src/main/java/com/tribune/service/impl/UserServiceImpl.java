package com.tribune.service.impl;

import com.tribune.mapper.UserMapper;
import com.tribune.pojo.User;
import com.tribune.service.UserService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * created by zhangmengdan
 * created at 2018/12/16 23:12
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Resource
    private UserMapper userMapper;

    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public int addUser(User user) {

        return userMapper.insertUser(user);
    }
}
