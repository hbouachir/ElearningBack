package com.example.backendproject.repos;

import com.example.backendproject.entities.Exercice;
import com.example.backendproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ExerciceRepository  extends JpaRepository<Exercice, Long> {
/*
    Set<Exercice> findByUser(User user);
    List<Exercice> findByUserOrderByNumeroDesc(User user);*/


}
