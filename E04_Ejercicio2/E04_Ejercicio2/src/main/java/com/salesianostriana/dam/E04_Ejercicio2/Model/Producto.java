package com.salesianostriana.dam.E04_Ejercicio2.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String desc;
    private String pvp;
    private List<String> imagenes;
    @ManyToOne
    private Categoria categoria;

}
