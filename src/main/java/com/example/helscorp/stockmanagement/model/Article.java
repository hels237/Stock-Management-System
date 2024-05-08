package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
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

    @Column(name = "urlPhoto")
    private String urlPhoto;

    @ManyToOne
    @JoinColumn(name = "IdCategory")
    private Category category;

    @OneToMany(mappedBy = "article")
    private List<LigneCmdeClient> ligneCmdeClients;

    @OneToMany(mappedBy = "article")
    private List<LigneCmdeFournisseur> ligneCmdeFournisseurs;

    @OneToMany(mappedBy = "article")
    private List<MvtStock> mvtStocks;

    @OneToMany(mappedBy = "article")
    private List<LigneVente> ligneVentes;






}
