package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.LigneCmdeFournisseur;
import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LigneCmdeFournisseurDto {

    private Integer id;

    private CmdeFournisseurDto cmdeFournisseur;

    private ArticleDto article;

    private BigDecimal prixUnitaire;

    private  BigDecimal quantite;




    public static LigneCmdeFournisseurDto fromEntity(LigneCmdeFournisseur ligneCmdeFournisseur){

        if(ligneCmdeFournisseur == null){
            return null;
            //todo throw an exception
        }

        LigneCmdeFournisseurDto ligneCmdeFournisseurDto = new LigneCmdeFournisseurDto();
        ligneCmdeFournisseurDto.setId(ligneCmdeFournisseur.getId());
        ligneCmdeFournisseurDto.setQuantite(ligneCmdeFournisseur.getQuantite());
        ligneCmdeFournisseurDto.setPrixUnitaire(ligneCmdeFournisseur.getPrixUnitaire());
        ligneCmdeFournisseurDto.setCmdeFournisseur(CmdeFournisseurDto.fromEntity(ligneCmdeFournisseur.getCmdeFournisseur()));
        ligneCmdeFournisseurDto.setArticle(ArticleDto.fromEntity(ligneCmdeFournisseur.getArticle()));

        return ligneCmdeFournisseurDto;
    }

    public static LigneCmdeFournisseur toEntity(LigneCmdeFournisseurDto ligneCmdeFournisseurDto){

        if(ligneCmdeFournisseurDto == null){
            return null;
            //todo throw an exception
        }

        LigneCmdeFournisseur ligneCmdeFournisseur = new LigneCmdeFournisseur();
        ligneCmdeFournisseur.setId(ligneCmdeFournisseurDto.getId());
        ligneCmdeFournisseur.setQuantite(ligneCmdeFournisseurDto.getQuantite());
        ligneCmdeFournisseur.setPrixUnitaire(ligneCmdeFournisseurDto.getPrixUnitaire());
        ligneCmdeFournisseur.setCmdeFournisseur(CmdeFournisseurDto.toEntity(ligneCmdeFournisseurDto.getCmdeFournisseur()));
        ligneCmdeFournisseur.setArticle(ArticleDto.toEntity(ligneCmdeFournisseurDto.getArticle()));

        return ligneCmdeFournisseur;
    }
}
