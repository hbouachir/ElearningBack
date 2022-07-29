package com.example.backendproject.service;

import com.example.backendproject.entities.Exercice;

import java.util.List;

public interface IExerciceService {
    Exercice save(Exercice e);

    Exercice findOne(long id);
    Exercice updateExercice(Exercice e);


    void deleteExercice(long id);

    List<Exercice> findAll();
}
