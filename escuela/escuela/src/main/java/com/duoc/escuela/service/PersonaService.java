package com.duoc.escuela.service;

import com.duoc.escuela.dto.PersonaDto;
import com.duoc.escuela.mapper.PersonaMapper;
import com.duoc.escuela.model.Persona;
import com.duoc.escuela.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    public List<PersonaDto> obternerPersonas(){
        return personaRepository
                .findAll()
                .stream()
                .map(PersonaMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonaDto obtenerPersonaId(Integer id){
        Persona persona = personaRepository.findById(id).orElse(null);
                if (persona == null) return  null;
        return PersonaMapper.toDTO(persona);
    }

    public PersonaDto guardar(PersonaDto dto){
        Persona persona = PersonaMapper.toEntity(dto);
        Persona guardada = personaRepository.save(persona);
        return PersonaMapper.toDTO(guardada);
    }

    public PersonaDto actualizar(PersonaDto dto){
        Persona persona = PersonaMapper.toEntity(dto);
        Persona actualizarda = personaRepository.save(persona);
        return PersonaMapper.toDTO(actualizarda);
    }

    public void eliminar(Integer id){
        personaRepository.deleteById(id);
    }



}
