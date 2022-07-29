package com.example.backendproject.service;

import com.example.backendproject.entities.Champ;
import com.example.backendproject.entities.SousChamp;
import com.example.backendproject.repos.SousChampRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SousChampService implements ISousChampService{

    @Autowired
    ChampService cs;
    @Autowired
    SousChampRepository sr;

    @Override
    public SousChamp save(SousChamp sousChamp, long id_Champ) {
        Champ champ=cs.findOne(id_Champ);
        sousChamp.setChamp(champ);
        return sr.save(sousChamp);
    }

    @Override
    public SousChamp findOne(long id) {
        return sr.findById(id).orElse(null);
    }

    @Override
    public SousChamp updateSousChamp(SousChamp c) {
        return sr.save(c);
    }

    @Override
    public void deleteSousChamp(long id) {
        sr.deleteById(id);

    }

    @Override
    public List<SousChamp> findAll() {
        return sr.findAll();
    }


    public SousChamp findByTitre(String s){
        return sr.findChampByTitre(s);    }
}
