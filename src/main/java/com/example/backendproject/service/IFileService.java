package com.example.backendproject.service;

import com.example.backendproject.entities.Fichier;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IFileService {



    Fichier addFile(MultipartFile f, Long idExercice/*, User U*/);
    void removeFile(Long idFile,Long idExercice/*, User U */);
    //List<File> findFilesByCourse();
    List<Fichier> findAll();
    Fichier getFileById(long id);
}
