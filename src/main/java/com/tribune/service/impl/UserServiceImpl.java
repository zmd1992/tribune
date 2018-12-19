package com.tribune.service.impl;

import com.tribune.mapper.UserMapper;
import com.tribune.pojo.MyGarden;
import com.tribune.pojo.User;
import com.tribune.service.UserService;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * created by zhangmengdan
 * created at 2018/12/16 23:12
 * 接口实现类
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {

        return userMapper.insertUser(user);
    }

    @Override
    public User findUserByUsername(String username) {
        return userMapper.findUserByUsername(username);
    }

    @Override
    public int modifyUserByUserId(Integer id) {
        return userMapper.updateUserById(id);
    }

    @Override
    public List<User> findUserList() {
        return userMapper.selectUserList();
    }
}
