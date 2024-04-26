package com.example.helscorp.stockmanagement.dto;


import com.example.helscorp.stockmanagement.model.Client;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String mail;

    private String photo;

    private String numTel;


    private List<CmdeClientDto> cmdeClients;

    public ClientDto() {
    }

    public ClientDto(Integer id, String nom, String prenom, AdresseDto adresse, String mail, String photo, String numTel, List<CmdeClientDto> cmdeClients) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.photo = photo;
        this.numTel = numTel;
        this.cmdeClients = cmdeClients;
    }




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
