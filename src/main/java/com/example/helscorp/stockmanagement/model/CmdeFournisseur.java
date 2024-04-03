package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cmdeFournisseur")
public class CmdeFournisseur extends AbstractEntity{
    @Column(name = "date_cmde")
    private Instant dateCmde;
    @Column(name = "code")
    private String code;
    @Column(name = "etat_cmde")
    @Enumerated(EnumType.STRING)
    private EtatCmde etat;
    @ManyToOne
    @JoinColumn(name = "fournisseurId")
    private Fournisseur fournisseur;
    @OneToMany(mappedBy = "cmdeFournisseur")
    private List<LigneCmdeFournisseur> ligneCmdeFournisseurs;

    public CmdeFournisseur() {
    }

    public Instant getDateCmde() {
        return dateCmde;
    }

    public void setDateCmde(Instant dateCmde) {
        this.dateCmde = dateCmde;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public EtatCmde getEtat() {
        return etat;
    }

    public void setEtat(EtatCmde etat) {
        this.etat = etat;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public List<LigneCmdeFournisseur> getLigneCmdeFournisseurs() {
        return ligneCmdeFournisseurs;
    }

    public void setLigneCmdeFournisseurs(List<LigneCmdeFournisseur> ligneCmdeFournisseurs) {
        this.ligneCmdeFournisseurs = ligneCmdeFournisseurs;
    }
}
