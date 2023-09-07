package com.example.ReviewSystem.service;

import com.example.ReviewSystem.entities.Rating;
import com.example.ReviewSystem.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    @Autowired
    private RatingRepository ratingRepository;

    public Rating createRating(Rating rating){
        Rating save = ratingRepository.save(rating);
        return  save;
    }

    public Rating gatRatingById(String ratingId){
        Rating rating = ratingRepository.findById(ratingId).orElseThrow(() -> new RuntimeException("Rating ID not found"));
        return rating;
    }

}
