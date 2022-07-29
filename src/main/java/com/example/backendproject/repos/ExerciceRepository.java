package com.example.backendproject.repos;

import com.example.backendproject.entities.Exercice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciceRepository  extends JpaRepository<Exercice, Long> {
}
