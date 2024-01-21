package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CurrentAssets;

public interface CurrentAssetsRepository extends JpaRepository<CurrentAssets , Long> {

}
