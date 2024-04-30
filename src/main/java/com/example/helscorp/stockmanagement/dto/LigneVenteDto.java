package com.example.helscorp.stockmanagement.dto;
import com.example.helscorp.stockmanagement.model.LigneVente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Setter
@Getter
@NoArgsConstructor
public class LigneVenteDto {

    private Integer id;

    private VenteDto vente;

    private BigDecimal quantite;

    private ArticleDto article;

    private BigDecimal prixUnitaire;



    public  static  LigneVenteDto fromEntity(LigneVente ligneVente){
        if(ligneVente == null){
            return null;
            //todo throw an exception
        }

        LigneVenteDto ligneVenteDto = new LigneVenteDto();
        ligneVenteDto.setId(ligneVente.getId());
        ligneVenteDto.setQuantite(ligneVente.getQuantite());
        ligneVenteDto.setPrixUnitaire(ligneVente.getPrixUnitaire());
        ligneVenteDto.setArticle(ArticleDto.fromEntity(ligneVente.getArticle()));

        return ligneVenteDto;
    }



    public  static  LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if(ligneVenteDto == null){
            return null;
            //todo throw an exception
        }

        LigneVente ligneVente = new LigneVente();
        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setQuantite(ligneVenteDto.getQuantite());
        ligneVente.setPrixUnitaire(ligneVenteDto.getPrixUnitaire());
        ligneVente.setArticle(ArticleDto.toEntity(ligneVenteDto.getArticle()));

        return ligneVente;
    }




}
