package com.example.demo.controller;


import com.example.demo.nums.Cat;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@RestController
public class Controller {

    @Autowired
    private Gson gson;


    @GetMapping("/")
    public String index(){
        Cat cat = new Cat("cat1", "breed");
        Cat cat2 = new Cat("cat2", "breed");
        Cat cat3 = new Cat("cat3", "breed");
        Cat cat4 = new Cat("cat4", "breed");

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        return  gson.toJson(cats);
    }
    @GetMapping("/getrandomcat")
    public String getRandomCat(){
        Cat cat = new Cat("cat1", "breed");
        Cat cat2 = new Cat("cat2", "breed");
        Cat cat3 = new Cat("cat3", "breed");
        Cat cat4 = new Cat("cat4", "breed");

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        Collections.shuffle(cats);
        return  gson.toJson(cats.get(0));
    }

    @GetMapping("/hastanoserasedme")
    public String thanos(){
        double num = Math.random()*10;
        return num > 5 ? "Yes you are dead" : "Nah you are fine";
    }

    @GetMapping("/setname")
    public String setName(@RequestParam String name){
        Cat cat = new Cat(name, "breed");
        return  gson.toJson(cat);
    }

    @GetMapping("/setbreed")
    public String setBreed(@RequestParam String breed){
        Cat cat = new Cat("name", breed);
        return  gson.toJson(cat);
    }
}
