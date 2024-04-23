package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Builder
@EqualsAndHashCode()
@Embeddable
public class Adresse {


    @Column(name = "adresse1")
    private String adresse1;
    @Column(name = "adresse2")
    private String adresse2;
    @Column(name = "ville")
    private String ville;
    @Column(name = "pays")
    private String pays;
    @Column(name = "code_postale")
    private String codePostal;


    public Adresse() {
    }

    public Adresse(String adresse1, String adresse2, String ville, String pays, String codePostal) {
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.ville = ville;
        this.pays = pays;
        this.codePostal = codePostal;
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
}
