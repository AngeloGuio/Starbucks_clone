package pe.edu.cibertec.Starbucks_Clone.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.Starbucks_Clone.model.bd.ProductoTamanoBebida;
import pe.edu.cibertec.Starbucks_Clone.service.IProductoTamanoBebidaService;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/productotamanobebida")
public class ProductoTamanoBebidaController {

    private IProductoTamanoBebidaService iProductoTamanoBebidaService;

    @GetMapping("")
    public ResponseEntity<List<ProductoTamanoBebida>> litarProductotamanobebida() {
        List<ProductoTamanoBebida> productoTamanoBebidaList = new ArrayList<>(iProductoTamanoBebidaService.listarProductoTamanoBebida());
        if (productoTamanoBebidaList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(productoTamanoBebidaList, HttpStatus.OK);
    }
}
