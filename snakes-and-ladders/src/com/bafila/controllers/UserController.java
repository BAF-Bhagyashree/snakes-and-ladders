package com.bafila.controllers;

import com.bafila.models.User;
import com.bafila.services.UserService;

public class UserController {

    UserService userService= new UserService();

    public User createUser(String email, String password){
        return userService.createUser(email,password);
    }
}
