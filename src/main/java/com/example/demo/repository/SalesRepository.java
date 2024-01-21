package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long> {
    // You can add custom query methods if needed
}
