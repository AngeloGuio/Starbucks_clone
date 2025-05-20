package pe.edu.cibertec.Starbucks_Clone.model.bd;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "idtipopro")
    private TipoProducto tipoProducto;
    private Double precio;
    private Integer stockminimo;
    private Integer stockmaximo;
    @ManyToOne
    @JoinColumn(name = "codestado")
    private Estado estado;





}
