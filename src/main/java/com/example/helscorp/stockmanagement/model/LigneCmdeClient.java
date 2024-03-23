package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "category")
public class LigneCmdeClient extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "cmdeClientId")
    private CmdeClient cmdeClient;
    @ManyToOne
    @JoinColumn(name = "articleId")
    private Article article;

}
