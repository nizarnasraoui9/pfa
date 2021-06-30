package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ImageService {
    public String saveImage(MultipartFile imageFile) throws Exception{
        String folder="./images/";
        byte[]bytes=imageFile.getBytes();
        Path path =Paths.get(folder+imageFile.getOriginalFilename());
        String imagePath=path.toString();
        Files.write(path,bytes);
        return imagePath;
    }
}
