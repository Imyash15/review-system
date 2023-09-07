package com.example.ReviewSystem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "hotel")
public class Hotel {

    @Id
    private String hotelId= UUID.randomUUID().toString();
    private String name;
    private String location;
    private String about;



}
