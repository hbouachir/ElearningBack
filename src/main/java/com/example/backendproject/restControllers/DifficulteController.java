package com.example.backendproject.restControllers;



import com.example.backendproject.entities.Difficulte;
import com.example.backendproject.service.DifficulteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class DifficulteController {

    @Autowired
    DifficulteService ds;

    @PostMapping("/difficulte")
    public Difficulte addDifficulte(@RequestBody Difficulte c){
        return ds.save(c);
    }

    @PutMapping("/difficulte")

    public Difficulte updateDifficulte(@RequestBody Difficulte c){
        return ds.updateDifficulte(c);
    }

    @DeleteMapping("/difficulte/{idDifficulte}")

    public void deleteDifficulte(@PathVariable Long idDifficulte){ds.deleteDifficulte(idDifficulte);
    }

    @GetMapping("/difficulte")
    public List<Difficulte> getAllDifficulte(){
        return ds.findAll();
    }

    @GetMapping("/difficulte/{idDifficulte}")
    public Difficulte getDifficulte(@PathVariable Long idDifficulte){
        return ds.findOne(idDifficulte);
    }

}
