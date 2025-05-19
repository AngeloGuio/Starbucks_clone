package pe.edu.cibertec.Starbucks_Clone.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.Starbucks_Clone.exception.ResourceNotFoundException;
import pe.edu.cibertec.Starbucks_Clone.model.bd.TipoProducto;
import pe.edu.cibertec.Starbucks_Clone.model.response.ApiResponse;
import pe.edu.cibertec.Starbucks_Clone.service.ITipoProductoService;
import pe.edu.cibertec.Starbucks_Clone.service.TipoProductoService;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/tipoproducto")
public class TipoProductoController {

    private TipoProductoService TipoProductoService;

    @GetMapping("")
    public ResponseEntity<List<TipoProducto>> listarTipoProducto(){
      List<TipoProducto> tipoProductoList = new ArrayList<>(TipoProductoService.listarTipoProductos());
      if (tipoProductoList.isEmpty()){
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }
      return new ResponseEntity<>(tipoProductoList, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<TipoProducto> obtenerTipoProductoXID(
            @PathVariable Integer id){
        TipoProducto tipoProducto = TipoProductoService.obtenerTipoProductoxId(id).orElseThrow(
                ()->new ResourceNotFoundException("El tipo producto con el id "+id+" no existe")
        );
        return new ResponseEntity<>(tipoProducto,HttpStatus.OK);

    }

    @PostMapping("")
    public ResponseEntity<ApiResponse> nuevoResponseTipoProducto(@RequestBody TipoProducto tipoProducto){
        try {
            TipoProducto nuevoTipoProducto = TipoProductoService.guardarTipoProducto(tipoProducto);
            return ResponseEntity.ok(new ApiResponse(true, "Tipo Producto creado exitosamente"));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse(false, "Error al crear el tipo producto: " + e.getMessage()));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> actualizarResponseTipoProducto(@PathVariable Integer id, @RequestBody TipoProducto tipoProducto){
        try {
            TipoProducto actualizarTipoProducto = TipoProductoService.actualizarTipoProducto(id, tipoProducto);
            return ResponseEntity.ok(new ApiResponse(true, "Tipo Producto actualizado exitosamente"));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ApiResponse(false, "Error al actualizar el tipo producto: " + e.getMessage()));
        }

    }



}
