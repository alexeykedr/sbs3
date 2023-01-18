package com.example.sbs3.repository;

import com.example.sbs3.model.StockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface StockRepository extends JpaRepository<StockEntity, String> {
}
