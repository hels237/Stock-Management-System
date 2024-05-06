package com.example.helscorp.stockmanagement.validators;

import com.example.helscorp.stockmanagement.dto.CmdeFournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CmdeFournisseurValidator {

    public  static List<String> validator(CmdeFournisseurDto dto){
        List<String> errors = new ArrayList<>();

        if(!StringUtils.hasLength(dto.getCode())){
            errors.add("fill the code field");
        }

        if(dto.getFournisseur() == null){
            errors.add("fill the product provider  field");
        }else{

            if(!StringUtils.hasLength(dto.getFournisseur().getNom())){
                errors.add("fill the firstname field");
            }

            if(!StringUtils.hasLength(dto.getFournisseur().getPrenom())){
                errors.add("fill the lastname field");
            }

            if(!StringUtils.hasLength(dto.getFournisseur().getMail())){
                errors.add("fill the email field");
            }

            if(!StringUtils.hasLength(dto.getFournisseur().getPhoto())){
                errors.add("fill the photo field");
            }

            if(!StringUtils.hasLength(dto.getFournisseur().getNumTel())){
                errors.add("fill the numTel field");
            }
        }

        return errors;
    }

}
