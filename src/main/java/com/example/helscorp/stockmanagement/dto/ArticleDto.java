package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Article;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Setter
@Getter
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





    public static ArticleDto fromEntity(Article article){

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

    public static Article toEntity(ArticleDto articleDto){
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
