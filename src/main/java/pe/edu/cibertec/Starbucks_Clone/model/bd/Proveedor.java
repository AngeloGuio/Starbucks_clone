package pe.edu.cibertec.Starbucks_Clone.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "proveedor")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproveedor;

    private String telefono;

    private  String direccion;

    private String empresa;

    private  String ruc;

    private String correo;

    private String representante;
}
