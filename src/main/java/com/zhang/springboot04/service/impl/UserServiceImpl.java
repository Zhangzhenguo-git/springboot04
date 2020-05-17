package com.zhang.springboot04.service.impl;

import com.zhang.springboot04.dao.UserMapper;
import com.zhang.springboot04.entity.User;
import com.zhang.springboot04.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

//添加服务
@Service
//添加事务
@Transactional
public class UserServiceImpl implements UserService {

//    数据注入
    @Resource
    private UserMapper userMapper;
    /**
     * 添加用户
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public int addUser(User user) throws Exception {
        return userMapper.addUser(user);
    }

    /**
     * 查询用户信息
     *
     * @return
     */
    @Override
    public List<User> getUser() throws Exception {
        return userMapper.getUser();
    }

    /**
     * 根据id查询信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public User findById(int id) throws Exception {
        return userMapper.findById(id);
    }

    /**
     * 修改用户信息
     *
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public int reStartSelectUser(User user) throws Exception {
        return userMapper.reStartSelectUser(user);
    }

    /**
     * 删除用户信息
     *
     * @param id
     * @return
     */
    @Override
    public int toDelete(int id) throws Exception {
        return userMapper.toDelete(id);
    }

}
