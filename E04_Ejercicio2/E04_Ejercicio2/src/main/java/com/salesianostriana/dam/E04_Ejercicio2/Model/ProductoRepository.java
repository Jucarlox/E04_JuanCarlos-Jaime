package com.salesianostriana.dam.E04_Ejercicio2.Model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository
        extends JpaRepository<Categoria, Long> {
}