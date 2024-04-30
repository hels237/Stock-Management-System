package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Vente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenteDto {

    private Integer id;

    private String codeVente;

    private Instant dateVente;

    private String commentaire;

    private List<LigneVenteDto> ligneVentes;



    public static VenteDto fromEntity(Vente vente){
        if(vente == null){
            return null;
            //todo throw an exception
        }

        VenteDto venteDto = new VenteDto();
        venteDto.setId(vente.getId());
        venteDto.setDateVente(vente.getDateVente());
        venteDto.setCodeVente(vente.getCodeVente());
        venteDto.setCommentaire(vente.getCommentaire());

        return venteDto;

    }

    public static Vente toEntity(VenteDto venteDto){

        if(venteDto == null){
            return null;
            //todo throw an exception
        }

        Vente vente = new Vente();
        vente.setId(venteDto.getId());
        vente.setDateVente(venteDto.getDateVente());
        vente.setCodeVente(venteDto.getCodeVente());
        vente.setCommentaire(vente.getCommentaire());

        return vente;

    }

}
