package com.example.springboot.service;


import com.example.springboot.model.User;

import java.util.List;

public interface UserService {

    void createUser(User user);

    List<User> readAllUser();

    User readUserById(Long id);

    void deleteUserById(Long id);
}
