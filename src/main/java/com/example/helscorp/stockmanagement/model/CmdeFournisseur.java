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
@Table(name = "cmdeFournisseur")
public class CmdeFournisseur extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "fournisseurId")
    private Fournisseur fournisseur;
    @OneToMany(mappedBy = "cmdeFournisseur")
    private List<LigneCmdeFournisseur> ligneCmdeFournisseurs;

}
