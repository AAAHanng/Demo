package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author AAAHanng
 * @Description: TODO
 */


@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable int id){
        return userService.userFindById(id);
    }

    @GetMapping("/")
    public List<User> findAll(){
        return userService.findAllUser();
    }

    @DeleteMapping("{id}")
    public String removeUser(@PathVariable int id){
        return userService.deleteUser(id);
    }

    @PostMapping("/")
    public  String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public String putUser(@PathVariable int id,User user){
        return userService.updateUser(id,user);
    }
}
