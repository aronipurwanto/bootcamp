package com.bootcamp.aronsoft.model;

import java.util.List;

// inheritance
public class Lecture extends Person{
    private String title;
    private String university;
    private List<Material> materials;

    public Lecture(){

    }

    public Lecture(String title, String university) {
        this.title = title;
        this.university = university;
    }

    public Lecture(int nik, String name, String address, String gender, String title, String university) {
        super(nik, name, address, gender);
        this.title = title;
        this.university = university;
    }

    public Lecture(int nik, String name, String address, String gender,
                   String title, String university,
                   List<Material> materials) {
        super(nik, name, address, gender);
        this.title = title;
        this.university = university;
        this.materials = materials;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }
}
