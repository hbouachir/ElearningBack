package com.example.backendproject.restControllers;


import com.example.backendproject.entities.Niveau;
import com.example.backendproject.service.NiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class NiveauController {
    @Autowired
    NiveauService ns;



    @PostMapping("/niveau")
     public Niveau addNiveau(@RequestBody Niveau n){
        return ns.save(n);
    }

    @PutMapping("/niveau")

    public Niveau updateNiveau(@RequestBody Niveau n){
        return ns.updateNiveau(n);
    }

    @DeleteMapping("/niveau/{idNiveau}")

    public void deleteNiveau(@PathVariable Long idNiveau){
        ns.deleteNiveau(idNiveau);
    }

    @GetMapping("/niveau")
    public List<Niveau> getAllNiveau(){
        return ns.findAll();
    }

    @GetMapping("/niveau/{idNiveau}")
    public Niveau getNiveau(@PathVariable Long idNiveau){
        return ns.findOne(idNiveau);
    }



}
