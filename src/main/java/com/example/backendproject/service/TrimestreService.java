package com.example.backendproject.service;



import com.example.backendproject.entities.Trimestre;
import com.example.backendproject.repos.TrimestreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrimestreService implements ITrimestreService {
    @Autowired
    TrimestreRepository tr;

    @Override
    public Trimestre save(Trimestre t) {
        return tr.save(t);
    }

    @Override
    public Trimestre findOne(long id) {
        return tr.findById(id).orElse(null);
    }

    @Override
    public Trimestre updateTrimestre(Trimestre t) {
        return tr.save(t);
    }

    @Override
    public void deleteTrimestre(long id) {

        tr.deleteById(id);
    }

    @Override
    public List<Trimestre> findAll() {
        return tr.findAll();
    }


    public Trimestre findByTitre(String s){
        return tr.findChampByTitre(s);    }
}
