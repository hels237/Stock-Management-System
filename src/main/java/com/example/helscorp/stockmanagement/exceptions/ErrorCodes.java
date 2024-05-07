package com.example.helscorp.stockmanagement.exceptions;

public enum ErrorCodes {

    ARTICLE_NOT_FOUND(1000),
    ARTICLE_NOT_VALID(1001),

    CATEGORY_NOT_FOUND(2000),
    CLIENT_NOT_FOUND(3000),
    CMDE_CLIENT_NOT_FOUND(4000),
    CMDE_FOURNISSEUR_NOT_FOUND(5000),
    ENTREPRISE_NOT_FOUND(6000),
    ETAT_CMDE_NOT_FOUND(7000),
    FOURNISSEUR_NOT_FOUND(8000),
    LIGNE_CMDE_FORNISSEUR_NOT_FOUND(9000),
    LIGNE_CMDE_CLIENT_FOUND(10000),
    MVT_STOCK_NOT_FOUND(11000),
    ROLE_NOT_FOUND(12000),
    SOURCE_MVTSTOCK_NOT_FOUND(13000),
    TYPEMVTSTOCK_NOT_FOUND(14000),
    UTILISATEUR_NOT_FOUND(15000),
    VENTE_NOT_FOUND(16000)
    ;

    private int code;

    ErrorCodes(int theCode){
        this.code = theCode;
    }

    public int getCode(){
        return this.code;
    }
}
