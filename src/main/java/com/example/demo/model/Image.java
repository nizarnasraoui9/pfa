package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String path;
    private String description;
    @ManyToOne
    @JoinTable(name="id")
    private Personne personne;

    public Image() {
        this.path = null;
        this.description = null;
    }

    public Image(long id, String path, String description) {

        this.path = path;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}