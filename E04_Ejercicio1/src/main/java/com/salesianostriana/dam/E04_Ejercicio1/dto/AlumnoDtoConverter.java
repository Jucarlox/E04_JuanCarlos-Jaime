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

   /* public GetAlumnoDto alumnoToGetAlumnoDto(Alumno a) {
        return GetAlumnoDto
                .builder()
                .nombre(a.getNombre())
                .loc(a.getLoc())
                .ubicacion(String.format("%s (%s)", a.getCiudad(), a.getPais()))
                .categoria(a.getCategoria().getNombre())
                .build();
    */


}
