package com.duoc.escuela.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDto {
    private Integer id;

    private String nombre;

    private String rut;

    private Integer edad;

}
