package com.example.helscorp.stockmanagement.sevices.Impl;

import com.example.helscorp.stockmanagement.dto.ClientDto;
import com.example.helscorp.stockmanagement.exceptions.EntityNotFoundException;
import com.example.helscorp.stockmanagement.exceptions.ErrorCodes;
import com.example.helscorp.stockmanagement.exceptions.InvalidEntityException;
import com.example.helscorp.stockmanagement.model.Client;
import com.example.helscorp.stockmanagement.repository.ClientRepository;
import com.example.helscorp.stockmanagement.sevices.ClientService;
import com.example.helscorp.stockmanagement.validators.ClientValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;



    @Override
    public ClientDto save(ClientDto dto) {

        List<String> errors = ClientValidator.validator(dto);

        if(!errors.isEmpty()){
            throw  new InvalidEntityException("invalid category",ErrorCodes.CATEGORY_NOT_VALID,errors);
        }

        return ClientDto.fromEntity(clientRepository.save(ClientDto.toEntity(dto)));
    }


    @Override
    public ClientDto findById(Integer id) {

        return clientRepository
                .findById(id)
                .map(ClientDto::fromEntity)
                .orElseThrow(
                        ()-> new EntityNotFoundException("Client not found with the ID : "+id,ErrorCodes.CLIENT_NOT_FOUND)
                );
    }


    @Override
    public List<ClientDto> findAll() {
        return clientRepository.findAll().stream().map(ClientDto::fromEntity).toList();
    }


    @Override
    public void delete(Integer id) {
        if(id == null){
            throw new EntityNotFoundException("client not found with ID : "+id);
        }

        clientRepository.deleteById(id);
    }
}
