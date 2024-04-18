package com.example.helscorp.stockmanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Builder
@Data
public class LigneCmdeClientDto {

    private Integer id;

    private CmdeClientDto cmdeClient;

    private ArticleDto article;

    private BigDecimal prixUnitaire;

    private  BigDecimal quantite;

}
