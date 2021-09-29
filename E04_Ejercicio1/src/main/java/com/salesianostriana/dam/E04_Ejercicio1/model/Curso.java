package com.salesianostriana.dam.E04_Ejercicio1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data@NoArgsConstructor
public class Curso {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, tipo, tutor, aula;

    public Curso(String nombre, String tipo, String tutor, String aula) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tutor = tutor;
        this.aula = aula;
    }
}
