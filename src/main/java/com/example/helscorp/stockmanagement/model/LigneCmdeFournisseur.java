package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ligneCmdeFournisseur")
public class LigneCmdeFournisseur extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "cmdeFournisseurId")
    private CmdeFournisseur cmdeFournisseur;
    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article article;
    @Column(name = "prix_unitaire")
    private BigDecimal prixUnitaire;
    @Column(name = "quantite")
    private  BigDecimal quantite;


    public LigneCmdeFournisseur() {
    }

    public LigneCmdeFournisseur(CmdeFournisseur cmdeFournisseur, Article article, BigDecimal prixUnitaire, BigDecimal quantite) {
        this.cmdeFournisseur = cmdeFournisseur;
        this.article = article;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }


    public CmdeFournisseur getCmdeFournisseur() {
        return cmdeFournisseur;
    }

    public void setCmdeFournisseur(CmdeFournisseur cmdeFournisseur) {
        this.cmdeFournisseur = cmdeFournisseur;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }
}
