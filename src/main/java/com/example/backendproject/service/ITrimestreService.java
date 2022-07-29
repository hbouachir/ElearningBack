package com.example.backendproject.service;

import com.example.backendproject.entities.Trimestre;

import java.util.List;

public interface ITrimestreService {
    Trimestre save(Trimestre t);

    Trimestre findOne(long id);
    Trimestre updateTrimestre(Trimestre t);


    void deleteTrimestre(long id);

    List<Trimestre> findAll();
}
