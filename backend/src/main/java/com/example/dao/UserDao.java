package com.example.dao;

import com.example.entity.User;

import java.util.List;


public interface UserDao {

    User userFindById(int id);
    List<User> findAllUser();
    String addUser(User user);
    String updateUser(int id ,User user);
    String deleteUser(int id);

}
