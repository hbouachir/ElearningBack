package com.example.backendproject.repos;

import com.example.backendproject.entities.Fichier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<Fichier,Long> {
}
