package com.example.ReviewSystem.repository;

import com.example.ReviewSystem.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {
}
