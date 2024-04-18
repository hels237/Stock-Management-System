package com.example.helscorp.stockmanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {

    private VenteDto vente;

    private BigDecimal quantite;

    private ArticleDto article;

    private BigDecimal prixUnitaire;
}
