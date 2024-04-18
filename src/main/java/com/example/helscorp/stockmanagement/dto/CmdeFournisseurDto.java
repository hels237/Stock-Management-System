package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.EtatCmde;
import lombok.Builder;
import lombok.Data;
import java.time.Instant;
import java.util.List;


@Builder
@Data
public class CmdeFournisseurDto {

    private Instant dateCmde;

    private String code;

    private EtatCmde etat;

    private FournisseurDto fournisseur;

    private List<LigneCmdeFournisseurDto> ligneCmdeFournisseurs;
}
