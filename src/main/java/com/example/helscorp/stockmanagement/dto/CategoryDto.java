package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Category;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

    private Integer id;

    private String code;

    private String designation;

    private List<ArticleDto> articles;





    //----------------------------- mapping CategoryDto with Category----------------------------

    public static CategoryDto fromEntity(Category category) {

        if (category == null) {
            return null ;
            //todo throw an exception
        }

        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setDesignation(category.getDesignation());
        categoryDto.setCode(category.getCode());

        return categoryDto;
    }


    //--------------------------------------- mapping category with categoryDto  ----------------------------------
    public static Category  toEntity(CategoryDto categoryDto){

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
