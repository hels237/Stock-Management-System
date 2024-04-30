package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Builder
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cmdeClient")
public class CmdeClient extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "dateCmde")
    private Instant dateCmde;;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @Column(name = "etat_cmde")
    @Enumerated(EnumType.STRING)
    private EtatCmde etat;

    @OneToMany(mappedBy = "cmdeClient")
    @Column(name = "ligneCmde")
    private List<LigneCmdeClient> ligneCmde;


    public CmdeClient() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instant getDateCmde() {
        return dateCmde;
    }

    public void setDateCmde(Instant dateCmde) {
        this.dateCmde = dateCmde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public EtatCmde getEtat() {
        return etat;
    }

    public void setEtat(EtatCmde etat) {
        this.etat = etat;
    }

    public List<LigneCmdeClient> getLigneCmde() {
        return ligneCmde;
    }

    public void setLigneCmde(List<LigneCmdeClient> ligneCmde) {
        this.ligneCmde = ligneCmde;
    }


}
