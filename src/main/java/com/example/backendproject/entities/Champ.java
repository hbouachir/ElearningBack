package com.example.backendproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints=@UniqueConstraint(columnNames="TITRE"))
@Builder
public class Champ implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHAMP_ID")
    private Long id;

    @Column(name = "TITRE")
    private String titre;


    @OneToMany(mappedBy = "champ",cascade = CascadeType.ALL)
    private Set<SousChamp> sousChamps;



  /*  @OneToOne(mappedBy = "champ")
    private Exercice exercice;*/
}
