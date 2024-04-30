package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vente")
public class Vente extends AbstractEntity{

    @Column(name = "code")
    private String codeVente;

    @Column(name = "date_vente")
    private Instant dateVente;

    @Column(name = "commentaire")
    private String commentaire;

    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVentes;

}
