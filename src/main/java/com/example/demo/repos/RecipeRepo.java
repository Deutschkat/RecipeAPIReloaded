package com.example.demo.repos;

import com.example.demo.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface RecipeRepo extends JpaRepository<Recipe, Long> {

    ArrayList<Recipe> findByNameContaining(String name);


}