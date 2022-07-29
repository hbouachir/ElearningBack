package com.example.backendproject.service;

import com.example.backendproject.entities.Chapitre;

import java.util.List;

public interface IChapitreService {
    Chapitre save(Chapitre c);

    Chapitre findOne(long id);
    Chapitre updateChapitre(Chapitre c);


    void deleteChapitre(long id);

    List<Chapitre> findAll();
}
