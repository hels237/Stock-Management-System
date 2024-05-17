package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
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





}
