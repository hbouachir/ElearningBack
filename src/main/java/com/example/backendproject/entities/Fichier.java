package com.example.backendproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Fichier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long fileId;

    String fileName;

    String filePath;
    @Temporal(TemporalType.TIMESTAMP)
    Date uploadDate;

    @JsonIgnore
    @ManyToOne
    Exercice exercice;

}
