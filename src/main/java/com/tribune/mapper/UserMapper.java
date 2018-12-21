package com.tribune.mapper;

import com.tribune.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * dao层
 */
public interface UserMapper {
    public int insertUser(User user);

    User findUserByUsername(String username);
    public int updateUserById(Integer id);
    public List<User> selectUserList();
    public List<User> selectUserByIds(List<Integer> ids);
    public User selectUserById(Integer id);
}
