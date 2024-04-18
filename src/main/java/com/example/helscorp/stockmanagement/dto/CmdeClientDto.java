package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.EtatCmde;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;


@Builder
@Data
public class CmdeClientDto {

    private Integer id;

    private String code;

    private Instant dateCmde;;

    private ClientDto client;

    private EtatCmde etat;

    private List<LigneCmdeClientDto> ligneCmde;
}
