package pe.edu.cibertec.Starbucks_Clone.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.Starbucks_Clone.model.bd.Producto;
import pe.edu.cibertec.Starbucks_Clone.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class ProducService implements IProducService{

    private ProductoRepository productoRepository;
    @Override
    public List<Producto> productoList() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> buscarProductoXID(Integer id) {
        return Optional.empty();
    }

    @Override
    public Producto agregarProducto(Producto producto) {
        return null;
    }

    @Override
    public Producto findProductoById(Integer id) {
        return null;
    }
}
