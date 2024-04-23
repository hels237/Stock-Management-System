package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Article;

import java.math.BigDecimal;



public class ArticleDto {

    private Integer id;

    private String codeArticle ;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String urlPhoto;

    private CategoryDto category;

    public ArticleDto() {
    }

    public ArticleDto(Integer id, String codeArticle, String designation, BigDecimal prixUnitaireHt, BigDecimal tauxTva, BigDecimal prixUnitaireTtc, String urlPhoto, CategoryDto category) {
        this.id = id;
        this.codeArticle = codeArticle;
        this.designation = designation;
        this.prixUnitaireHt = prixUnitaireHt;
        this.tauxTva = tauxTva;
        this.prixUnitaireTtc = prixUnitaireTtc;
        this.urlPhoto = urlPhoto;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeArticle() {
        return codeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public BigDecimal getPrixUnitaireHt() {
        return prixUnitaireHt;
    }

    public void setPrixUnitaireHt(BigDecimal prixUnitaireHt) {
        this.prixUnitaireHt = prixUnitaireHt;
    }

    public BigDecimal getTauxTva() {
        return tauxTva;
    }

    public void setTauxTva(BigDecimal tauxTva) {
        this.tauxTva = tauxTva;
    }

    public BigDecimal getPrixUnitaireTtc() {
        return prixUnitaireTtc;
    }

    public void setPrixUnitaireTtc(BigDecimal prixUnitaireTtc) {
        this.prixUnitaireTtc = prixUnitaireTtc;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }


    public ArticleDto fromEntity(Article article){

        if(article == null){
            return null;
            //todo throw an exception;
        }

        ArticleDto articleDto = new ArticleDto();
        articleDto.setId(article.getId());
        articleDto.setDesignation(article.getDesignation());
        articleDto.setTauxTva(article.getTauxTva());
        articleDto.setCodeArticle(article.getCodeArticle());
        articleDto.setPrixUnitaireHt(article.getPrixUnitaireHt());
        articleDto.setPrixUnitaireTtc(article.getPrixUnitaireTtc());
        articleDto.setUrlPhoto(article.getUrlPhoto());

        return articleDto;
    }

    public  Article toEntity(ArticleDto articleDto){
        if(articleDto == null){
            return  null ;
            //todo throw an exception;
        }
        Article theArticle = new Article();
        theArticle.setId(articleDto.getId());
        theArticle.setCodeArticle(articleDto.getCodeArticle());
        theArticle.setDesignation(articleDto.getDesignation());
        theArticle.setPrixUnitaireHt(articleDto.getPrixUnitaireHt());
        theArticle.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        theArticle.setTauxTva(articleDto.getTauxTva());
        theArticle.setUrlPhoto(articleDto.getUrlPhoto());

        return  theArticle;
    }

}
