package com.example.backendproject.service;


import com.example.backendproject.entities.Chapitre;
import com.example.backendproject.repos.ChapitreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ChapitreService implements IChapitreService{
    @Autowired
    ChapitreRepository cr;

    @Override
    public Chapitre save(Chapitre c) {
        return cr.save(c);
    }

    @Override
    public Chapitre findOne(long id) {
        return cr.findById(id).orElse(null);
    }

    @Override
    public Chapitre updateChapitre(Chapitre c) {
        return cr.save(c);
    }

    @Override
    public void deleteChapitre(long id) {
        cr.deleteById(id);

    }

    @Override
    public List<Chapitre> findAll() {
        return cr.findAll();
    }
}
