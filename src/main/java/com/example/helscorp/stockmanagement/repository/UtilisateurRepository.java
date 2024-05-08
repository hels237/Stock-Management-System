package com.example.helscorp.stockmanagement.repository;

import com.example.helscorp.stockmanagement.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
