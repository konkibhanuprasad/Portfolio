package com.portfolio.backend.controller;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.portfolio.backend.entity.User;
import com.portfolio.backend.repository.UserRepository;

public class AuthController {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public String register(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("ROLE_USER");
        userRepository.save(user);

        return "User Registered";
    }
}
