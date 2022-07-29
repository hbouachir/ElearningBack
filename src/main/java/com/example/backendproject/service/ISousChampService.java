package com.example.backendproject.service;

import com.example.backendproject.entities.SousChamp;

import java.util.List;

public interface ISousChampService {
    SousChamp save(SousChamp c, long id_Champ);

    SousChamp findOne(long id);
    SousChamp updateSousChamp(SousChamp c);


    void deleteSousChamp(long id);

    List<SousChamp> findAll();
}

