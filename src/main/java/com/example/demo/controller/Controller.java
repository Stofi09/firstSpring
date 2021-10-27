package com.example.demo.controller;


import com.example.demo.nums.Cat;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Gson gson;


    @GetMapping("/")
    public String index(){
        Cat cat = new Cat("name4", "brdasdeed");
        return  gson.toJson(cat);
    }
}
