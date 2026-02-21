package com.app.ecom.service;

import com.app.ecom.model.UserCustom;
import com.app.ecom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void addUser(UserCustom user) {
        userRepository.save(user);
    }

    public List<UserCustom> getUsers(){
        return userRepository.findAll();
    }
}
