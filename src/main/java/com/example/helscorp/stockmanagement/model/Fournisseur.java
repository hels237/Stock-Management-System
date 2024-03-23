package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
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
    @OneToMany(mappedBy = "cmdeFournisseur")
    private List<CmdeFournisseur> cmdeFournisseurs;

}
