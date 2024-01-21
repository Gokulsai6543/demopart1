package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Ratios;

public interface RatiosRepository extends JpaRepository<Ratios, Integer> {
    // You can add custom query methods if needed
}
