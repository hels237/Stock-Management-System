package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "role")
public class Role extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "utilisateurId")
    private Utilisateur utilisateur;

    @Column(name = "role_name")
    private String roleName;


    public Role() {}


    public Utilisateur getUtilisateur() {
        return utilisateur;
    }


    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }


    public String getRoleName() {
        return roleName;
    }


    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }



}
