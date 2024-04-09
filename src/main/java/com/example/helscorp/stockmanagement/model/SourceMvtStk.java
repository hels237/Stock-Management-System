package com.example.helscorp.stockmanagement.model;

import lombok.Builder;

@Builder
public enum SourceMvtStk {
    COMMANDE_CLIENT,
    COMMANDE_FOURNISSEUR,
    VENTE
}
