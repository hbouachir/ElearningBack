package com.example.backendproject.restControllers;


import com.example.backendproject.entities.Fichier;
import com.example.backendproject.service.FileExerciceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class FileExerciceController {
    @Autowired
    FileExerciceService fs;

    @PostMapping(path="/exercice/{idExercice}")
    public Fichier addFile(@PathVariable long idExercice, @RequestParam("file") MultipartFile file) {

        return fs.addFile(file, idExercice);
    }



/*
    @DeleteMapping("/exercice/{idExercice}")
    public void deleteFile(@PathVariable long idFile,@PathVariable long idExercice ) {
     //   fs.removeFile(idFile, idExercice);
    }
*/
}
