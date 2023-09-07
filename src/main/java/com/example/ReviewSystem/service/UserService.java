package com.example.ReviewSystem.service;

import com.example.ReviewSystem.entities.User;
import com.example.ReviewSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


public User createUser(User user){
   return userRepository.save(user);
}

public User getUserById(String userId){
    User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("UserID not found"));

    return user;
}
}
