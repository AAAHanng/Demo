package com.example.dao.Impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author AAAHanng
 * @Description: TODO
 */

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User userFindById(int id) {
        return userMapper.userFindById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public String addUser(User user) {
        int result = userMapper.addUser(user);
        return result == 1 ? "success" : "fail";
    }

    @Override
    public String updateUser(int id, User user) {
        user.setId(id);
        int result = userMapper.updateUser(user);
        return result == 1 ? "success" : "fail";
    }

    @Override
    public String deleteUser(int id) {
        int result = userMapper.deleteUser(id);
        return result == 1 ? "success" : "fail";
    }
}
