package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{
    @Column(name = "code_article")
    private String codeArticle ;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prix_unitaireHt")
    private BigDecimal prixUnitaireHt;
    @Column(name = "taux_Tva")
    private BigDecimal tauxTva;
    @Column(name = "prix_UnitaireTtc")
    private BigDecimal prixUnitaireTtc;

    private String photo;




}
