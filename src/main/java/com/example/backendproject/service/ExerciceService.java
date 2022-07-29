package com.example.backendproject.service;

import com.example.backendproject.entities.Exercice;
import com.example.backendproject.repos.ExerciceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExerciceService implements IExerciceService{
    @Autowired
    ExerciceRepository er;
    @Autowired
    FileExerciceService fs;

    @Override
    public Exercice save(Exercice e) {


        return  er.save(e);
    }

    @Override
    public Exercice findOne(long id) {
        return er.findById(id).orElse(null);
    }

    @Override
    public Exercice updateExercice(Exercice e) {
        return er.save(e);
    }

    @Override
    public void deleteExercice(long id) {
        er.deleteById(id);

    }

    @Override
    public List<Exercice> findAll() {
        return er.findAll();
    }
}
