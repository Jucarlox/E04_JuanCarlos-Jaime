package com.salesianostriana.dam.E04_Ejercicio2.DTO;


import com.salesianostriana.dam.E04_Ejercicio2.Model.Producto;
import org.springframework.stereotype.Component;

@Component
public class ProductoDtoConverter {

    public Producto createProductoDtoToProducto(CreateProductoDTO c){
        return  new Producto(
                c.getNombre(),
                c.getPvp(),
                c.getCategoria(),
                c.getImagen()
        );
    }

    public GetProductoDto monumentoToGetMonumentoDto(Producto p) {
        

        GetProductoDto result = new GetProductoDto();
        result.setNombre(p.getNombre());
        result.setPvp(p.getPvp());
        result.setCategoria(p.getCategoria().getNombre());
        return result;



    }
}
