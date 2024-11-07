package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @GetMapping("/")
    @ResponseBody
    public String holaMundo() {
        return "Hola Mundo PRIMER CAMBIO";
    }
}