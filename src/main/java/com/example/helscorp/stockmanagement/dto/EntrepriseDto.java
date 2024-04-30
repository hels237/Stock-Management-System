package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Entreprise;
import lombok.*;

import java.util.List;


@NoArgsConstructor
@Getter
@Setter
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private AdresseDto adresse;

    private String codeFiscal;

    private String photo;

    private String email;

    private String numTel;

    private String steWeb;

    private List<UtilisateurDto> utilisateurs;


    public static EntrepriseDto fromEntity(Entreprise entreprise){
        if(entreprise == null){
            return  null;
            //todo throw an exception
        }
        EntrepriseDto entrepriseDto = new EntrepriseDto();
        entrepriseDto.setId(entreprise.getId());
        entrepriseDto.setNom(entreprise.getNom());
        entrepriseDto.setEmail(entreprise.getEmail());
        entrepriseDto.setAdresse(AdresseDto.fromEntity(entreprise.getAdresse()));
        entrepriseDto.setDescription(entreprise.getDescription());
        entrepriseDto.setNumTel(entreprise.getNumTel());
        entrepriseDto.setPhoto(entreprise.getPhoto());
        entrepriseDto.setSteWeb(entreprise.getSteWeb());

        return entrepriseDto;
    }

    public static Entreprise toEntity(EntrepriseDto entrepriseDto){
        if(entrepriseDto == null){
            return  null;
            //todo throw an exception
        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setNom(entrepriseDto.getNom());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setAdresse(AdresseDto.toEntity(entrepriseDto.getAdresse()));
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setNumTel(entrepriseDto.getNumTel());
        entreprise.setPhoto(entrepriseDto.getPhoto());
        entreprise.setSteWeb(entrepriseDto.getSteWeb());

        return entreprise;
    }
}
