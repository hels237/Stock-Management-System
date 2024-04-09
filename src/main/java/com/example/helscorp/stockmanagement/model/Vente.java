package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "vente")
public class Vente extends AbstractEntity{
    @Column(name = "code")
    private String codeVente;
    @Column(name = "date_vente")
    private Instant dateVente;
    @Column(name = "commentaire")
    private String commentaire;
    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes;

    public Vente() {
    }


    public Vente(String codeVente, Instant dateVente, String commentaire, List<LigneVente> ligneVentes) {
        this.codeVente = codeVente;
        this.dateVente = dateVente;
        this.commentaire = commentaire;
        this.ligneVentes = ligneVentes;
    }

    public String getCodeVente() {
        return codeVente;
    }

    public void setCodeVente(String codeVente) {
        this.codeVente = codeVente;
    }

    public Instant getDateVente() {
        return dateVente;
    }

    public void setDateVente(Instant dateVente) {
        this.dateVente = dateVente;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public List<LigneVente> getLigneVentes() {
        return ligneVentes;
    }

    public void setLigneVentes(List<LigneVente> ligneVentes) {
        this.ligneVentes = ligneVentes;
    }
}
