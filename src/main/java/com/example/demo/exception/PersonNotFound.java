package com.example.demo.exception;

public class PersonNotFound extends Exception{
    public PersonNotFound() {
        System.out.println("person not found");
    }
}
