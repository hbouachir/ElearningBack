package com.example.backendproject.service;

import com.example.backendproject.entities.Exercice;
import com.example.backendproject.entities.Fichier;
import com.example.backendproject.repos.ExerciceRepository;
import com.example.backendproject.repos.FileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
@Service
public class FileExerciceService implements IFileService{

    static String UPLOAD_FOLDER = "/uploads/";
    @Autowired
    FileRepository fr;

    @Autowired
    ExerciceRepository er;

    @Autowired
    ServletContext context;

    @Override
    public Fichier addFile(MultipartFile file, Long idExercice) {


        String uploadRootPath = this.context.getRealPath("resources/uploads/exercice/"+idExercice+"/").toString();
        System.out.println("uploadRootPath=" + uploadRootPath);


        File uploadRootDir = new File(uploadRootPath);
        // Create directory if it not exists.
        if (!uploadRootDir.exists()) {
            uploadRootDir.mkdirs();
        }





       Exercice exercice=er.findById(idExercice).orElse(null);
       if(exercice==null) return null;

       try{

           if (file.isEmpty()) {
               System.out.println("Empty File");
           } else {
               byte[] bytes = file.getBytes();
               Path path = Paths.get(uploadRootPath + file.getOriginalFilename());
               System.out.println(Files.write(path, bytes));

               System.out.println("File successfully uploaded to local storage : " + file.getOriginalFilename());}


           Fichier f = new Fichier();
           f.setUploadDate(new Date());
           f.setFileName(file.getOriginalFilename());
           f.setFilePath(uploadRootPath+file.getOriginalFilename());
           f.setExercice(exercice);
           System.out.println(f.getFilePath());

           return fr.save(f);
       }catch (Exception e){
           System.out.println("Error Uploading file");
           return null;

       }

    }

    @Override
    public void removeFile(Long idFile, Long idExercice) {

    }

    @Override
    public List<Fichier> findAll() {
        return null;
    }

    @Override
    public Fichier getFileById(long id) {
        return fr.findById(id).orElse(null);
    }


}
