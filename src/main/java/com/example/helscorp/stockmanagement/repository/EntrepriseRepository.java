package com.example.helscorp.stockmanagement.repository;

import com.example.helscorp.stockmanagement.model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise,Integer> {
}
