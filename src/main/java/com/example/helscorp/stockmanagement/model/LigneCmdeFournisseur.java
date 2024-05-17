package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
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




}
