package com.salesianostriana.dam.E04_Ejercicio2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductoDTO {

    private String nombre;
    private String pvp;
    private String imagen;
    private String categoria;

}



