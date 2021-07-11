package com.example.usermanagement.controller;

import com.example.usermanagement.service.UserService;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

}
