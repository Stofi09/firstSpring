package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/{id}")
    public String index2(@PathVariable String id){
        return "index " + id;
    }
}
