package com.example.backendproject.restControllers;


import com.example.backendproject.entities.Chapitre;
import com.example.backendproject.service.ChapitreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ChapitreController {


    @Autowired
    ChapitreService cs;

    @PostMapping("/chapitre")
    public Chapitre addChapitre(@RequestBody Chapitre c){
        return cs.save(c);
    }

    @PutMapping("/chapitre")

    public Chapitre updateChapitre(@RequestBody Chapitre c){
        return cs.updateChapitre(c);
    }

    @DeleteMapping("/chapitre/{idChapitre}")

    public void deleteChapitre(@PathVariable Long idChapitre){cs.deleteChapitre(idChapitre);
    }

    @GetMapping("/chapitre")
    public List<Chapitre> getAllChapitre(){
        return cs.findAll();
    }

    @GetMapping("/chapitre/{idChapitre}")
    public Chapitre getChapitre(@PathVariable Long idChapitre){
        return cs.findOne(idChapitre);
    }

}
