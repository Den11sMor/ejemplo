package com.duoc.escuela.controller;

import com.duoc.escuela.dto.PersonaDto;
import com.duoc.escuela.model.Persona;
import com.duoc.escuela.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")

public class PersonaController {
    @Autowired
    PersonaService  personaService;
    @GetMapping("/persona")
    public List<PersonaDto> ListarPersonas(){
        return personaService.obternerPersonas();
    }
    @GetMapping("/persona/{id}")
    public PersonaDto mostrarPersonaId (@PathVariable Integer id){
        return personaService.obtenerPersonaId(id);
    }
    @PostMapping("/persona")
    public  PersonaDto guardar(@RequestBody PersonaDto personaDto){
        return personaService.guardar(personaDto);
    }
    @PutMapping("/persona/{id}")
    public PersonaDto actualizar (@PathVariable  Integer id, @RequestBody PersonaDto personaDto){
        personaDto.setId(id);
        return personaService.actualizar(personaDto);
    }
    @DeleteMapping("/persona/{id}")
    public void eliminar (@PathVariable Integer id){
        personaService.eliminar(id);
    }


}
