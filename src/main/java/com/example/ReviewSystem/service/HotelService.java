package com.example.ReviewSystem.service;

import com.example.ReviewSystem.entities.Hotel;
import com.example.ReviewSystem.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
@Autowired
private HotelRepository hotelRepository;

public Hotel createHotel(Hotel hotel){
   return hotelRepository.save(hotel);
}

public Hotel getHotelById(String hotelId){
   Hotel hotel = hotelRepository.findById(hotelId).orElseThrow(() -> new RuntimeException("Hotel not found"));
   return  hotel;
}
}
