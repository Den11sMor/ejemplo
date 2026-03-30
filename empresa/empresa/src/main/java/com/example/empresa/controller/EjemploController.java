package com.example.empresa.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController
@RequestMapping("api/v1")
public class EjemploController {

    @GetMapping("/hola")
    public  String holaMundo(){
        return "Hola a todos....!!!";
    }
    @PostMapping("/hola")
    public ResponseEntity<String> recibirSaludo(@RequestBody Map<String, String> boby){
        String nombre = boby.get("nombre");
        return ResponseEntity.ok("Hola, " + nombre + " mensaje recibido...!!");
    }

}
