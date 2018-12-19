package com.tribune.service;

import com.tribune.pojo.MyGarden;
import com.tribune.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 通过ID修改用户信息
     * @param id
     * @return
     */
    public int modifyUserByUserId(Integer id);

    /**
     * 查询用户列表
     * @return
     */
    public List<User> findUserList();



}
