package com.example.backendproject.restControllers;



import com.example.backendproject.entities.Champ;
import com.example.backendproject.entities.SousChamp;
import com.example.backendproject.repos.ChampRepository;
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
    @Autowired
    ChampRepository cr;

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


    @GetMapping("/sousChamp/{idSousChamp}")
    public SousChamp getChampById(@PathVariable Long idSousChamp){
        return cs.findOne(idSousChamp) ;
    }

    @GetMapping("/sousChamp/{idChamp}")
    public List<SousChamp> getSousChampByChamp(@PathVariable Long idChamp){
        return cs.findSousChampbyChamp(cr.findById(idChamp).orElse(null))  ;
    }

}
