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
public class Chapitre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHAMP_ID")
    private Long id;

    @Column(name = "TITRE")
    private String titre;

    /*@OneToOne(mappedBy = "chapitre")
    private Exercice exercice;*/
}
