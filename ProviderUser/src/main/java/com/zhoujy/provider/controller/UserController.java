package com.zhoujy.provider.controller;

import com.zhoujy.provider.repository.UserRepository;
import com.zhoujy.provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable("id") Long id) {
         return this.userRepository.findById(id);
    }
}
