package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
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



}
