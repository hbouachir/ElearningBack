package com.example.backendproject.service;

import com.example.backendproject.entities.Niveau;

import java.util.List;

public interface INiveauService {
    Niveau save(Niveau n);

    Niveau findOne(long id);
    Niveau updateNiveau(Niveau n);


    void deleteNiveau(long id);

    List<Niveau> findAll();
}
