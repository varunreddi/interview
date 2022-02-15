package com.example.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
