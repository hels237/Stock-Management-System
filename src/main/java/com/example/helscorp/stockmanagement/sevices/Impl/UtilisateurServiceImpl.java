package com.example.helscorp.stockmanagement.sevices.Impl;

import com.example.helscorp.stockmanagement.dto.UtilisateurDto;
import com.example.helscorp.stockmanagement.exceptions.EntityNotFoundException;
import com.example.helscorp.stockmanagement.exceptions.ErrorCodes;
import com.example.helscorp.stockmanagement.exceptions.InvalidEntityException;
import com.example.helscorp.stockmanagement.repository.UtilisateurRepository;
import com.example.helscorp.stockmanagement.sevices.UtilisateurService;
import com.example.helscorp.stockmanagement.validators.UtilisateurValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {


    private final UtilisateurRepository utilisateurRepository;


    @Override
    public UtilisateurDto save(UtilisateurDto dto) {

        List<String> errors = UtilisateurValidator.validate(dto);

        if(!errors.isEmpty()){
            throw new InvalidEntityException("invalid user ", ErrorCodes.UTILISATEUR_NOT_VALID,errors);
        }
        return UtilisateurDto.fromEntity(utilisateurRepository.save(UtilisateurDto.toEntity(dto)));
    }


    @Override
    public UtilisateurDto findById(Integer id) {
        return utilisateurRepository
                .findById(id)
                .map(UtilisateurDto::fromEntity)
                .orElseThrow(
                        ()-> new EntityNotFoundException("user not found with ID : "+id)
                );
    }


    @Override
    public List<UtilisateurDto> findAll() {
        return utilisateurRepository.findAll().stream().map(UtilisateurDto::fromEntity).toList();
    }


    @Override
    public void delete(Integer id) {

        if(id == null){
            throw  new EntityNotFoundException("user not found with id : "+id);
        }

        utilisateurRepository.deleteById(id);
    }
}
