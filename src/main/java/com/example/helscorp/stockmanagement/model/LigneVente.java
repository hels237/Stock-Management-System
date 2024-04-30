package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
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


}
