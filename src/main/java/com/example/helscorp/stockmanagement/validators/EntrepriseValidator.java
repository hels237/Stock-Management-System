package com.example.helscorp.stockmanagement.validators;

import com.example.helscorp.stockmanagement.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {

    public static List<String> validate(EntrepriseDto dto){
        List<String> errors = new ArrayList<>();

        if(dto == null){
            errors.add("fill the name field");
            errors.add("fill the numTel field");
            errors.add("fill the fiscal code field");
            errors.add("fill the email field");
        }

        if(!StringUtils.hasLength(dto.getNom())){
            errors.add("fill the name field");
        }

        if(!StringUtils.hasLength(dto.getNumTel())){
            errors.add("fill the numTel field");
        }

        if(!StringUtils.hasLength(dto.getCodeFiscal())){
            errors.add("fill the fiscal code field");
        }

        if(!StringUtils.hasLength(dto.getEmail())){
            errors.add("fill the email field");
        }

        if(dto.getAdresse() == null){
            errors.add("fill the Address field");
        }else {

            if(!StringUtils.hasLength(dto.getAdresse().getAdresse1())){
                errors.add("fill the address field");
            }

            if(!StringUtils.hasLength(dto.getAdresse().getVille())){
                errors.add("fill the city field");
            }

            if(!StringUtils.hasLength(dto.getAdresse().getPays())){
                errors.add("fill the country field");
            }

            if(!StringUtils.hasLength(dto.getAdresse().getCodePostal())){
                errors.add("fill the postal code field");
            }
        }


        return errors;
    }
}
