package com.example.api_mvc_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

    @GetMapping("/Hola")
    public String saludos(){
        return  "Hola UIA ...";
    }
}
