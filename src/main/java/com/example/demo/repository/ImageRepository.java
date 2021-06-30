package com.example.demo.repository;

import com.example.demo.model.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public interface ImageRepository extends CrudRepository<Image,Long> {
}
