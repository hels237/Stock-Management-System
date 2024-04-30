package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.CmdeClient;
import com.example.helscorp.stockmanagement.model.EtatCmde;
import lombok.*;

import java.time.Instant;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CmdeClientDto {

    private Integer id;

    private String code;

    private Instant dateCmde;;

    private ClientDto client;

    private EtatCmde etat;

    private List<LigneCmdeClientDto> ligneCmde;


    public static CmdeClientDto fromEntity(CmdeClient cmdeClient){
        if(cmdeClient == null){
            return null;
            // todo throw an exception
        }

        CmdeClientDto cmdeClientDto = new CmdeClientDto();
        cmdeClientDto.setId(cmdeClient.getId());
        cmdeClientDto.setCode(cmdeClient.getCode());
        cmdeClientDto.setClient(ClientDto.fromEntity(cmdeClient.getClient()));

        return cmdeClientDto;
    }

    public static CmdeClient  toEntity( CmdeClientDto cmdeClientDto){

        if(cmdeClientDto == null){
            return null;
            //todo throw an exception
        }

        CmdeClient cmdeClient = new CmdeClient();
        cmdeClient.setId(cmdeClientDto.getId());
        cmdeClient.setCode(cmdeClientDto.getCode());
        cmdeClient.setClient(ClientDto.toEntity(cmdeClientDto.getClient()));

        return cmdeClient;
    }

}
