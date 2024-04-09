package com.example.helscorp.stockmanagement.model;


import lombok.Builder;

@Builder
public enum TypeMvtStk {
    ENTREE,
    SORTIE,
    CORRECTION_POS,
    CORRECTION_NEG
}
