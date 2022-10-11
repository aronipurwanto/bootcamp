package com.bootcamp.aronsoft.model;

public class Material {
    private String code;
    private String name;
    private int sks;

    public Material(String code, String name, int sks) {
        this.code = code;
        this.name = name;
        this.sks = sks;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }
}
