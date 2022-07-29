package com.example.backendproject.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints=@UniqueConstraint(columnNames="TITRE"))
@Builder
public class Niveau implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NIVEAU_ID")
    private Long id;

    @Column(name = "TITRE")
    private String titre;

/*
    @OneToOne(mappedBy = "niveau")
    private Exercice exercice;*/


}
