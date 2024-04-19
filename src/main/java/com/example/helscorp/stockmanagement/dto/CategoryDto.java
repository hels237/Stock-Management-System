package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;


public class CategoryDto {

    private Integer id;

    private String code;

    private String designation;

    private List<ArticleDto> articles;


    public CategoryDto() {
    }

    public CategoryDto(Integer id, String code, String designation) {
        this.id = id;
        this.code = code;
        this.designation = designation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<ArticleDto> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleDto> articles) {
        this.articles = articles;
    }



    //----------------------------- mapping CategoryDto with Category----------------------------
    public CategoryDto fromEntity(Category category) {

        if (category == null) {
            return null ;
            //todo throw an exception
        }
        return new CategoryDto(
                category.getId(),
                category.getCode(),
                category.getDesignation());
    }

    //--------------------------------------- mapping category with categoryDto  ----------------------------------
    public Category  toEntity(CategoryDto categoryDto){

        if(categoryDto == null){
            return null;
        }

        Category theCategory = new Category();
        theCategory.setId(categoryDto.getId());
        theCategory.setCode(categoryDto.getCode());
        theCategory.setDesignation(categoryDto.getDesignation());

        return  theCategory;
    }
}
