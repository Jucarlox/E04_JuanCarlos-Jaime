package com.salesianostriana.dam.E04_Ejercicio1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data@NoArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, apellido1, apellido2, telefono, email;

    @ManyToOne
    private Curso cuso;

    @ManyToOne
    private Direccion direccion;



    public Alumno(String nombre, String apellido1, String apellido2, String email, String telefono, Long direccionId, Long cursoId) {
    }
}
