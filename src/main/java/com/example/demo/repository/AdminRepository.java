package com.example.demo.repository;

import com.example.demo.model.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface AdminRepository extends CrudRepository<Admin,String> {
    public Admin findByPasswordAndAndUsername(String password,String username);
}
