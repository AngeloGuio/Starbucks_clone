package pe.edu.cibertec.Starbucks_Clone.model.bd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tamanobebida")
public class TamanoBebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtamanobebida;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "volumen_ml")
    private String volumen_ml;
}
