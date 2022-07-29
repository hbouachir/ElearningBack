package com.example.backendproject.repos;


import com.example.backendproject.entities.Difficulte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DifficulteRepository extends JpaRepository<Difficulte,Long> {
}
