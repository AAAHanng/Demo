package com.example.service;

import com.example.entity.User;

import java.util.List;

/**
 * @Author AAAHanng
 * @Description: TODO
 */
public interface UserService {

    User userFindById(int id);
    List<User> findAllUser();
    String addUser(User user);
    String updateUser(int id ,User user);
    String deleteUser(int id);

}
