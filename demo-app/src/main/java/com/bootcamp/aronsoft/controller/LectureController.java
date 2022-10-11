package com.bootcamp.aronsoft.controller;

import com.bootcamp.aronsoft.model.Lecture;
import com.bootcamp.aronsoft.model.Material;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/lecture")
public class LectureController {

    @GetMapping
    public List<Lecture> getAll(){
        return Arrays.asList(
                new Lecture(123,"Roni","Ciamis","Pria","S.Kom", "UTDI"),
                new Lecture(122,"Huzi","Ciamis","Pria","S.Pd", "UNY"),
                new Lecture(122,"Shahal","Balikpapan","Pria","S.St", "Poltek Surabaya")
        );
    }

    @GetMapping("/material")
    public List<Lecture> getMaterial(){
        return Arrays.asList(
                new Lecture(123,"Roni","Ciamis","Pria","S.Kom", "UTDI",
                        Arrays.asList(
                                new Material("MK001","Programming",3),
                                new Material("MK002","Database",3)
                        )),
                new Lecture(122,"Huzi","Ciamis","Pria","S.Pd", "UNY",
                        Arrays.asList(
                                new Material("MK003","Web Programming",3),
                                new Material("MK004","React Js",3)
                        )),
                new Lecture(122,"Shahal","Balikpapan","Pria","S.St", "Poltek Surabaya",
                        Arrays.asList(
                                new Material("MK005","Networking",3),
                                new Material("MK005","System Analyst",3)
                        )),
                new Lecture(122,"Rezal","Yogya","Pria","S.Kom", "UTDI"),
                new Lecture(122,"Topa","Ciamis","Pria","S.Kom", "UTDI", Collections.emptyList())
        );
    }
}
