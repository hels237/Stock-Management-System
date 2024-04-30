package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.LigneCmdeClient;
import lombok.*;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LigneCmdeClientDto {

    private Integer id;

    private CmdeClientDto cmdeClient;

    private ArticleDto article;

    private BigDecimal prixUnitaire;

    private  BigDecimal quantite;




    public static LigneCmdeClientDto fromEntity(LigneCmdeClient ligneCmdeClient){

        if(ligneCmdeClient == null){
            return null;
            //todo throw an exception
        }
        LigneCmdeClientDto ligneCmdeClientDto = new LigneCmdeClientDto();
        ligneCmdeClientDto.setId(ligneCmdeClient.getId());
        ligneCmdeClientDto.setCmdeClient(CmdeClientDto.fromEntity(ligneCmdeClient.getCmdeClient()));
        ligneCmdeClientDto.setArticle(ArticleDto.fromEntity(ligneCmdeClient.getArticle()));
        ligneCmdeClientDto.setQuantite(ligneCmdeClient.getQuantite());
        ligneCmdeClientDto.setPrixUnitaire(ligneCmdeClient.getPrixUnitaire());

        return ligneCmdeClientDto;
    }

    public static LigneCmdeClient toEntity(LigneCmdeClientDto ligneCmdeClientDto){

        if(ligneCmdeClientDto == null){
            return null;
            //todo throw an exception
        }

        LigneCmdeClient ligneCmdeClient = new LigneCmdeClient();

        ligneCmdeClient.setId(ligneCmdeClientDto.getId());
        ligneCmdeClient.setCmdeClient(CmdeClientDto.toEntity(ligneCmdeClientDto.getCmdeClient()));
        ligneCmdeClient.setArticle(ArticleDto.toEntity(ligneCmdeClientDto.getArticle()));
        ligneCmdeClient.setQuantite(ligneCmdeClientDto.getQuantite());
        ligneCmdeClient.setPrixUnitaire(ligneCmdeClientDto.getPrixUnitaire());

        return ligneCmdeClient;
    }

}
