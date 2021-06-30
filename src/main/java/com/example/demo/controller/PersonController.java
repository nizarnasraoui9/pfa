package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@ResponseBody
public class PersonController {
    @PutMapping(path = "modifyPerosn/{matricule}/{field}/{newValue}")
    public void modifyPerson(){

    }
}
