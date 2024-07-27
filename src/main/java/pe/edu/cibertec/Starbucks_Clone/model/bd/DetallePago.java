package pe.edu.cibertec.Starbucks_Clone.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "detalle_pago")
public class DetallePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpago;
    @OneToOne
    @JoinColumn(name = "idventa")
    private Venta venta;
    private String numerotarjeta;
    private Timestamp fechavencimiento;
    private Integer cvv;

}
