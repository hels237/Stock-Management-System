package com.example.helscorp.stockmanagement.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Builder
@Getter
@Setter
@Data
public class AdresseDto {

    private Integer id;

    private String adresse1;

    private String adresse2;

    private String ville;

    private String pays;

    private String codePostal;

    public AdresseDto() {
    }

    public AdresseDto(Integer id, String adresse1, String adresse2, String ville, String pays, String codePostal) {
        this.id = id;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.ville = ville;
        this.pays = pays;
        this.codePostal = codePostal;
    }





}
