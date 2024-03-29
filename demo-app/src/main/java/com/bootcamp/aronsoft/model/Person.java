package com.bootcamp.aronsoft.model;

// encapsulation
public class Person {
    // property
    private int nik;
    private String name;
    private String address;
    private String gender;

    public Person() {
    }

    public Person(int nik, String name, String address, String gender) {
        this.nik = nik;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    // method
    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
