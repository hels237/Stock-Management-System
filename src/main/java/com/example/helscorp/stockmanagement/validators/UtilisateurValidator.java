package com.example.helscorp.stockmanagement.validators;


import com.example.helscorp.stockmanagement.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

  public static List<String> validate(UtilisateurDto userDto){

      List<String> errors = new ArrayList<>();

      if(userDto == null){
          errors.add(" please fill the user firstname ");
          errors.add(" please fill the user lastname ");
          errors.add(" please define the user address ! ");
      }

      if(!StringUtils.hasLength(userDto.getNom())){
          errors.add(" please fill the user firstname ");
      }

      if(!StringUtils.hasLength(userDto.getPrenom())){
          errors.add(" please fill the user lastname ");
      }

      if(userDto.getAdresse() == null){
          errors.add(" please define the user address ! ");

      }else {

          if(!StringUtils.hasLength(userDto.getAdresse().getAdresse1())){
              errors.add(" please address field required");
          }

          if(!StringUtils.hasLength(userDto.getAdresse().getVille())){
              errors.add(" please city field required");
          }

          if(!StringUtils.hasLength(userDto.getAdresse().getPays())){
              errors.add(" please country field required");
          }

          if(!StringUtils.hasLength(userDto.getAdresse().getCodePostal())){
              errors.add(" please postal code field required");
          }

      }

      return errors;
  }
}
