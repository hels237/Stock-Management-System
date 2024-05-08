package com.example.helscorp.stockmanagement.repository;

import com.example.helscorp.stockmanagement.model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente,Integer> {
}
