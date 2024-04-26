package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Adresse;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class AdresseDto {

    private Integer id;

    private String adresse1;

    private String adresse2;

    private String ville;

    private String pays;

    private String codePostal;

    public AdresseDto() {
    }

    public AdresseDto(Integer id, String adresse1, String adresse2, String ville, String pays, String codePostal) {
        this.id = id;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.ville = ville;
        this.pays = pays;
        this.codePostal = codePostal;
    }




  //----------------------- mapping entity entityDto -----------------------------
    public static AdresseDto fromEntity(Adresse adresse) {

        if (adresse == null) {
            return null;
            //todo throw an exception
        }
        AdresseDto adresseDto = new AdresseDto();
        adresseDto.setAdresse1(adresse.getAdresse1());
        adresseDto.setAdresse2(adresse.getAdresse2());
        adresseDto.setVille(adresse.getVille());
        adresseDto.setPays(adresse.getPays());

        return adresseDto;
    }

    public static Adresse toEntity(AdresseDto adresseDto){

        if(adresseDto == null){
            return null;
        }

        Adresse theAdresse = new Adresse();
        theAdresse.setAdresse1(adresseDto.getAdresse1());
        theAdresse.setAdresse2(adresseDto.getAdresse2());
        theAdresse.setVille(adresseDto.getVille());
        theAdresse.setPays(adresseDto.getPays());

        return  theAdresse;
    }


}
