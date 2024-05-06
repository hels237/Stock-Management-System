package com.example.helscorp.stockmanagement.validators;

import com.example.helscorp.stockmanagement.dto.RoleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RoleValidator {

    public static List<String> validator(RoleDto dto){
        List<String> errors = new ArrayList<>();

        if(dto == null){
            errors.add("fill the rolename field");
        }

        if(!StringUtils.hasLength(dto.getRoleName())){
            errors.add("fill the rolename field");
        }

        if(dto.getUtilisateur() == null){
            errors.add("fill the user field");
        }else {

            if(!StringUtils.hasLength(dto.getUtilisateur().getNom())){
                errors.add(" please fill the user firstname ");
            }
            if(!StringUtils.hasLength(dto.getUtilisateur().getPrenom())){
                errors.add(" please fill the user lastname ");
            }
            if(!StringUtils.hasLength(dto.getUtilisateur().getEmaill())){
                errors.add(" please fill the user email ! ");
            }

        }
        return errors;
    }
}
