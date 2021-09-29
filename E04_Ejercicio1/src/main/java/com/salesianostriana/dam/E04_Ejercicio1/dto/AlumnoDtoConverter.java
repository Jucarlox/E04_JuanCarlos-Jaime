package com.salesianostriana.dam.E04_Ejercicio1.dto;

import com.salesianostriana.dam.E04_Ejercicio1.model.Alumno;
import org.springframework.stereotype.Component;

@Component
public class AlumnoDtoConverter {

    public Alumno createAlumnoDtoToMonumento(CreateAlumnoDto c) {
        return new Alumno(
                c.getNombre(),
                c.getApellido1(),
                c.getApellido2(),
                c.getEmail(),
                c.getTelefono(),
                c.getDireccionId(),
                c.getCursoId()
        );
    }

    public GetAlumnoDto alumnoToGetAlumnoDto(Alumno a) {
        return GetAlumnoDto
                .builder()
                .nombre(a.getNombre())
                .apellido1(a.getApellido1())
                .apellido2(a.getApellido2())
                .movil(a.getTelefono())
                .build();
    }


}
