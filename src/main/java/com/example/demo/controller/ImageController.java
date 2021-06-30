package com.example.demo.controller;

import com.example.demo.model.Image;
import com.example.demo.model.Personne;
import com.example.demo.repository.ImageRepository;
import com.example.demo.repository.PersonneRepository;
import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ImageController {
    @Autowired
    ImageService imgService;
    @Autowired
    PersonneRepository personneRepo;
    @Autowired
    ImageRepository imgRepo;

    @PostMapping(path = "image/{id}")
    public void uploadImag(@RequestParam("imageFile") MultipartFile imageFile, @PathVariable("id") long id) {
        String returnValue = "";
        try {
            String imagePath = imgService.saveImage(imageFile);
            Image img = new Image(imagePath);
            Personne personne = personneRepo.findById(id);
            System.out.println(personne.getId());
            img.setPersonne(personne);
            imgRepo.save(img);
            System.out.println(personne.getImages());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




