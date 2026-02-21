package com.app.ecom.service;

import com.app.ecom.model.UserCustom;

import java.util.List;

public interface UserService {

    void addUser(UserCustom user);
    List<UserCustom> getUsers();
}
