package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Fournisseur;
import lombok.*;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FournisseurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String mail;

    private String photo;

    private String numTel;

    private List<CmdeFournisseurDto> cmdeFournisseurs;




    public static FournisseurDto fromEntity(Fournisseur fournisseur){
        if(fournisseur == null){
            return null;
            //todo throw an exception
        }

        FournisseurDto fournisseurDto = new FournisseurDto();
        fournisseurDto.setId(fournisseur.getId());
        fournisseurDto.setNom(fournisseur.getNom());
        fournisseurDto.setPrenom(fournisseur.getPrenom());
        fournisseurDto.setMail(fournisseur.getMail());
        fournisseurDto.setPhoto(fournisseur.getPhoto());
        fournisseurDto.setAdresse(AdresseDto.fromEntity(fournisseur.getAdresse()));
        fournisseurDto.setNumTel(fournisseur.getNumTel());

        return fournisseurDto;
    }


    public static Fournisseur toEntity(FournisseurDto fournisseurDto){
        if(fournisseurDto == null){
            return null;
            //todo throw an exception
        }

        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setAdresse(AdresseDto.toEntity(fournisseurDto.getAdresse()));
        fournisseur.setNumTel(fournisseurDto.getNumTel());

        return fournisseur;
    }
}
