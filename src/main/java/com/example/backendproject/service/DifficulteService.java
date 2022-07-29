package com.example.backendproject.service;

import com.example.backendproject.entities.Difficulte;
import com.example.backendproject.repos.DifficulteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DifficulteService implements IDiffuclteService{
    @Autowired
    DifficulteRepository dr;
    @Override
    public Difficulte save(Difficulte d) {
        return dr.save(d);
    }

    @Override
    public Difficulte findOne(long id) {
        return dr.findById(id).orElse(null);
    }

    @Override
    public Difficulte updateDifficulte(Difficulte d) {
        return dr.save(d);
    }

    @Override
    public void deleteDifficulte(long id) {
        dr.deleteById(id);

    }

    @Override
    public List<Difficulte> findAll() {
        return dr.findAll();
    }
}
