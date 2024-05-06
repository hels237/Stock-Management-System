package com.example.helscorp.stockmanagement.validators;

import com.example.helscorp.stockmanagement.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public static List<String> validate(ArticleDto dto){
        List<String> errors = new ArrayList<>();

        if(dto == null){
            errors.add(" fill the code article field ");
            errors.add(" fill the designation article field ");
            errors.add(" fill the  unit price field ");
            errors.add(" fill the  unit price field ");
            errors.add(" fill the  TVA field ");
            errors.add(" fill the  PTTC price field ");
            errors.add(" fill the  unit price field ");
            errors.add(" fill the category field ");

        }

        if(!StringUtils.hasLength(dto.getCodeArticle())){
            errors.add(" fill the code article field ");
        }

        if(!StringUtils.hasLength(dto.getDesignation())){
            errors.add(" fill the designation article field ");
        }

        if(dto.getPrixUnitaireHt() == null){
            errors.add(" fill the  unit price field ");
        }

        if(dto.getPrixUnitaireHt() == null){
            errors.add(" fill the  unit price field ");
        }

        if(dto.getTauxTva() == null){
            errors.add(" fill the  TVA field ");
        }

        if(dto.getPrixUnitaireTtc() == null){
            errors.add(" fill the  PTTC price field ");
        }

        if(dto.getPrixUnitaireHt() == null){
            errors.add(" fill the  unit price field ");
        }

        if( dto.getCategory() == null){
            errors.add(" fill the category field ");
        }else{

            if(StringUtils.hasLength(dto.getCategory().getCode())){
                errors.add(" fill the  code category field ");
            }

            if(StringUtils.hasLength(dto.getCategory().getDesignation())){
                errors.add(" fill the  designation category field ");
            }


        }

        return errors;
    }
}
