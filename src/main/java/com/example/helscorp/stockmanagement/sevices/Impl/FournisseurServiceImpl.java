package com.example.helscorp.stockmanagement.sevices.Impl;

import com.example.helscorp.stockmanagement.dto.FournisseurDto;
import com.example.helscorp.stockmanagement.sevices.FournisseurService;
import com.example.helscorp.stockmanagement.validators.CmdeFournisseurValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FournisseurServiceImpl implements FournisseurService {

    private final FournisseurService fournisseurService;


    @Override
    public FournisseurDto save(FournisseurDto dto) {
        List<String> errors =
        return ;
    }

    @Override
    public FournisseurDto findById(Integer id) {
        return null;
    }

    @Override
    public List<FournisseurDto> findAll() {
        return List.of();
    }

    @Override
    public void delete(Integer id) {

    }
}
