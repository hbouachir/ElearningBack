package com.example.backendproject.repos;

import com.example.backendproject.entities.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauRepository  extends JpaRepository<Niveau, Long> {
    public Niveau findChampByTitre(String titre);

}
