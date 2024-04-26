package com.example.helscorp.stockmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

//he would listenimg the AbstractEntity class  and update the field accordently each time it's meet @CreateData and @LastModifiedData
// he automaticaly update the field in database

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class AbstractEntity  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreatedDate
    @Column(name = "creationData",nullable = false)
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedDate
    @Column(name = "lastModifiedUpdate")
    @JsonIgnore
    private Instant lastUpdate;


    public AbstractEntity() {
    }

    public AbstractEntity(Integer id, Instant creationDate, Instant lastUpdate) {
        this.id = id;
        this.creationDate = creationDate;
        this.lastUpdate = lastUpdate;
    }


}
