package com.example.helscorp.stockmanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;


@Builder
@Data
public class ArticleDto {

    private String codeArticle ;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String urlPhoto;

    private CategoryDto category;


}
