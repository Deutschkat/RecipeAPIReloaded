package com.example.demo.repos;

import com.example.demo.models.CustomUserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<CustomUserDetails, Long> {

    CustomUserDetails findByUsername(String username);
}