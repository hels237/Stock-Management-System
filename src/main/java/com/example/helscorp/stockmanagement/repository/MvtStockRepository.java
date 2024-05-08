package com.example.helscorp.stockmanagement.repository;

import com.example.helscorp.stockmanagement.model.MvtStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MvtStockRepository extends JpaRepository<MvtStock,Integer> {
}
