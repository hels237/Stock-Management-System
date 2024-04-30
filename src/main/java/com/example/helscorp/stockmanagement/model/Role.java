package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "role")
public class Role extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name = "utilisateurId")
    private Utilisateur utilisateur;

    @Column(name = "role_name")
    private String roleName;




}
