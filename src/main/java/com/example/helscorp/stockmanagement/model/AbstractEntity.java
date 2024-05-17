package com.example.helscorp.stockmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

//he would listenimg the AbstractEntity class  and update the field accordently each time it's meet @CreateData and @LastModifiedData
// he automaticaly update the field in database

@Data
@SuperBuilder
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
public class AbstractEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreatedDate
    @Column(
            name = "creationData",
            nullable = false,
            updatable = false
    )
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedDate
    @Column(name = "lastModifiedUpdate")
    @JsonIgnore
    private Instant lastUpdate;





}
