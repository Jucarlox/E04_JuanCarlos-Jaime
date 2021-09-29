package com.salesianostriana.dam.E04_Ejercicio1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class CreateAlumnoDto {

    private String nombre,  apellido1,  apellido2,  telefono,  email;
    private Long cursoId;
    private Long direccionId;

}
