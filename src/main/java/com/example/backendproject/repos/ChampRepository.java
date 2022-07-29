package com.example.backendproject.repos;

import com.example.backendproject.entities.Champ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChampRepository extends JpaRepository<Champ,Long> {
    public Champ findChampByTitre(String titre);
}
