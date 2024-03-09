package com.example.mysql.controllers;

import com.example.mysql.models.Users;
import com.example.mysql.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Iterable<Users> getAll(){
        return userService.getAllUsers();
    }
}
