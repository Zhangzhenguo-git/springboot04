package com.zhang.springboot04.dao;

import com.zhang.springboot04.entity.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户
     * @param user
     * @return
     * @throws Exception
     */
    int addUser(User user) throws Exception;

    /**
     * 获取用户信息
     * @return
     */
    List<User> getUser() throws Exception;

    /**
     * 根据id查询
     * @return
     * @throws Exception
     */
    User findById(int id) throws Exception;

    /**
     * 修改用户
     * @param user
     * @return
     */
    int reStartSelectUser(User user) throws Exception;

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    int toDelete(int id) throws Exception;
}
