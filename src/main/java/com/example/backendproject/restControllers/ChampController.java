package com.example.backendproject.restControllers;



import com.example.backendproject.entities.Champ;
import com.example.backendproject.service.ChampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ChampController {

    @Autowired
    ChampService cs;

    @PostMapping("/champ")
    public Champ addChamp(@RequestBody Champ c){
        return cs.save(c);
    }

    @PutMapping("/champ")

    public Champ updateChamp(@RequestBody Champ c){
        return cs.updateChamp(c);
    }

    @DeleteMapping("/champ/{idChamp}")

    public void deleteChamp(@PathVariable Long idChamp){cs.deleteChamp(idChamp);
    }

    @GetMapping("/champ")
    public List<Champ> getAllChamp(){
        return cs.findAll();
    }

    @GetMapping("/champ/{idChamp}")
    public Champ getChamp(@PathVariable Long idChamp){
        return cs.findOne(idChamp);
    }

}
