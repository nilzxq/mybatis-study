package com.nilzxq.dao;

import com.nilzxq.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {

    List<User> getUserLike(String value);

    /**
     * 查询全部用户
     */
    List<User> getUserList();

    /**
     *   根据ID查询用户
     */
    User getUserById(int id);


    /**
     * insert一个用户
     */
    int addUser(User user);

    /**
     * 万能map
     * @param map
     * @return
     */
    int addUser2(Map<String,Object> map);

    /**
     * 修改用户
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     */
    int deleteUser(int id);
}
