package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ligneCmdeClient")
public class LigneCmdeClient extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "cmdeClientId")
    private CmdeClient cmdeClient;
    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article article;

    @Column(name = "prix_unitaire")
    private BigDecimal prixUnitaire;
    @Column(name = "quantite")
    private  BigDecimal quantite;

    public LigneCmdeClient() {
    }

    public LigneCmdeClient(CmdeClient cmdeClient, Article article, BigDecimal prixUnitaire, BigDecimal quantite) {
        this.cmdeClient = cmdeClient;
        this.article = article;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }

    public CmdeClient getCmdeClient() {
        return cmdeClient;
    }

    public void setCmdeClient(CmdeClient cmdeClient) {
        this.cmdeClient = cmdeClient;
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
