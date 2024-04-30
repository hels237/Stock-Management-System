package com.example.helscorp.stockmanagement.dto;


import com.example.helscorp.stockmanagement.model.Client;
import lombok.*;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String mail;

    private String photo;

    private String numTel;


    private List<CmdeClientDto> cmdeClients;





    public static ClientDto fromEntity(Client client){

        if(client == null){
            return null;
            //todo throw an exception
        }
        ClientDto theClient = new ClientDto();
        theClient.setId(client.getId());
        theClient.setAdresse(AdresseDto.fromEntity(client.getAdresse()));
        theClient.setNom(client.getNom());
        theClient.setPrenom(client.getPrenom());
        theClient.setPhoto(client.getPhoto());
        theClient.setNumTel(client.getNumTel());

        return theClient;
    }


    public static Client toEntity(ClientDto clientDto){
        if(clientDto == null){
            return  null;
            //todo throw exception
        }
        Client theClient = new Client();
        theClient.setNom(clientDto.getNom());
        theClient.setPrenom(clientDto.getPrenom());
        theClient.setAdresse(AdresseDto.toEntity(clientDto.getAdresse()));
        theClient.setId(clientDto.getId());
        theClient.setPhoto(clientDto.getPhoto());
        theClient.setNumTel(clientDto.getNumTel());

        return theClient;
    }
}
