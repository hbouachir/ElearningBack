package com.example.backendproject.service;

import com.example.backendproject.entities.Champ;
import com.example.backendproject.repos.ChampRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChampService implements IChampService {

    @Autowired
    ChampRepository cr;
    @Override
    public Champ save(Champ c) {
        return cr.save(c);
    }

    @Override
    public Champ findOne(long id) {
        return cr.findById(id).orElse(null);
    }

    @Override
    public Champ updateChamp(Champ n) {
        return cr.save(n);
    }

    @Override
    public void deleteChamp(long id) {
        cr.deleteById(id);

    }

    @Override
    public List<Champ> findAll() {
        return cr.findAll();
    }
    public Champ findByTitre(String titre){
        return cr.findChampByTitre(titre);
    }
}
