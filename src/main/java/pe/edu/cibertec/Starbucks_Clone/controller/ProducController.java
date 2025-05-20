package pe.edu.cibertec.Starbucks_Clone.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.Starbucks_Clone.model.dto.ProductoDto;
import pe.edu.cibertec.Starbucks_Clone.service.IProducService;
import pe.edu.cibertec.Starbucks_Clone.service.ProducService;
import pe.edu.cibertec.Starbucks_Clone.util.DtoUtil;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/producto")
public class ProducController {

    private IProducService iProducService;

    private ProducService producService;

    @GetMapping("/dto")
    public ResponseEntity<List<ProductoDto>> listarProductoDto() {
        List<ProductoDto> productDtoList = producService.productoList()
                .stream()
                .map(producto -> new DtoUtil().convertirADto(producto, new ProductoDto()))
                .collect(Collectors.toList());

        if (productDtoList.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(productDtoList, HttpStatus.OK);
    }

}
