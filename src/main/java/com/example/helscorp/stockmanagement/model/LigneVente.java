package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ligneVente")
public class LigneVente extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "venteId")
    private Vente vente;

    @Column(name = "quantite")
    private BigDecimal quantite;
    @ManyToOne
    @JoinColumn(name = "articleId")
    private  Article article;
    @Column(name = "prix_unitaire")
    private  BigDecimal prixUnitaire;

    public LigneVente() {
    }

    public LigneVente(Vente vente, BigDecimal quantite, Article article, BigDecimal prixUnitaire) {
        this.vente = vente;
        this.quantite = quantite;
        this.article = article;
        this.prixUnitaire = prixUnitaire;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
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

}
