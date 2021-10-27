package com.example.demo.controller;


import com.example.demo.nums.Cat;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Gson gson;


    @GetMapping("/")
    public String index(){
        Cat cat = new Cat("name4", "breed");
        return  gson.toJson(cat);
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
