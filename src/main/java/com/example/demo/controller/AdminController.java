package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    @Autowired
    AdminRepository adminRepository;
    @PostMapping("admin")
    public void addAdmin(@RequestBody Admin admin){
        adminRepository.save(admin);
    }
    @GetMapping("admin")
    @ResponseBody
    public Boolean signIn(@RequestBody Admin admin){
        Admin newAdmin=adminRepository.findByPasswordAndAndUsername(admin.getPassword(),admin.getUsername());
        if(newAdmin!=null){
            return true;
        }
        else{
            return false;
        }

    }


}
