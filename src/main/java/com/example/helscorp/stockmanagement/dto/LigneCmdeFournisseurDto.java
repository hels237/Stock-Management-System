package com.example.helscorp.stockmanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneCmdeFournisseurDto {

    private CmdeFournisseurDto cmdeFournisseur;

    private ArticleDto article;

    private BigDecimal prixUnitaire;

    private  BigDecimal quantite;
}
