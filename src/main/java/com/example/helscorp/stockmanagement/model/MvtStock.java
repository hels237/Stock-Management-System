package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.Instant;


@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mvtStock")
public class MvtStock extends AbstractEntity{

    @Column(name = "date_mvt")
    private Instant dateMvt;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "type_mvt")
    @Enumerated(EnumType.STRING)
    private TypeMvtStk typeMvt;

    @Column(name = "source_mvt")
    @Enumerated(EnumType.STRING)
    private SourceMvtStk sourceMvt;

    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article article;




}
