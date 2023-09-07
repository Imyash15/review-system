package com.example.ReviewSystem.controller;

import com.example.ReviewSystem.entities.Rating;
import com.example.ReviewSystem.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class RatingController {
    @Autowired
    private RatingService ratingService;

    @PostMapping("/rating")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){

        Rating rating1 = ratingService.createRating(rating);
        return new ResponseEntity<Rating>(rating1, HttpStatus.CREATED);
    }

    @GetMapping("/rating/{ratingId}")
    public ResponseEntity<Rating> getRatingById(@PathVariable String ratingId){

        Rating rating = ratingService.gatRatingById(ratingId);
        return new ResponseEntity<Rating>(rating,HttpStatus.OK);
    }
}
