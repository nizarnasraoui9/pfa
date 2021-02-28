package com.example.demo.controller;

import com.example.demo.model.Image;
import com.example.demo.repository.ImageRepository;
import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class ImageController
{
    @Autowired
    ImageService imgService;
    @Autowired
    ImageRepository imgRepo;
    @PostMapping(path="image")
    public void uploadImag (@RequestParam("imageFile") MultipartFile imageFile) {
        String returnValue = "";
        try {
            String imagePath=imgService.saveImage(imageFile);
            Image img=new Image(imagePath);
            //imgRepo.save(imagePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @GetMapping("image")
    public String hello()
    {
        return "hello";
    }

    }



