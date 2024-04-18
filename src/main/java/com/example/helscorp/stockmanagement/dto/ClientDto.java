package com.example.helscorp.stockmanagement.dto;


import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ClientDto {

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String mail;

    private String photo;

    private String numTel;


    private List<CmdeClientDto> cmdeClients;
}
