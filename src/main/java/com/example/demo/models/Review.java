package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String username;

    private Integer rating;

    @NotNull
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private CustomUserDetails user;

    public String getAuthor() {
        return user.getUsername();
    }

    public void setRating(int rating) {
        if (rating <= 0 || rating > 10) {
            throw new IllegalStateException("Rating must be between 0 and 10.");
        }
        this.rating = rating;
    }
}