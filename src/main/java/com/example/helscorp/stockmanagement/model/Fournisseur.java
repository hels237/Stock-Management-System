package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Embedded //specify that this field are is composed
    private Adresse adresse;

    @Column(name = "mail")
    private String mail;

    @Column(name = "photo")
    private String photo;

    @Column(name = "numTel")
    private String numTel;

    @OneToMany(mappedBy = "fournisseur")
    private List<CmdeFournisseur> cmdeFournisseurs;


}
