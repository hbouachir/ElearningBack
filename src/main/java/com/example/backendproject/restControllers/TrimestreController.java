package com.example.backendproject.restControllers;

import com.example.backendproject.entities.Trimestre;
import com.example.backendproject.service.TrimestreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class TrimestreController {

    @Autowired
    TrimestreService ts;



    @PostMapping("/trimestre")
    public Trimestre addTrimestre(@RequestBody Trimestre t){
        return ts.save(t);
    }

    @PutMapping("/trimestre")
    public Trimestre updateTrimestre(@RequestBody Trimestre t){
        return ts.updateTrimestre(t);
    }

    @DeleteMapping("/trimestre/{idTrimestre}")

    public void deleteTrimestre(@PathVariable Long idTrimestre){
        ts.deleteTrimestre(idTrimestre);
    }

    @GetMapping("/trimestre")
    public List<Trimestre> getAllTrimestre(){
        return ts.findAll();
    }

    @GetMapping("/trimestre/{idTrimestre}")
    public Trimestre getTrimestre(@PathVariable Long idTrimestre){
        return ts.findOne(idTrimestre);
    }



}
