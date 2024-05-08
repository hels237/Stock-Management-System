package com.example.helscorp.stockmanagement.repository;

import com.example.helscorp.stockmanagement.model.CmdeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CmdeClientRepository extends JpaRepository<CmdeClient,Integer> {
}
