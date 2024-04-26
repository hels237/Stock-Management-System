package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.CmdeFournisseur;
import com.example.helscorp.stockmanagement.model.EtatCmde;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;



@Getter
@Setter
@NoArgsConstructor
public class CmdeFournisseurDto {

    private Integer id;

    private Instant dateCmde;

    private String code;

    private EtatCmde etat;

    private FournisseurDto fournisseur;

    private List<LigneCmdeFournisseurDto> ligneCmdeFournisseurs;


    public static CmdeFournisseurDto fromEntity(CmdeFournisseur cmdeFournisseur){
        if(cmdeFournisseur == null){
            return null;
            //todo throw an exception
        }

        CmdeFournisseurDto cmdeFournisseurDto = new CmdeFournisseurDto();
        cmdeFournisseurDto.setId(cmdeFournisseur.getId());
        cmdeFournisseurDto.setCode(cmdeFournisseur.getCode());
        cmdeFournisseurDto.setEtat(cmdeFournisseur.getEtat());
        cmdeFournisseurDto.setDateCmde(cmdeFournisseur.getDateCmde());

        return cmdeFournisseurDto;
    }


    public static CmdeFournisseur fromEntity(CmdeFournisseurDto cmdeFournisseurDto){
        if(cmdeFournisseurDto == null){
            return null;
            //todo throw an exception
        }

        CmdeFournisseur cmdeFournisseur = new CmdeFournisseur();
        cmdeFournisseur.setId(cmdeFournisseurDto.getId());
        cmdeFournisseur.setCode(cmdeFournisseurDto.getCode());
        cmdeFournisseur.setEtat(cmdeFournisseurDto.getEtat());
        cmdeFournisseur.setDateCmde(cmdeFournisseurDto.getDateCmde());

        return cmdeFournisseur;
    }


}
