package com.example.helscorp.stockmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "cmdeClient")
public class CmdeClient extends AbstractEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "dateCmde")
    private Instant dateCmde;;
    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;
    @OneToMany(mappedBy = "cmdeClient")
    @Column(name = "ligneCmde")
    private List<LigneCmdeClient> ligneCmde;
}
