package com.example.backendproject.restControllers;



import com.example.backendproject.entities.SousChamp;
import com.example.backendproject.service.SousChampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class SousChampController {


    @Autowired
    SousChampService cs;

    @PostMapping("/sousChamp/{id_champ}")
    public SousChamp addSousChamp(@RequestBody SousChamp c, @PathVariable long id_champ){
        return cs.save(c,id_champ);
    }

    @PutMapping("/sousChamp")

    public SousChamp updateSousChamp(@RequestBody SousChamp c){
        return cs.updateSousChamp(c);
    }

    @DeleteMapping("/sousChamp/{idSousChamp}")

    public void deleteSousChamp(@PathVariable Long idSousChamp){cs.deleteSousChamp(idSousChamp);
    }

    @GetMapping("/sousChamp")
    public List<SousChamp> getAllSousChamp(){
        return cs.findAll();
    }

    @GetMapping("/SousSousChamp/{idSousSousChamp}")
    public SousChamp getSousChamp(@PathVariable Long idSousSousChamp){
        return cs.findOne(idSousSousChamp);
    }

}
