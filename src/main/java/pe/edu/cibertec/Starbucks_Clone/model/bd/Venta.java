package pe.edu.cibertec.Starbucks_Clone.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idventa;
    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;
    private Timestamp fecha;
    private String direccion;
    private BigDecimal montototal;
    @ManyToOne
    @JoinColumn(name = "idtipopago")
    private TipoPago tipopago;
    @OneToMany(mappedBy = "venta",
            cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<DetalleVenta> detallesVenta = new HashSet<>();
}
