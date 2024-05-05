package com.example.helscorp.stockmanagement.validators;

import com.example.helscorp.stockmanagement.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public static List<String> validate(CategoryDto categoryDto){

        List<String> errors = new ArrayList<>();

        if(categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())){
            errors.add(" please fill the category code ");
        }

        return  errors;
    }
}
