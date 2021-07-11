package com.example.usermanagement.controller;

import com.example.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

}
