package com.salesianostriana.dam.E04_Ejercicio1.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data@NoArgsConstructor
public class Direccion {

    @Id
    @GeneratedValue
    private Long id;


    private String tipoVia, linea1, linea2, cp, provincia;
    private int poblacion;

    public Direccion(String tipoVia, String linea1, String linea2, String cp, String provincia, int poblacion) {
        this.tipoVia = tipoVia;
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.cp = cp;
        this.provincia = provincia;
        this.poblacion = poblacion;
    }
}
