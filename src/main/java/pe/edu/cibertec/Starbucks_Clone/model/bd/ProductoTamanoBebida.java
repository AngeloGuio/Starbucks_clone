package pe.edu.cibertec.Starbucks_Clone.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.text.DecimalFormat;

@Getter
@Setter
@Entity
@Table(name = "producto_tamanobebida")
public class ProductoTamanoBebida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproductoramanobebida;
    @ManyToOne
    @JoinColumn(name = "idproducto")
    private Producto idproducto;
    @ManyToOne
    @JoinColumn(name = "idtamanobebida")
    private TamanoBebida idtamanobebida;
    @Column(name = "precio_adicional")
    private Double precio_adicional;


}
