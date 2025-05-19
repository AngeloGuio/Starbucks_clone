package pe.edu.cibertec.Starbucks_Clone.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.Starbucks_Clone.model.bd.TipoProducto;
import pe.edu.cibertec.Starbucks_Clone.repository.TipoProductoRepository;
import pe.edu.cibertec.Starbucks_Clone.service.ITipoProductoService;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TipoProductoService implements ITipoProductoService {
    private TipoProductoRepository tipoProductoRepository;

    @Override
    public List<TipoProducto> listarTipoProductos() {
        return tipoProductoRepository.findAll();
    }

    @Override
    public TipoProducto guardarTipoProducto(TipoProducto tipoProducto) {
        return tipoProductoRepository.save(tipoProducto);
    }

    @Override
    public Optional<TipoProducto> obtenerTipoProductoxId(Integer id) {
        Optional<TipoProducto> tipoProducto = tipoProductoRepository.findById(id);
        if(tipoProducto.isEmpty()){
            return Optional.empty();
        }
        return tipoProducto;
    }
}
