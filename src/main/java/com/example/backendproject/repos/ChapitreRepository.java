package com.example.backendproject.repos;

import com.example.backendproject.entities.Chapitre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapitreRepository extends JpaRepository<Chapitre,Long> {
    public Chapitre findChapitreByTitre(String titre);
}
