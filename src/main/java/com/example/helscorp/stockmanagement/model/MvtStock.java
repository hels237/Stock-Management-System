package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;

@EqualsAndHashCode(callSuper = true)
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

    public MvtStock() {
    }

    public MvtStock(Instant dateMvt, BigDecimal quantite, TypeMvtStk typeMvt, SourceMvtStk sourceMvt, Article article) {
        this.dateMvt = dateMvt;
        this.quantite = quantite;
        this.typeMvt = typeMvt;
        this.sourceMvt = sourceMvt;
        this.article = article;
    }

    public Instant getDateMvt() {
        return dateMvt;
    }

    public void setDateMvt(Instant dateMvt) {
        this.dateMvt = dateMvt;
    }

    public BigDecimal getQuantite() {
        return quantite;
    }

    public void setQuantite(BigDecimal quantite) {
        this.quantite = quantite;
    }

    public TypeMvtStk getTypeMvt() {
        return typeMvt;
    }

    public void setTypeMvt(TypeMvtStk typeMvt) {
        this.typeMvt = typeMvt;
    }

    public SourceMvtStk getSourceMvt() {
        return sourceMvt;
    }

    public void setSourceMvt(SourceMvtStk sourceMvt) {
        this.sourceMvt = sourceMvt;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
