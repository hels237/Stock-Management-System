package com.example.helscorp.stockmanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class VenteDto {

    private String codeVente;

    private Instant dateVente;

    private String commentaire;

    private List<LigneVenteDto> ligneVentes;

}
