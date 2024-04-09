package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity{

    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Embedded //specify that this field are is composed
    private Adresse adresse;
    @Column(name = "mail")
    private String mail;
    @Column(name = "photo")
    private String photo;
    @Column(name = "numTel")
    private String numTel;
    @OneToMany(mappedBy = "fournisseur")
    private List<CmdeFournisseur> cmdeFournisseurs;

    public Fournisseur() {
    }

    public Fournisseur(String nom, String prenom, Adresse adresse, String mail, String photo, String numTel, List<CmdeFournisseur> cmdeFournisseurs) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.photo = photo;
        this.numTel = numTel;
        this.cmdeFournisseurs = cmdeFournisseurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public List<CmdeFournisseur> getCmdeFournisseurs() {
        return cmdeFournisseurs;
    }

    public void setCmdeFournisseurs(List<CmdeFournisseur> cmdeFournisseurs) {
        this.cmdeFournisseurs = cmdeFournisseurs;
    }
}
