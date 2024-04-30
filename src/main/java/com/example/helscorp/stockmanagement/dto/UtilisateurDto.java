package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Utilisateur;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String emaill;

    private String motDePasse;

    private AdresseDto adresse;

    private String photo;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;


    public static UtilisateurDto fromEntity(Utilisateur user){
        if(user == null){
            return  null;
            //todo throw an exception
        }

        UtilisateurDto userDto = new UtilisateurDto();
        userDto.setId(user.getId());
        userDto.setNom(user.getNom());
        userDto.setEmaill(user.getEmaill());
        userDto.setPrenom(user.getPrenom());
        userDto.setAdresse(AdresseDto.fromEntity(user.getAdresse()));
        userDto.setEntreprise(EntrepriseDto.fromEntity(user.getEntreprise()));
        userDto.setPhoto(user.getPhoto());

        return userDto;
    }


    public static Utilisateur toEntity(UtilisateurDto userDto){

        if(userDto == null){
            return null ;
            //todo throw an exception

        }

        Utilisateur user = new Utilisateur();

        user.setId(userDto.getId());
        user.setNom(userDto.getNom());
        userDto.setPrenom(userDto.getPrenom());
        user.setEmaill(userDto.getEmaill());
        user.setAdresse(AdresseDto.toEntity(userDto.getAdresse()));
        user.setPhoto(userDto.getPhoto());
        user.setEntreprise(EntrepriseDto.toEntity(userDto.getEntreprise()));

        return user;
    }


}
