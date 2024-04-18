package com.example.helscorp.stockmanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class UtilisateurDto {
    private Integer id;

    private String nom;

    private String prenom;

    private String emaill;

    private String motDePasse;

    private AdresseDto adresse;

    private String photo;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;



}
