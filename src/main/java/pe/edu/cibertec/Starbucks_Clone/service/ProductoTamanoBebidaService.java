package pe.edu.cibertec.Starbucks_Clone.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.Starbucks_Clone.model.bd.ProductoTamanoBebida;
import pe.edu.cibertec.Starbucks_Clone.repository.ProductoTamanoBebidaRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class ProductoTamanoBebidaService implements IProductoTamanoBebidaService {

    private ProductoTamanoBebidaRepository productoTamanoBebidaRepository;

    @Override
    public List<ProductoTamanoBebida> listarProductoTamanoBebida() {
        return productoTamanoBebidaRepository.findAll();
    }
}
