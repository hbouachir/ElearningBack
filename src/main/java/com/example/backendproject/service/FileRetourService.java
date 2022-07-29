package com.example.backendproject.service;

import com.example.backendproject.entities.Fichier;
import com.example.backendproject.repos.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class FileRetourService implements IFileService{

    @Autowired
    FileRepository fr;






    @Override
    public Fichier addFile(MultipartFile f, Long scq) {
    return null;
    }

    @Override
    public void removeFile(Long idFile, Long dze) {

    }

    @Override
    public List<Fichier> findAll() {
        return null;
    }

    @Override
    public Fichier getFileById(long id) {
        return null;
    }
}
