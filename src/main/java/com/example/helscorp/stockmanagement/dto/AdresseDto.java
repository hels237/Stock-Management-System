package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Adresse;
import lombok.Data;



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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }



    public AdresseDto fromEntity(Adresse adresse) {

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



    public Adresse toEntity(AdresseDto adresseDto){

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
