package com.example.ReviewSystem.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "rating")
public class Rating {
    @Id
    private  String ratingId= UUID.randomUUID().toString();
    private String userId;
    private String hotelId;
    private  int rating;
    private String feedback;
    @ManyToOne
    @JoinColumn(name = "hotelId",insertable=false, updatable=false)
    private Hotel hotel;

}
