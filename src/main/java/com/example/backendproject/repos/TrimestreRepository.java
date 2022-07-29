package com.example.backendproject.repos;

import com.example.backendproject.entities.Trimestre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrimestreRepository extends JpaRepository<Trimestre,Long> {
    public Trimestre findChampByTitre(String titre);

}
