package pe.edu.cibertec.Starbucks_Clone.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tipoadicional")
public class TipoAdicional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtipoadicional;
    @Column(name = "nombre")
    private String nombre;
}
