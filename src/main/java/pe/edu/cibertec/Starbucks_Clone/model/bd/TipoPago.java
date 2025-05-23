package pe.edu.cibertec.Starbucks_Clone.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tipopago")
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipopago;
    @Column(name = "descripcion")
    private String descripcion;
}
