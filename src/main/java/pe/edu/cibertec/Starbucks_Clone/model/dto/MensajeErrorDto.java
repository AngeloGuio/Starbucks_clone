package pe.edu.cibertec.Starbucks_Clone.model.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
public class MensajeErrorDto {
    private Integer codigoestado;
    private Date fechaerror;
    private String mensaje;
    private String descripcion;
}
