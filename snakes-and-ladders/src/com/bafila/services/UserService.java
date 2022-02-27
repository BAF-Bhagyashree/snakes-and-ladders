package com.bafila.services;

import com.bafila.models.User;
import com.bafila.repositories.UserRepository;

public class UserService {

    UserRepository userRepository= new UserRepository();

    public User createUser(String email, String password) {
        User user= new User();
        user.setEmail(email);
        user.setPassword(password);

        return userRepository.saveUser(user);

    }
}
