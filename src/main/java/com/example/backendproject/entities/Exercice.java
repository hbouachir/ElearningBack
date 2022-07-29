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
@Table(name = "Exercice")
@Builder
public class Exercice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exercice_id")
    private long id;

     ////////////1
    @OneToOne
    private Niveau niveau;
    ////////////2
    @OneToOne
    private Trimestre trimestre;
    ////////////3
    @OneToOne
    private Champ champ;




    /////////////////////4


    ////////////5
    @OneToOne
    private Chapitre chapitre;
    ////////////6
    @OneToOne
    private Difficulte difficulte;

    ////////////7

    private long numero;

    ////////////8 type exercice annexe

    ////////////9
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exercice")
    Set<Fichier> fichiers;





}
