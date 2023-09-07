package com.example.ReviewSystem.controller;

import com.example.ReviewSystem.entities.User;
import com.example.ReviewSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1 = userService.createUser(user);
        return new ResponseEntity<>(user1, HttpStatus.CREATED);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable String userId){
        User userById = userService.getUserById(userId);
        return ResponseEntity.ok(userById);
    }
}
