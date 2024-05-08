package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;


@EqualsAndHashCode
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adresse {

    @Column(name = "adresse1")
    private String adresse1;

    @Column(name = "adresse2")
    private String adresse2;

    @Column(name = "ville")
    private String ville;

    @Column(name = "pays")
    private String pays;

    @Column(name = "code_postale")
    private String codePostal;


}
