package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cmdeClient")
public class CmdeClient extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "dateCmde")
    private Instant dateCmde;;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @Column(name = "etat_cmde")
    @Enumerated(EnumType.STRING)
    private EtatCmde etat;

    @OneToMany(mappedBy = "cmdeClient")
    @Column(name = "ligneCmde")
    private List<LigneCmdeClient> ligneCmde;




}
