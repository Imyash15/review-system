package com.example.ReviewSystem.controller;

import com.example.ReviewSystem.entities.Hotel;
import com.example.ReviewSystem.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @PostMapping("/hotel")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel hotel1 = hotelService.createHotel(hotel);

        return new ResponseEntity<Hotel>(hotel1, HttpStatus.CREATED);
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){

        Hotel hotelById = hotelService.getHotelById(hotelId);
        return ResponseEntity.ok(hotelById);
    }

}

