package pe.edu.cibertec.Starbucks_Clone.service;

import pe.edu.cibertec.Starbucks_Clone.model.bd.Producto;

import java.util.List;
import java.util.Optional;

public interface IProducService {
    List<Producto> productoList();
    Optional<Producto> buscarProductoXID(Integer id);
    Producto agregarProducto(Producto producto);
    Producto findProductoById(Integer id);
}
