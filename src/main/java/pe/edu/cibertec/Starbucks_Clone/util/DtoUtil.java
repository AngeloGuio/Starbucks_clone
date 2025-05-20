package pe.edu.cibertec.Starbucks_Clone.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import pe.edu.cibertec.Starbucks_Clone.model.bd.Producto;
import pe.edu.cibertec.Starbucks_Clone.model.dto.DtoEntity;
import pe.edu.cibertec.Starbucks_Clone.model.dto.ProductoDto;

@Component
public class DtoUtil {
    public DtoEntity convertirADto (Object obj, DtoEntity mapper) {
        return new ModelMapper().map(obj, mapper.getClass());
    }

    public Object convertirAEntity(Object obj, Class<Producto> mapper) {
        return new ModelMapper().map(mapper, obj.getClass());
    }



    public ProductoDto convertirADto(Producto producto, ProductoDto productoDto) {
        productoDto.setIdproducto(producto.getIdproducto());
        productoDto.setNombre(producto.getNombre());
        if (producto.getTipoProducto() != null) {
            productoDto.setIdtipopro(producto.getTipoProducto().getIdtipoproducto());
        }
        productoDto.setPrecio(producto.getPrecio());

        return productoDto;
    }
}
