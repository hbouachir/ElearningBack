package com.example.backendproject.service;

import com.example.backendproject.entities.Difficulte;

import java.util.List;

public interface IDiffuclteService {
    Difficulte save(Difficulte d);

    Difficulte findOne(long id);
    Difficulte updateDifficulte(Difficulte d);


    void deleteDifficulte(long id);

    List<Difficulte> findAll();
}
