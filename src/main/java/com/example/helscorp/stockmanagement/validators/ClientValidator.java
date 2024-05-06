package com.example.helscorp.stockmanagement.validators;

import com.example.helscorp.stockmanagement.dto.ClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidator {

    public static List<String> validator(ClientDto dto){
        List<String> errors = new ArrayList<>();

        if(dto == null){
            errors.add("fill the firstname field");
            errors.add("fill the lastname field");
            errors.add("fill the email field");
            errors.add("fill the photos field");
            errors.add("fill the Address field");
        }

        if(!StringUtils.hasLength(dto.getNom())){
            errors.add("fill the firstname field");
        }

        if(!StringUtils.hasLength(dto.getPrenom())){
            errors.add("fill the lastname field");
        }

        if(!StringUtils.hasLength(dto.getMail())){
            errors.add("fill the email field");
        }

        if(!StringUtils.hasLength(dto.getPhoto())){
            errors.add("fill the photo field");
        }

        if(dto.getAdresse() == null){
            errors.add("fill the address field");
        }else{
            if(!StringUtils.hasLength(dto.getAdresse().getAdresse1())){
                errors.add("fill the first address field");
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
