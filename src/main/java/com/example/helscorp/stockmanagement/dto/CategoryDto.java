package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Category;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
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
