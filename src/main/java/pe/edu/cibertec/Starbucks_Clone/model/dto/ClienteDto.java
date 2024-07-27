package pe.edu.cibertec.Starbucks_Clone.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ClienteDto {
    private Integer idcliente;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String correo;
    private String dni;
}
