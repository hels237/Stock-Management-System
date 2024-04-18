package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{


    @Column(name = "code_article")
    private String codeArticle ;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prix_unitaireHt")
    private BigDecimal prixUnitaireHt;
    @Column(name = "taux_Tva")
    private BigDecimal tauxTva;
    @Column(name = "prix_UnitaireTtc")
    private BigDecimal prixUnitaireTtc;

    @Column(name = "urlPhoto")
    private String urlPhoto;

    @ManyToOne
    @JoinColumn(name = "IdCategory")
    private Category category;
    @OneToMany(mappedBy = "article")
    private List<LigneCmdeClient> ligneCmdeClients;
    @OneToMany(mappedBy = "article")
    private List<LigneCmdeFournisseur> ligneCmdeFournisseurs;
    @OneToMany(mappedBy = "article")
    private List<MvtStock> mvtStocks;

    @OneToMany(mappedBy = "article")
    private List<LigneVente> ligneVentes;


    public Article() {
    }


    public String getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public BigDecimal getPrixUnitaireHt() {
        return prixUnitaireHt;
    }

    public void setPrixUnitaireHt(BigDecimal prixUnitaireHt) {
        this.prixUnitaireHt = prixUnitaireHt;
    }

    public BigDecimal getTauxTva() {
        return tauxTva;
    }

    public void setTauxTva(BigDecimal tauxTva) {
        this.tauxTva = tauxTva;
    }

    public BigDecimal getPrixUnitaireTtc() {
        return prixUnitaireTtc;
    }

    public void setPrixUnitaireTtc(BigDecimal prixUnitaireTtc) {
        this.prixUnitaireTtc = prixUnitaireTtc;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<LigneCmdeClient> getLigneCmdeClients() {
        return ligneCmdeClients;
    }

    public void setLigneCmdeClients(List<LigneCmdeClient> ligneCmdeClients) {
        this.ligneCmdeClients = ligneCmdeClients;
    }

    public List<LigneCmdeFournisseur> getLigneCmdeFournisseurs() {
        return ligneCmdeFournisseurs;
    }

    public void setLigneCmdeFournisseurs(List<LigneCmdeFournisseur> ligneCmdeFournisseurs) {
        this.ligneCmdeFournisseurs = ligneCmdeFournisseurs;
    }

    public List<MvtStock> getMvtStocks() {
        return mvtStocks;
    }

    public void setMvtStocks(List<MvtStock> mvtStocks) {
        this.mvtStocks = mvtStocks;
    }

    public List<LigneVente> getLigneVentes() {
        return ligneVentes;
    }

    public void setLigneVentes(List<LigneVente> ligneVentes) {
        this.ligneVentes = ligneVentes;
    }
}
