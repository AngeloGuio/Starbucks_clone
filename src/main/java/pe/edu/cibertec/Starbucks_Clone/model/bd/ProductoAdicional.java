package pe.edu.cibertec.Starbucks_Clone.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "producto_adicional")
public class ProductoAdicional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproductoadicional;
    @ManyToOne
    @JoinColumn(name = "idproducto")
    private Producto idproducto;
    @ManyToOne
    @JoinColumn(name = "idtipoadicional")
    private TipoAdicional idtipoadicional;
    @Column(name = "precio_adicional")
    private Double precio_adicional;
}
