package com.example.ReviewSystem.repository;

import com.example.ReviewSystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
