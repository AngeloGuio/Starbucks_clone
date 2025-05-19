package pe.edu.cibertec.Starbucks_Clone.service;

import pe.edu.cibertec.Starbucks_Clone.model.bd.TipoProducto;

import java.util.List;
import java.util.Optional;

public interface ITipoProductoService {
    List<TipoProducto> listarTipoProductos();
    TipoProducto guardarTipoProducto(TipoProducto tipoProducto);
    Optional <TipoProducto> obtenerTipoProductoxId(Integer id);
}
