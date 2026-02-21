package com.app.ecom.controller;

import com.app.ecom.model.UserCustom;
import com.app.ecom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/users")//http://localhost:8080/api/users
    public List<UserCustom> getAllUsers(){

        return userService.getUsers();
    }
    @PostMapping("/api/users")//http://localhost:8080/api/users
    public UserCustom createUser(@RequestBody UserCustom user) {
        userService.addUser(user);
        return user;
    }

}
