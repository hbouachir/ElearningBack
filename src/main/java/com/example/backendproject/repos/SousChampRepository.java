package com.example.backendproject.repos;

import com.example.backendproject.entities.SousChamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SousChampRepository extends JpaRepository<SousChamp,Long> {


    public SousChamp findChampByTitre(String titre);

}
