package com.example.backendproject.restControllers;


import com.example.backendproject.entities.Exercice;
import com.example.backendproject.service.ExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ExerciceController {


    @Autowired
    ExerciceService es;

    @PostMapping("/exercice")
    public Exercice addExercice(@RequestBody Exercice c){

        return es.save(c);
    }

    @PutMapping("/exercice")

    public Exercice updateExercice(@RequestBody Exercice c){
        return es.updateExercice(c);
    }

    @DeleteMapping("/exercice/{idExercice}")

    public void deleteExercice(@PathVariable Long idExercice){es.deleteExercice(idExercice);
    }

    @GetMapping("/exercice")
    public List<Exercice> getAllExercice(){
        return es.findAll();
    }

    @GetMapping("/exercice/{idExercice}")
    public Exercice getExercice(@PathVariable Long idExercice){
        return es.findOne(idExercice);
    }
}
