package com.bafila.repositories;

import com.bafila.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

private List<User> users= new ArrayList<>();

    public User saveUser(User user) {
        users.add(user);
        return user;
    }
}
