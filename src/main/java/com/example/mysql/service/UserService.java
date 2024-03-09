package com.example.mysql.service;

import com.example.mysql.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mysql.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public Iterable<Users> getAllUsers(){
        return userRepository.findAll();
    }
}
