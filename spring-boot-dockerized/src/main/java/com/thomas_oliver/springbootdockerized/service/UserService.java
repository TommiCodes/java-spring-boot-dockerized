package com.thomas_oliver.springbootdockerized.service;

import java.util.List;

import com.thomas_oliver.springbootdockerized.model.User;
import com.thomas_oliver.springbootdockerized.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;


    public List<User> findAll () {
        return userRepository.findAll();
    }

    public User add(User user) {
        return userRepository.saveAndFlush(user);
    }


}
