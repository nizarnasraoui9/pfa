package com.example.demo.repository;

import com.example.demo.model.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin,String> {
    public Admin findByPasswordAndAndUsername(String password,String username);
}
