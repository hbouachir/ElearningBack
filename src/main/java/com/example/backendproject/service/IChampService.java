package com.example.backendproject.service;

import com.example.backendproject.entities.Champ;

import java.util.List;

public interface IChampService {
    Champ save(Champ c);

    Champ findOne(long id);
    Champ updateChamp(Champ c);


    void deleteChamp(long id);

    List<Champ> findAll();
}
