package com.example.demo.repos;

import com.example.demo.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ReviewRepo extends JpaRepository<Review, Long> {

    ArrayList<Review> findByUsername(String username);


}