package com.example.ReviewSystem.repository;

import com.example.ReviewSystem.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,String> {
}
