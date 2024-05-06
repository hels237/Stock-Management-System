package com.example.helscorp.stockmanagement.validators;

import com.example.helscorp.stockmanagement.dto.CmdeClientDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CmdeClientValidator {

    public static List<String> validator(CmdeClientDto dto){
        List<String> errors = new ArrayList<>();

        if(dto == null){
            errors.add("fill the code cmdeClient field ");
        }

        if(!StringUtils.hasLength(dto.getCode())){
            errors.add("fill the code cmdeClient field ");
        }

        if(dto.getClient() == null){
            errors.add("fill the client field");
        }else {
            if(!StringUtils.hasLength(dto.getClient().getNom())){
                errors.add("fill the firstname field");
            }

            if(!StringUtils.hasLength(dto.getClient().getPrenom())){
                errors.add("fill the lastname field");
            }

            if(!StringUtils.hasLength(dto.getClient().getMail())){
                errors.add("fill the email field");
            }

            if(!StringUtils.hasLength(dto.getClient().getPhoto())){
                errors.add("fill the photo field");
            }
        }
        return errors;
    }
}
