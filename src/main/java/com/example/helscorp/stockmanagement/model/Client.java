package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "client")
public class Client extends AbstractEntity{

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

    @OneToMany(mappedBy = "client")
    private List<CmdeClient> cmdeClients;


    public Client() {
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

    public List<CmdeClient> getCmdeClients() {
        return cmdeClients;
    }

    public void setCmdeClients(List<CmdeClient> cmdeClients) {
        this.cmdeClients = cmdeClients;
    }
}
