package com.salesianostriana.dam.E04_Ejercicio2.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @ElementCollection
    private List<String> imagenes;
    @ManyToOne
    private Categoria categoria;




    public Producto(String nombre, String pvp, String categoria, String imagen) {
    }
}
