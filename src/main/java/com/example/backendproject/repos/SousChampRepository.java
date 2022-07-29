package com.example.backendproject.repos;

import com.example.backendproject.entities.Champ;
import com.example.backendproject.entities.SousChamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SousChampRepository extends JpaRepository<SousChamp,Long> {


    public SousChamp findChampByTitre(String titre);
    public List<SousChamp> findSousChampByChamp(Champ champ);

}
