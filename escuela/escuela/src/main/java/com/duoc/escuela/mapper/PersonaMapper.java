package com.duoc.escuela.mapper;

import com.duoc.escuela.dto.PersonaDto;
import com.duoc.escuela.model.Persona;

public class PersonaMapper {

    public static PersonaDto toDTO(Persona persona){
        return new PersonaDto(
                persona.getId(),
                persona.getNombre(),
                persona.getRut(),
                persona.getEdad()
        );
    }


    public static Persona toEntity(PersonaDto dto){
        return new Persona(
                dto.getId(),
                dto.getNombre(),
                dto.getRut(),
                dto.getEdad()
        );
    }

}
