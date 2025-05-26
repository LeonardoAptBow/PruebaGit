package com.ejemplo.primeraApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apisaludos")
public class SaludoController {

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola mundo!";
    }
}
