package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ProfitAndLoss;

public interface ProfitAndLossRepository extends JpaRepository<ProfitAndLoss, Long> {
    // You can add custom query methods if needed

}