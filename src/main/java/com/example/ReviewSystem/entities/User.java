package com.example.ReviewSystem.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    private String userId= UUID.randomUUID().toString();
    private String name;
    private  String email;
    private  String about;
    @OneToMany(targetEntity = Rating.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "userId",insertable=false, updatable=false)
    private List<Rating> ratingList=new ArrayList<>();


}
