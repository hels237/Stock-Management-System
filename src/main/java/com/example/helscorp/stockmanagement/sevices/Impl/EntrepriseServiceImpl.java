package com.example.helscorp.stockmanagement.sevices.Impl;

import com.example.helscorp.stockmanagement.dto.EntrepriseDto;
import com.example.helscorp.stockmanagement.exceptions.EntityNotFoundException;
import com.example.helscorp.stockmanagement.exceptions.ErrorCodes;
import com.example.helscorp.stockmanagement.exceptions.InvalidEntityException;
import com.example.helscorp.stockmanagement.repository.EntrepriseRepository;
import com.example.helscorp.stockmanagement.sevices.EntrepriseService;
import com.example.helscorp.stockmanagement.validators.EntrepriseValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EntrepriseServiceImpl implements EntrepriseService {

    private final EntrepriseRepository entrepriseRepository;

    @Override
    public EntrepriseDto save(EntrepriseDto dto) {
        List<String> errors = EntrepriseValidator.validate(dto);
        if(!errors.isEmpty()){
            throw new InvalidEntityException("invalid enterprise ", ErrorCodes.ENTREPRISE_NOT_VALID,errors);
        }

        return EntrepriseDto.fromEntity(entrepriseRepository.save(EntrepriseDto.toEntity(dto)));
    }

    @Override
    public EntrepriseDto findById(Integer id) {

        return entrepriseRepository
                .findById(id)
                .map(EntrepriseDto::fromEntity)
                .orElseThrow(
                        ()-> new EntityNotFoundException("enterprise not found with id : "+id,ErrorCodes.ENTREPRISE_NOT_FOUND)
                );
    }

    @Override
    public List<EntrepriseDto> findAll() {
        return entrepriseRepository.findAll().stream().map(EntrepriseDto::fromEntity).toList();
    }


    @Override
    public void delete(Integer id) {
        if(id == null){
            throw new EntityNotFoundException("enterprise not found with id : "+id);
        }
        entrepriseRepository.deleteById(id);

    }
}
