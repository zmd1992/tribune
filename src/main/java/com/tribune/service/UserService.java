package com.tribune.service;

import com.tribune.pojo.User;

import java.util.List;

public interface UserService {
    /**
     * 添加用户
     *
     * @param user
     */
    public int addUser(User user);

    /**
     * 根据用户名查询密码
     *
     * @param username
     * @return
     */
    public User findUserByUsername(String username);

    /**
     * 通过ID修改用户信息
     *
     * @param id
     * @return
     */
    public int modifyUserByUserId(Integer id);

    /**
     * 查询用户列表
     *
     * @return
     */
    public List<User> findUserList();

    /**
     * 根据用户ID集合查询用户
     */
    public List<User> findUserListByIds(List<Integer> ids);
    /**
     * 通过用户ID获取用户信息
     */
    public User findUserById(Integer id);

    /**
     * 根据用户名查询用户名是否重复
     * @return
     */
    public List<User> checkUserNameRepeat(String  userName);


}
