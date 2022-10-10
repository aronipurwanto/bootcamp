package com.bootcamp.aronsoft.controller;

import com.bootcamp.aronsoft.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("home")
    public String index(){
        return "Hello";
    }

    @GetMapping("persons")
    public List<Person> getPerson(){
        List<Person> personList = new ArrayList<>();
        // membuat object person
        Person person = new Person();
        person.setNik(1234);
        person.setName("Hafiz");
        person.setAddress("Medan");
        person.setGender("Pria Perkasa");

        //tambahkan object person ke list
        personList.add(person);

        Person person2 = new Person();
        person2.setNik(1233);
        person2.setName("Todi");
        person2.setAddress("Medan");
        person2.setGender("Pria Penyayang");
        personList.add(person2);

        return personList;
    }
}
