package pe.edu.cibertec.Starbucks_Clone.model.bd;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idproducto;
    @ManyToOne
    @JoinColumn(name = "idtipopro")
    private TipoProducto tipoproducto;
    @ManyToOne
    @JoinColumn(name = "idproveedor")
    private Proveedor proveedor;
    private String nombre;
    private Integer cantidad;
    private Double preciopublico;
    private Integer stockminimo;
    private Integer stockmaximo;
    @ManyToOne
    @JoinColumn(name = "codestado")
    private Estado estado;
    private Double precioproveedor;

    @OneToMany(mappedBy = "productos",
            cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private Set<DetallePago> venta = new HashSet<>();
}
