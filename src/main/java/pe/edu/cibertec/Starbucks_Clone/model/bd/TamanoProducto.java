package pe.edu.cibertec.Starbucks_Clone.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tamanoprod")
public class TamanoProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtamanoprod;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "cantidad")
    private  String cantidad;
}
