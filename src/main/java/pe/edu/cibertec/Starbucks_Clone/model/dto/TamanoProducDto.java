package pe.edu.cibertec.Starbucks_Clone.model.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class TamanoProducDto {
    private Integer idtamanoprod;

    private String descripcion;

    private  String cantidad;
}
