package com.example.helscorp.stockmanagement.dto;

import com.example.helscorp.stockmanagement.model.Role;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {

    private Integer id;

    private UtilisateurDto utilisateur;

    private String roleName;



    /*********************************** add mapping  entity object from dto object ********************************/

    public static RoleDto fromEntity(Role role){
        if(role == null){
            return null;
            //todo throw an exception
        }

        RoleDto roleDto = new RoleDto();
        roleDto.setId(role.getId());
        roleDto.setRoleName(role.getRoleName());
        roleDto.setUtilisateur(UtilisateurDto.fromEntity(role.getUtilisateur()));

        return roleDto;
    }

    public static Role toEntity(RoleDto roleDto){
        if(roleDto == null){
            return null;
            //todo throw an exception
        }

        Role role = new Role();
        role.setId(roleDto.getId());
        role.setRoleName(roleDto.getRoleName());
        role.setUtilisateur(UtilisateurDto.toEntity(roleDto.getUtilisateur()));

        return role;
    }
}
