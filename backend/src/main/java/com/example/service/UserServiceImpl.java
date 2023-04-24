package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author AAAHanng
 * @Description: TODO
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public User userFindById(int id) {
        return userDao.userFindById(id);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public String addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public String updateUser(int id, User user) {
        return userDao.updateUser(id,user);
    }

    @Override
    public String deleteUser(int id) {
        return userDao.deleteUser(id);
    }
}
